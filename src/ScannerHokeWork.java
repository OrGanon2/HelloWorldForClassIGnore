import java.util.Scanner;

//psvm public main in string[] array(args)
//sout system.out.
public class ScannerHokeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = input.nextLine();
        System.out.println("my name is " + name);
    }
}
