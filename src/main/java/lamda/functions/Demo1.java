package functions;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[]args) {
        Function<Integer,Integer> f = n -> n*n;
        System.out.println(f.apply(5));
        System.out.println(f.apply(10));
        System.out.println(f.apply(12));


        // pass string as parameter and return length of string
        Function<String,Integer> pr = s -> s.length();
        System.out.println(pr.apply("Hello"));//5
    }

}

