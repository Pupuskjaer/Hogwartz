import java.util.Objects;

public class Griffindor extends Hogwarts{
    private byte nobility;
    private byte honor;
    private byte bravery;

    public byte getNobility() {
        return nobility;
    }

    public byte getHonor() {
        return honor;
    }

    public byte getBravery() {
        return bravery;
    }

    public static void compareTwoStudents(Griffindor student1,Griffindor student2) {
        int sum1 = student1.getBravery() + student1.getHonor() + student1.getNobility();
        int sum2 = student2.getBravery() + student2.getHonor() + student2.getNobility();
        if (sum1>sum2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        }
        else {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        }
    }

    public Griffindor(String name, int power, int transgressionDistance, byte nobility, byte honor, byte bravery) {
        super(name, power, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Ученик Гриффиндора: " + super.toString() + ", " +
                "Благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery;
    }
}
