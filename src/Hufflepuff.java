public class Hufflepuff extends Hogwarts{
    private byte hardworking;
    private byte loyalty;
    private byte honesty;

    public byte getHardworking() {
        return hardworking;
    }

    public byte getLoyalty() {
        return loyalty;
    }

    public byte getHonesty() {
        return honesty;
    }

    public static void compareTwoStudents(Hufflepuff student1,Hufflepuff student2) {
        int sum1 = student1.getHonesty() + student1.getHardworking() + student1.getLoyalty();
        int sum2 = student2.getHonesty() + student2.getHardworking() + student2.getLoyalty();
        if (sum1>sum2) {
            System.out.println(student1.getName() + " лучший ученик Пуффендуя, чем " + student2.getName());
        }
        else {
            System.out.println(student2.getName() + " лучший ученик Пуффендуя, чем " + student1.getName());
        }
    }

    public Hufflepuff(String name, int power, int transgressionDistance, byte hardworking, byte loyalty, byte honesty) {
        super(name, power, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Ученик Пуффендуя: " + super.toString() + ", " +
                "трудолюбие = " + hardworking +
                ", верность = " + loyalty +
                ", честность = " + honesty;
    }
}
