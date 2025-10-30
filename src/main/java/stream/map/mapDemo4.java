package stream.map;

import java.util.Arrays;
import java.util.List;

class Employee {
    int empid;
    String empname;
    int salary;

    Employee(int empid, String empname, int salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empname + " (" + empid + ") - Salary: " + salary;
    }
}

public class mapDemo4 {
    static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(101,"Alex",10000),
                new Employee(102,"Brian",20000),
                new Employee(103,"Charles",30000),
                new Employee(104,"David",40000),
                new Employee(105,"Edward",50000)
        );
        employeeList.stream()
                .filter(e -> e.salary <= 20000)
                .map(e -> e.salary) // After map, the stream contains Integer (salary), not Employee objects
                .forEach(sal -> System.out.println(sal)); // We can't call sal.salary here because sal is already a number; printing works directly

        employeeList.stream()
                .filter(e -> e.salary <= 20000)
                // .map(e -> e.salary) // If we don't use map, the stream still contains Employee objects
                .forEach(System.out::println); // Printing the object directly calls toString(); without overriding toString(), it prints memory address

    }
}

