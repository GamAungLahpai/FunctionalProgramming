package stream.map;
/*
 Find all length of element and push into other collection

 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapDemo2 {
    static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus","car","bicycle", "flight","train");
        List<Integer> vehiclesLength = vehicles.stream().map(vname -> vname.length()).collect(Collectors.toList());
        System.out.println(vehiclesLength);

    }


}
