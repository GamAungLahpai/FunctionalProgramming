package stream.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String sname;
    int sid;
    char grade;

    Student(String sname,int sid, char grade){
        this.sname=sname;
        this.sid =sid;
        this.grade=grade;

    }

}

public class flatMapDemo3 {
    static void main(String[] args) {
        List<Student> classA = Arrays.asList(
                new Student("Smith",101,'A'),
                new Student("John",102,'B'),
                new Student("Smith",101,'C')
        );

        List<Student> classB = Arrays.asList(
                new Student("Scott",104,'A'),
                new Student("Mary",105,'B'),
                new Student("Kitty",106,'C')
        );
        List<List<Student>> allStudentList = Arrays.asList(classA,classB);


        //To take all student name and put it in new collection then make upper case

        //Without Stream
        List<String> stuName = new ArrayList<>();
        for (List<Student> s:allStudentList){
            for (Student stu:s){
                stuName.add(stu.sname);
            }

        }
        System.out.println("Normal name without using stream: "  + stuName);
        // Normal name without using stream: [Smith, John, Smith, Scott, Mary, Kitty]

        List<String> stuNameUpperCase = new ArrayList<>();
        for(String upperName: stuName){
            stuNameUpperCase.add(upperName.toUpperCase());
        }
        System.out.println("After converting Upper case: " + stuNameUpperCase);
        // After converting Upper case: [SMITH, JOHN, SMITH, SCOTT, MARY, KITTY]

        //Using Stream
        List<String> stuName1 = allStudentList.stream().flatMap(stuList->stuList.stream().map(s->s.sname)).collect(Collectors.toList());
        System.out.println("Normal name  using stream: "  + stuName1);
        //Normal name  using stream: [Smith, John, Smith, Scott, Mary, Kitty]

        List<String> stuNameUpper = stuName1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println("After converting Upper case using stream: " + stuNameUpper);
        //After converting Upper case using stream: [SMITH, JOHN, SMITH, SCOTT, MARY, KITTY]


    }
}
