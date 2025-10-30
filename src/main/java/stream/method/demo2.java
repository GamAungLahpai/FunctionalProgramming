package stream.method;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class demo2 {
    public void main(String[] args) {

        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        long numbers_of_evenNum = numberList.stream().filter(num-> num%2 ==0).count();
        System.out.println(numbers_of_evenNum);

        // min()
        Optional<Integer> min = numberList.stream().min((val1, val2)->{
            return val1.compareTo(val2);
        });
        System.out.println(min.get());

        //max
        Optional<Integer> max = numberList.stream().max(Integer::compareTo); //Using lambda Method references
       // System.out.println(max.get());


    }
}
