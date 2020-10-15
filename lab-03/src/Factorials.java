import java.util.Scanner;


public class Factorials{
    public static void main(String args[]){

        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);

        while (keepGoing.equals("y") || keepGoing.equals("Y")){

            System.out.print("Enter an integer: ");
            int val = scan.nextInt();
            try {
                System.out.println("Factorial(" + val + ") = " + factorial(val));
            }
            catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage() + String.format(" (%d)", val));
            }

            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }

    private static int factorial(int value) throws IllegalArgumentException {
        if (value < 0) throw new IllegalArgumentException("Can not calculate a negative factorial");
        if (value > 16) throw  new IllegalArgumentException("Can not calculate factorials for value over 16");
        for (int i = value - 1; i > 0; i--){
            value *= i;
        }
        return value;
    }
}