import java.util.Scanner;

public class ShowMyInfo {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.println("Welcome "+ name + ", your age is " + age);
    }
}
