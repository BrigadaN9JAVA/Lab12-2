package Task1_3;

import java.util.Comparator;

public class Enrollee {
    private String name;
    private double rate;

    public Enrollee(String name, double rate){
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public static Comparator<Enrollee> enrolleeComparatorByName = (e1, e2) -> e1.name.compareTo(e2.name);
    public static Comparator<Enrollee> enrolleeComparatorByRate = (e1, e2) -> Double.compare(e1.rate, e2.rate);

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", rate=" + rate;
    }
}
