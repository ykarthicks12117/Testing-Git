
import java.util.Scanner;

public class Developer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = input.nextLine();
        System.out.print("Enter your age");
        int age = input.nextInt();
        System.out.print(age);
        
        if (name.equals("Yuvan karthick")) 
        {
            System.out.print("You are the CEO of Google\n");
        } else {
            System.out.print("You go and sit aside");
        }
        for (int i = 0; i <= 5; i++) {
            System.out.print("Yuvan karthick\t");
        }

    }
}
