package Task2;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Student> students;

    public Faculty(String name){
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }
}
