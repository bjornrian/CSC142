import java.util.Scanner;

public class TesterBot {
    public static void main(String[] args) {
        System.out.print("\u000c");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int userAge = input.nextInt();

        input.nextLine();

        System.out.print("Enter your age: ");
        String userName = input.nextLine();

        System.out.print("Welcome, " + userName + " (" + userAge + ")");
        input.close();
    }
}
