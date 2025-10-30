package stream.filter;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo3 {
    static void main(String[] args) {
        List<String> words = Arrays.asList("cup",null,"forest","Sky","book",null,"theatre");
        List<String> result = words.stream().filter(w-> w != null).collect(Collectors.toList());
        System.out.println(result);
    }
}
