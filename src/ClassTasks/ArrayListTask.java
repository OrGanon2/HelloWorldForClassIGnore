package ClassTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();

        
        System.out.println("enter number 1: ");
        arrayList.add(scanner.nextInt());

        System.out.println("enter number 2: ");
        arrayList.add(scanner.nextInt());

        System.out.println("enter number 3: ");
        arrayList.add(scanner.nextInt());

        scanner.close();






    }
}
