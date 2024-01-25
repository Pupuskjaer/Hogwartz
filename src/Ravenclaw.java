public class Ravenclaw extends Hogwarts{
    private byte intelligence;
    private byte wiseness;
    private byte wit;
    private byte creativity;

    public byte getIntelligence() {
        return intelligence;
    }

    public byte getWiseness() {
        return wiseness;
    }

    public byte getWit() {
        return wit;
    }

    public byte getCreativity() {
        return creativity;
    }

    public static void compareTwoStudents(Ravenclaw student1,Ravenclaw student2) {
        int sum1 = student1.getCreativity() + student1.getWit() + student1.getIntelligence() + student1.getWiseness();
        int sum2 = student2.getCreativity() + student2.getWit() + student2.getIntelligence() + student2.getWiseness();
        if (sum1>sum2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        }
        else {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        }
    }

    public Ravenclaw(String name, int power, int transgressionDistance, byte intelligence, byte wiseness, byte wit, byte creativity) {
        super(name, power, transgressionDistance);
        this.intelligence = intelligence;
        this.wiseness = wiseness;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ученик Когтеврана: " + super.toString() + ", " +
                " интеллект = " + intelligence +
                ", мудрость = " + wiseness +
                ", остроумие = " + wit +
                ", творчество = " + creativity;
    }
}
