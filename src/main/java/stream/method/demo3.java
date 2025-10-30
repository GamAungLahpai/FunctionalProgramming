package stream.method;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// reduce (combine objects into one single object)
public class demo3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A","B","C","1","2","3");
        Optional<String> reduce = stringList.stream().reduce((value, combinedvalue) -> {
            return combinedvalue + value;
        });
        System.out.println(reduce.get());

        List<Integer> number = Arrays.asList(2,3,4,5);
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);



    }
}
