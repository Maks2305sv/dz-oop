import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String multiplicationTable(int chislo) {
        if (chislo < 0 && chislo <= 10) throw new IllegalArgumentException("error");
        String resault = new String();
        for (int i = 1; i < 11; i++) {
            StringBuilder itteratia = new StringBuilder(Integer.toString(chislo) + " * " + Integer.toString(i) + " = " + Integer.toString(chislo * i));
            resault += String.join(resault, itteratia.toString()) + System.lineSeparator();  //подсмотрел lineSeparator
        }
        return resault;
    }

    public static String numberOrder(int chislo) {
        if (chislo < 0 && chislo <= 100) throw new IllegalArgumentException("error");
        StringBuilder resault = new StringBuilder();
        for (int i = 1; i <= chislo; i++) resault = new StringBuilder(resault + Integer.toString(i) + " ");
        return resault.toString();
    }

    public static String ToListOfStudents(String s) {
        StringBuilder resault = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) resault=new StringBuilder(resault+" "+s.charAt(i));
            else resault=new StringBuilder(resault+""+s.charAt(i));
        }
        String[] matrix = resault.toString().trim().replaceAll("\\s+"," ").split(" ");
        s = new String();
        for (String str : matrix) {
            s += String.join(s, System.lineSeparator() + str);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Задачи на Stringbuilder

        //Задача1
//        int n = sc.nextInt();
//        System.out.println(multiplicationTable(n));

        //Задача2
//        int n = sc.nextInt();
//        System.out.println(numberOrder(n));

        //Задача3
//        String stroka = sc.nextLine();
//        System.out.println(ToListOfStudents(stroka));





        //Задачи на классы
        //1
//        Person maks=new Person(sc.nextLine(), sc.nextInt());
//        maks.Introduce();




        //2
//        Book prestuplenieAndNakazanie= new Book("Преступление и наказание","Достоевский",1866);
//        prestuplenieAndNakazanie.getBookInfo();




        //3
//        Car dreamCar=new Car("Kia","Rio",2009,450000);
//        dreamCar.getCarDetails();


        //4
//        Student maks=new Student("Maks",19,3.79);
//        maks.getStudentInfo();


        //5
//        Rectangle fotoNaPasport=new Rectangle(3,4);
//        System.out.println(fotoNaPasport.calculateArea());


    }
}