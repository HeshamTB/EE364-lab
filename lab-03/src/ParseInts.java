import java.io.PrintStream;
import java.util.Scanner;

public class ParseInts {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        out.println("Enter a line of text: ");
        String line;
        Scanner scanLine = new Scanner(in.nextLine());
        int sum = 0;
        String inputBuffer = "";
        while (scanLine.hasNext()){
            try{
                inputBuffer = scanLine.next();
                if (inputBuffer != null){
                    int val = Integer.parseInt(inputBuffer);
                    sum += val;
                }
            }
            catch (NumberFormatException e){
                out.printf("Skipping %s. Not an Integer\n", inputBuffer);
            }
        }

        out.println("The sum of the integers on this line is " + sum);
    }
}
