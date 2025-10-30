package predicate;


import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;
    int experience;

    Employee(String name, int sal , int exp )
    {
        ename = name;
        salary = sal;
        experience = exp;
    }

}

public class Demo2 {
    public static void main(String[]args){

        //Example 1
        // Return the name on employee if salary> 30k && exp > 3
        Employee emp = new Employee("John",50000,5);
        Predicate<Employee> pr = e -> (e.salary>30000 && e.experience>3);
        System.out.println(pr.test(emp));


        // Example 2
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee("John", 50000, 5));
        arrayList.add(new Employee("David", 20000, 2));
        arrayList.add(new Employee("Scott", 30000, 3));
        arrayList.add(new Employee("Scott", 40000, 6));

        for(Employee e: arrayList){
            if(pr.test(e)){
                System.out.println(e.ename);
            }
        }

    }



    }

