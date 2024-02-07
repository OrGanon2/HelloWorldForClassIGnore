import java.util.Calendar;
import java.util.Scanner;
//String name = input.nextLine();

public class Question2 {

    public static void main(String[] args) {
        //get current year
          int Currentyear = Calendar.getInstance().get(Calendar.YEAR);

     //Scanner input
        Scanner scanner = new Scanner(System.in);
        System.out.println("hI,how old are you?");
        int age = scanner.nextInt();
        //year of birth
        int birthYear = Currentyear - age;
        int futureAge = age + 20;

        //results
        System.out.println("that mean you were born in "  + birthYear );
        System.out.println("you will be "  + futureAge + " in the future");


   }
}
