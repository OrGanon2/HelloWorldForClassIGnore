package ClassTasks;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        int age = input.nextInt();

//        String message = "";
//
//        if(age > 10){
//            message = "more then 10";
//        }
//        else{
//            message = "under 18";
//        }
        String message = ( age > 10) ? "more then 18" : "under 18";

        System.out.println(message );

    }
}
