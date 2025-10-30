package stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapDemo3 {
    static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(2,3,4,5);
        List<Integer> multipliedList = new ArrayList<>();

       multipliedList=  numbersList.stream().map(num->num*3).collect(Collectors.toList());
        System.out.println(multipliedList);
    }
}
