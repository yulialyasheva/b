package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Yulia Lyasheva", 3, 73.24);

        Student st2 = new Student("Petr Tomilov", 1, 67.47);
        Student st3 = new Student("Sngelina Krytaya", 4, 85.29);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents");
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
