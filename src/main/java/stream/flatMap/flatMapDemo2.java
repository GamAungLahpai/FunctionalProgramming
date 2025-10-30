package stream.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapDemo2 {
    static void main(String[] args) {
        List<String> teamA = Arrays.asList("scott","David","John");
        List<String> teamB = Arrays.asList("Mary","Luna","Tom");
        List<String> teamC = Arrays.asList("Ken","Johny","Kitty");



        List <List<String>>playerInWorldCup = Arrays.asList(teamA,teamB,teamC);

        // with stream flat map

        List<String> result1 = playerInWorldCup.stream().
                flatMap(n->n.stream()).
                collect(Collectors.toList());

        System.out.println(result1);



        //Before stream
        List<String> result = new ArrayList<>();

        for(List<String> team :playerInWorldCup ){
            for(String name:team){
                result.add(name);
            }
        }
        System.out.println(result);





    }
}
