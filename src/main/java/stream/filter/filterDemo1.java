package stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filterDemo1 {
    static void main(String[] args) {
        /*
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(15);
        numberList.add(20);
        numberList.add(30);
        */

        List <Integer> numberList = Arrays.asList(10,15,20,25,30);
        List <Integer> evenNumberList = new ArrayList<Integer>();

        /*
        // Without stream
        for(int m:numberList){
            if(m%2 == 0)
                evenNumberList.add(m);
        }
        System.out.println(evenNumberList );
         */

        /*
        evenNumberList  = numberList.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println(evenNumberList);// Filter is predicate and return boolean
        //add collection to stream and then filter, collect the filtered data and put in another list
        */
        //numberList.stream().filter(n->n%2==0).forEach(n-> System.out.println(n)); // For each method is consumer just consume this one do not store anyting
        numberList.stream().filter(n->n%2==0).forEach(System.out::println);


    }
}
