public class Slytherin extends Hogwarts{
    private byte trick;
    private byte determination;
    private byte ambition;
    private byte quickWit;
    private byte thirstForPower;

    public byte getTrick() {
        return trick;
    }

    public byte getDetermination() {
        return determination;
    }

    public byte getAmbition() {
        return ambition;
    }

    public byte getQuickWit() {
        return quickWit;
    }

    public byte getThirstForPower() {
        return thirstForPower;
    }

    public static void compareTwoStudents(Slytherin student1,Slytherin student2) {
        int sum1 = student1.getAmbition() + student1.getQuickWit() + student1.getDetermination() +
                   student1.getTrick() + student1.getThirstForPower();
        int sum2 = student2.getAmbition() + student2.getQuickWit() + student2.getDetermination() +
                   student2.getTrick() + student2.getThirstForPower();
        if (sum1>sum2) {
            System.out.println(student1.getName() + " лучший ученик Слизерина, чем " + student2.getName());
        }
        else {
            System.out.println(student2.getName() + " лучший ученик Слизерина, чем " + student1.getName());
        }
    }

    public Slytherin(String name, int power, int transgressionDistance, byte trick, byte determination, byte ambition, byte quickWit, byte thirstForPower) {
        super(name, power, transgressionDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.quickWit = quickWit;
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "Ученик Слизерина " + super.toString() + ", " +
                "хитрость = " + trick +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                ", сообразительность = " + quickWit +
                ", жажда власти = " + thirstForPower;
    }

}
