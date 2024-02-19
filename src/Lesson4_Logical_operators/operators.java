package Lesson4_Logical_operators;

public class operators {
    public static void main(String[] args) {
        System.out.println((0 > 5 && 6 > 5) || 7 == 7);
        System.out.println(0 > 5 && (6 > 5 || 7 == 7));
        System.out.println(0 > 5 && 6 > 5 || 7 == 7);
        System.out.println(0 > 5 || 6 > 5 && 7==7);
        System.out.println(2 < 5 == true && 10 >= 10);
    }
}
