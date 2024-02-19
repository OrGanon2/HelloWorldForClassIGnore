import java.util.Scanner;


public class CheckNumbersGame {
    //    Game of even & odds if you see this netanel it is not complete still building
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("lets play a game of odd or even.");
            //1) first game of module %
            System.out.println("enter a number from 1 to 10");

            if (scanner.hasNextInt()) {
                 userInput = scanner.nextInt();
                if (userInput % 2 == 0) {
                    System.out.println(" it is even~ " + userInput);
                    System.out.println("press space to continue ");
                    scanner.hasNext();
                } else {
                    System.out.println(" it is odd~ " + userInput);
                    System.out.println("press any key to continue ");
                    scanner.hasNext();
                }
            } else {
                System.out.println("not a number lets restart");
                scanner.next();
                userInput = 0;
            }if(userInput > 10 || userInput < 1){
                System.out.println("its from 1 to 10 ");
                scanner.next();
                userInput = 0;
            }

            //1) Ends here
            System.out.println("is 25 is odd or even type yes/no?");
           /* if (scanner.hasNext() == yes){



            }*/
            scanner.hasNext();


        }while (userInput == 0);
    }
}
