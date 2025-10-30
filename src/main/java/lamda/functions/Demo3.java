package functions;

import java.util.function.Function;

public class Demo3 {
    public static void main(String[]args) {
        Function<Integer,Integer> f1 = n-> n*2;
        Function<Integer,Integer> f2 = n -> n*n*n;

        System.out.println(f1.andThen(f2).apply(2));//64 f1 is 4 and in f2 n=4 and 4 to the power 3
        System.out.println(f1.compose(f2).apply(2));//16 in reverse order f2 will take first and then it will pass in to f1
    }

}

