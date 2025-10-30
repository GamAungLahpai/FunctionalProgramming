package predicate;


import java.util.function.Predicate;


//   Predicate---> take only one parameter returns boolean
//   use only if you have conditional checks in your program
public class Demo1 {
    public static void main(String[]args){
        // Example 1
        Predicate<Integer> p = (i) -> (i>10);
        System.out.println(p.test(20));
        System.out.println(p.test(5));

        // Example 2
        Predicate<String> sr = (s) -> (s.length() > 4);
        System.out.println(sr.test("Gamaung"));
        System.out.println(sr.test("Gam"));


        // Example 3
        String names [] = {"David" , "Scott", "Smith" , "John" , "Mary"};

        for (String name:names){
            if(sr.test(name)){
                System.out.println(name);
            }
            /*
            if(name.length() >4 ){
                System.out.println(name);
            }
            */

        }
    }
}
