package Task2;

import Task1_3.Enrollee;

import java.util.Comparator;

public class Student {
    private String firstName;
    private String secondName;
    private int numberOfDocument;
    private double averageRate;

    public Student(String firstName, String secondName, int numberOfDocument, double averageRate){
        this.averageRate = averageRate;
        this.firstName = firstName;
        this.numberOfDocument = numberOfDocument;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getNumberOfDocument() {
        return numberOfDocument;
    }

    public double getAverageRate() {
        return averageRate;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", numberOfDocument=" + numberOfDocument +
                ", averageRate=" + averageRate;
    }

    public static Comparator<Student> enrolleeComparatorBySecondName = (s1, s2) -> s1.secondName.compareTo(s2.secondName);
    public static Comparator<Student> enrolleeComparatorByFirstName = (s1, s2) -> s1.firstName.compareTo(s2.firstName);
    public static Comparator<Student> enrolleeComparatorByNumberOfDocument = (s1, s2) -> Integer.compare(s1.numberOfDocument, s2.numberOfDocument);
}
