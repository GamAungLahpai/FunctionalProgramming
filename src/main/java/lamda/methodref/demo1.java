package methodref;

import java.util.Arrays;
import java.util.List;

public class demo1 {
    public static void  main(String[]args){
        List<String> team  = Arrays.asList("Tasha", "John", "Gam", "Seng");
        team.sort(String::compareToIgnoreCase);
        System.out.println(team);

    }
}
