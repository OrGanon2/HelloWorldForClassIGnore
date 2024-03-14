package HomeTask;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello dear travller pick a number from 1 to 7 to know what day it is");
        String daytime;
        if(scanner.hasNextInt()){
            int day = scanner.nextInt();

            switch(day){
                case 1:
                    daytime = "Sunday";
                    break;
                case 2:
                    daytime = "Monday";
                    break;
                case 3:
                    daytime = "Tuesday";
                    break;
                case 4:
                    daytime = "Wensday";
                    break;
                case 5:
                    daytime = "Thurstday";
                    break;
                case 6:
                    daytime = "Friday";
                    break;
                case 7:
                    daytime = "Saturday";
                    break;
                default:
                    daytime = "not a day";
                    break;
            }
            System.out.println("today day is " + daytime);

        }else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
