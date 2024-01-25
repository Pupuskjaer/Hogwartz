import java.util.Objects;

public class Hogwarts {
    private final String name;
    private int power;
    private int transgressionDistance;

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public static void compareTwoStudentsByPower(Hogwarts student1, Hogwarts student2) {
        if (student1.getPower() > student2.getPower()) {
            System.out.println(student1.getName() + " сильнее по мощности магии, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " сильнее по мощности магии, чем " + student1.getName());

        }
    }public static void compareTwoStudentsByTD(Hogwarts student1, Hogwarts student2) {
        if (student1.getTransgressionDistance() > student2.getTransgressionDistance()) {
            System.out.println(student1.getName() + " лучший по трангрессии , чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший по трансгрессии, чем " + student1.getName());

        }
    }

    public Hogwarts(String name, int power, int transgressionDistance) {
        this.name = name;
        this.power = power;
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return  "Имя - " + name +
                ", мощь = " + power +
                ", расстояние трангрессии = " + transgressionDistance;
    }
}
