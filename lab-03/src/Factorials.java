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
            catch (IllegalArgumentException ex){ //use of polymorphism since 'ex' can be an instance of one of two classes
                System.out.println(ex.getMessage() + String.format(" (%d) (%s)", val, ex.getClass()));
            }

            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }

    private static int factorial(int value) throws IllegalArgumentException {
        if (value < 0) throw new IllegalFactorialException("Can not calculate a negative factorial", value);
        if (value > 16) throw  new IllegalArgumentException("Can not calculate factorials for value over 16");
        for (int i = value - 1; i > 0; i--){
            value *= i;
        }
        return value;
    }

    private static class IllegalFactorialException extends IllegalArgumentException {

        private int value;

        public IllegalFactorialException(String s, int value) {
            super(s);
            this.value = value;
        }

        public IllegalFactorialException(int value) {
            this(null, value);
        }

        public int getIllegalValue() {
            return value;
        }

    }
}