package morningchallenge;

import java.util.Scanner;

/**
 * Created by Jay Vaghani
 */
public class Challenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Greeting Message: ");
        String message = scanner.nextLine();
        printMessage(name, message);
    }
    public static void printMessage(String name, String message){
        System.out.println("Hi " + name);
        System.out.println(message);
    }
}
