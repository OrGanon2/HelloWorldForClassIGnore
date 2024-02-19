package ClassTasks;

import java.util.Scanner;

public class IfElseTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number : ");
        int userNumber = input.nextInt();

        if(userNumber == 0){
            System.out.println("the number is zero");
        }
        else if(userNumber % 2 == 0) {
            System.out.println("a number "+ userNumber + " is even");

        }
        else{
            System.out.println("its number " + userNumber + " is odd");
        }
    }
}
