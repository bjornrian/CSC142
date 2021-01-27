package NormalDistribution;

import java.util.Scanner;

public class UserCommsTest {
    public static void main(String[] args) {
        System.out.println("Enter your choice: (integer, 0-4)");
        int choice = validateInput();

        switch (choice) {
        case 0:
            System.out.println("Your choice is " + choice + ". Exiting program.");
            break;
        case 1:
            System.out.println("Your choice is " + choice);
            break;
        case 2:
            System.out.println("Your choice is " + choice);
            break;
        case 3:
            System.out.println("Your choice is " + choice);
            break;
        case 4:
            System.out.println("Your choice is " + choice);
            break;
        }
    }

    private static int validateInput() {
        Scanner userIn = new Scanner(System.in);
        int inputValue = -1;

        while(true) {
            boolean invalidInput = false;
            String nextLine = userIn.nextLine();
            try {
                inputValue = Integer.parseInt(nextLine);
            } catch (NumberFormatException nfe) {
                invalidInput = true;
            }
            if(inputValue < 0 || inputValue > 4) {
                invalidInput = true;
            }
            if(invalidInput) {
                System.out.println("Error - choose an integer between 0-4:");
            } else {
                break;
            }
        }
        return inputValue;
    }
}
