package predicate;

//Joining Predicate - and, or, negative
// p1 checks number is even
// p2 checks greater than 50


import java.sql.SQLOutput;
import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[]args){
        int[] i = new int[12];
        i[1] = 15;
        i[2] = 55;
        i[3] = 20;
        i[4] = 25;
        i[0] = 5;
        i[5] = 30;
        i[6] = 35;
        i[7] = 40;
        i[8] = 45;
        i[9] = 50;
        i[10] = 65;
        i[11] = 60;

        Predicate<Integer> p1 = e -> (e%2 == 0);
        Predicate<Integer> p2 = s -> (s > 20);

        System.out.println("These are numbers which are evan and also greather than 50....");

        /*for(Integer a: i){
            //if(p1.test(a) && p2.test(a))
            if(p1.and(p2).test(a)){
                System.out.println(a);
            }

        }*/

        for(Integer a: i){
            //if(p1.test(a) || p2.test(a))
            if(p1.or(p2).test(a)){
                System.out.println(a);
            }

        }


    }
}
