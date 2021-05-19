package Task1_3;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Enrollee> enrollees = Arrays.asList(new Enrollee("Kravchuk", 90),
                new Enrollee("Petrenko", 50), new Enrollee("Potapenko", 70),
                new Enrollee("Madyar", 85), new Enrollee("Kovalenko", 63),
                new Enrollee("Antonenko", 62));
        Test.otherEnrollee(enrollees, 1, 2);

        System.out.println();
        System.out.println("==============================");
        System.out.println();

        List<Enrollee> enrolleeList= Test.collectEnrollees(enrollees, 1, 2);
        enrolleeList.stream()
                .forEach(System.out::println);
    }

    public static void otherEnrollee(Collection<Enrollee> enrollees, int placeForContract, int placeForBudget){
        enrollees.stream()
                .sorted(Enrollee.enrolleeComparatorByRate.reversed())
                .filter((e) -> e.getRate() >= 60)
                .skip(placeForBudget+placeForContract)
                .sorted(Enrollee.enrolleeComparatorByName)
                .forEach(System.out::println);
    }

    public static List<Enrollee> collectEnrollees(Collection<Enrollee> enrollees, int placeForContract, int placeForBudget){
        List<Enrollee> finishEnrollee = enrollees.stream()
                .filter((e) -> e.getRate()<60)
                .collect(Collectors.toList());
        return finishEnrollee;
    }
}
