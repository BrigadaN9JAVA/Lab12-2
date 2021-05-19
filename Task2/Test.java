package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Institut FICT = new Institut("FICT");

        Faculty AUTS = new Faculty("AUTS");
        Faculty TK = new Faculty("TK");
        Faculty OT = new Faculty("OT");

        AUTS.addStudent(new Student("Vlad", "Kravchuk", 111111, 90.5));
        AUTS.addStudent(new Student("Bohdan","Gurov", 222222, 60.0));
        AUTS.addStudent(new Student("Denys","Onyskiv", 333333, 90.0));

        TK.addStudent(new Student("Vasya","Pupkin", 444444, 65.0));
        TK.addStudent(new Student("Ehor","Hnitiy", 555555, 100.0));

        OT.addStudent(new Student("Sashka","Dron", 666666, 95.0));
        OT.addStudent(new Student("Iryna","Telesnenko", 777777, 80.0));

        FICT.addFaculty(AUTS);
        FICT.addFaculty(TK);
        FICT.addFaculty(OT);

        Test.displayInstitut(FICT);
    }

    static void displayInstitut(Institut institut){
        List<Student> students = new ArrayList<>();
        institut.getFaculties().stream()
                .map((f) -> students.addAll(f.getStudents()))
                .forEach((f) -> System.out.print(""));
        students.stream()
                .sorted(Student.enrolleeComparatorBySecondName.thenComparing(Student.enrolleeComparatorByFirstName.thenComparing(Student.enrolleeComparatorByNumberOfDocument)))
                .forEachOrdered(System.out::println);
    }
}
