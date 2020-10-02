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
        try{
            while (scanLine.hasNext()){
                int val = Integer.parseInt(scanLine.next());
                sum += val;
            }
        }
        catch (NumberFormatException e){
            //pass
        }

        out.println("The sum of the integers on this line is " + sum);
    }
}
