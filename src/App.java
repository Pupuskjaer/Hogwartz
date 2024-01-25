// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    // Ученики Гриффиндора
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Гарри Поттер", 186, 867, (byte) 89, (byte) 95, (byte) 91);
        Griffindor hermioneGranger = new Griffindor("Гермиона Грейнджер", 125, 568, (byte) 88, (byte) 91, (byte) 96);
        Griffindor ronWeasley = new Griffindor("Рон Уизли", 98, 126, (byte) 91, (byte) 96, (byte) 79);
        // Ученики Пуффендуя
        Hufflepuff zacharySmith = new Hufflepuff("Захария Смит", 134, 254, (byte) 88, (byte) 78, (byte) 89);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 171, 755, (byte) 91, (byte) 92, (byte) 86);
        Hufflepuff justinFinchFletchley = new Hufflepuff(" Джастин Финч-Флетчли", 109, 126, (byte) 85, (byte) 88, (byte) 79);
        // Ученики Слизерина
        Slytherin drakoMalfoy = new Slytherin("Драко Малфой",178,456,(byte)91,(byte)92,(byte)95,(byte)88,(byte)83);
        Slytherin grahamMontegue = new Slytherin("Грэхэм Монтегю",164,275,(byte)88,(byte)86,(byte)75,(byte)83,(byte)75);
        Slytherin gregoryGoyle = new Slytherin("Грэгори Гойл",85,102,(byte)86,(byte)84,(byte)73,(byte)76,(byte)65);
        // Ученики Когтеврана
        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг", 99, 120, (byte) 89, (byte) 75, (byte) 91, (byte) 88);
        Ravenclaw padmePatil = new Ravenclaw("Падма Патил", 120, 101, (byte) 91, (byte) 86, (byte) 72, (byte) 75);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 98, 203, (byte) 88, (byte) 76, (byte) 90, (byte) 84);
        System.out.println(harryPotter.toString());
        System.out.println(hermioneGranger.toString());
        System.out.println(drakoMalfoy.toString());
        System.out.println(choChang.toString());
        System.out.println(cedricDiggory.toString());
        Griffindor.compareTwoStudents(harryPotter, hermioneGranger);
        Hufflepuff.compareTwoStudents(zacharySmith,cedricDiggory);
        Ravenclaw.compareTwoStudents(choChang,padmePatil);
        Slytherin.compareTwoStudents(drakoMalfoy,grahamMontegue);
        Hogwarts.compareTwoStudentsByPower(harryPotter,drakoMalfoy);
        Hogwarts.compareTwoStudentsByTD(harryPotter,drakoMalfoy);
    }

}