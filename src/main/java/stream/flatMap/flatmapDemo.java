package stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmapDemo {
    static void main(String[] args) {
        // Map
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = list1.stream().map(n->n+10).collect(Collectors.toList());
        System.out.println(list2);

        //flatMap
        List<Integer> lst1 = Arrays.asList(1,2);
        List<Integer> lst2 = Arrays.asList(3,4);
        List<Integer> lst3 = Arrays.asList(5,6);

        List<List<Integer>> finalList = Arrays.asList(lst1,lst2,lst3);
        System.out.println("Without flatmap : " + finalList);
        List <Integer> finalresults = finalList.stream().flatMap(ls->ls.stream().map(n->n+10)).collect(Collectors.toList());
        System.out.println("with flat map and also add 10 to each : " + finalresults);


    }
}
