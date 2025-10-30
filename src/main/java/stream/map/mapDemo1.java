package stream.map;
/*
convert all string into upper case and store in new collection and print it

 */
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapDemo1  {
    static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus","car","bicycle", "flight","train");
        List<String > vehicleListinUpperCase = new ArrayList<>();

        //Without stream concept
        /*
        for(String name: vehicles){
            vehicleListinUpperCase.add(name.toUpperCase());
        }
        System.out.println(vehicleListinUpperCase);
        */
        vehicleListinUpperCase = vehicles.stream().map(str-> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(vehicleListinUpperCase);
    }

}
