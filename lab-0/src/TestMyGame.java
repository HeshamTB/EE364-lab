import java.util.Random;
import java.util.Scanner;

public class TestMyGame {
    public static void main(String args[]){

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int guess = 0, chances = 0;
        int randomValue = rand.nextInt(15) + 1;

        while (guess != randomValue){
            System.out.print("Guess any numeric value from 1 to 15 ");
            guess = input.nextInt();
            chances++;
        } // End while loop

        System.out.println("You won after " + chances + " try/tries");

    } //End of main method

} //End of TestMyGame class
