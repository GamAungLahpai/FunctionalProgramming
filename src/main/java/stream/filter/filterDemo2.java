package stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo2 {
    static void main(String[] args) {
        List<String> names = Arrays.asList("Melisandre","Sansa","John", "Daenerys" , "Joffery");
        List<String> longnames = new ArrayList<>();

        longnames= names.stream().filter(str -> str.length()>6 && str.length()<8).collect(Collectors.toList()); // To store in another list only need .filter(Predicate Boolean)
        System.out.println(longnames);

        names.stream().filter(str -> str.length()>6 && str.length()<8).forEach(str-> System.out.println(str));// just filter and print filtered num(Both .filter & .forEach)

        names.stream().filter(str -> str.length()>6 && str.length()<8).forEach(System.out::println);


    }
}
