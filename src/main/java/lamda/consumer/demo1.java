package consumer;

import java.util.function.Consumer;

public class demo1 {
    public static void main(String[]args){
        Consumer<String> c= s-> System.out.println(s);
        c.accept("WELCOME");
    }
}
