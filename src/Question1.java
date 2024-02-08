import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("hi what is your age?");

        //input your response
        Scanner scanner = new Scanner(System.in); // try to initiate the scanner class before the print, when you writing code and you need to use few classes/libraries, try to initate them in the start of the file.

        int age = scanner.nextInt();
        System.out.println("well then your age is "+ age);




    }
}
