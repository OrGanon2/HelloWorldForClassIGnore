package ClassTasks;

import java.util.ArrayList;

public class FunctionsTask {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        printNumbers(numbers);
    }
    public static void printNumbers(int[] numberList){
        ArrayList<Integer> newNumberList = new ArrayList<>();
        for (int number : numberList){
            newNumberList.add(number);

        }
        System.out.println(newNumberList);



    }


}
