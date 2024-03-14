package HomeTask;

import java.util.Scanner;

public class ComparisonTask {
    public static void main(String[] args) {
    //num1 is bigger then num2
     int num1,num2;
    boolean result;

    num1 = 10;
    num2 = 6;
    result = num1 > num2;

    System.out.println(result);
    //num1 is bigger or equal to num2
    num1 = 5;
    num2 = 5;
    result = num1 >= num2;
    System.out.println(result);
    //num1 is smaller or equal to num2
        num1 = 20;
        num2 = 10;
        result = num1<=num2;
        System.out.println(result);
    //num1 is smaller or equal to num2
        num1 = 35;
        num2 = 50;
        result = num1<=num2;
        System.out.println(result);

    //num1 is equal to num2
        num1 = 25;
        num2 = 25;
        result = num1 == num2;
        System.out.println(result);
    //city is equal to city
        boolean City = true;
        System.out.println("city is " + City);
    //string City  is equal to string with capitals
        String city1 = "City";
        String City2 = "ciTY";
        result = city1.equalsIgnoreCase(City2);
        System.out.println("Capital citys are equally" +result);



    }
}
