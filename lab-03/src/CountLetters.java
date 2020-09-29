import java.util.Scanner;

public class CountLetters {
    public static void main(String args[]){
        int[] counts = new int[26];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a single word (Letters only, please): ");
        String word = in.nextLine();
        word = word.toUpperCase();

        int j = 0;
        try{
            for (int i = 0; i < word.length(); i++) {
                j++;
                counts[word.charAt(i)-'A']++;
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Found number: " + word.charAt(j-1) );
        }

        for (int i = 0; i < counts.length; i++){
            if (counts[i] != 0)
                System.out.println((char)(i + 'A') + ": " + counts[i]);
        }

    }
}
