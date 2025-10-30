package stream.method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
NonTerminal
 distinct - remove duplicate
 limit

 */

//terminal
// count always return long
// forEach

public class demo1 {
    public static void main(String[] args) {
        List<String> vehicalList = Arrays.asList("bus","car","bycle","bus","car","car","bike");

        // distinct - remove duplicate
        List<String> distinctVehicle  = vehicalList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctVehicle);//[bus, car, bycle, bike]

        // forEach
        vehicalList.stream().distinct().forEach(System.out::println);

        //count
        long count = vehicalList.stream().distinct().count();
        System.out.println(count);

        //Limit
        List<String> limitedVehicle= vehicalList.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitedVehicle);
    }
}
