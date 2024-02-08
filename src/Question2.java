import java.util.Calendar;
import java.util.Scanner;
//String name = input.nextLine(); // Try not to leave un-used command in your code.

//!! General question. from where did you get this question from in the second presentation?

public class Question2 { // Call the class the same as the presentation tells you, so i can refer to the question more easeily -- This should be called MySecondTask

    public static void main(String[] args) {
        //get current year
          int Currentyear = Calendar.getInstance().get(Calendar.YEAR); // Very nice! i'm glad you used it although you didn't need to. very good job.

     //Scanner input // Very nice on the comments. 
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
