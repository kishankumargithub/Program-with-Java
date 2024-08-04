import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            String input = sc.nextLine();
            System.out.println("You entered: " + input);
        } // Scanner will be automatically closed here
    }
}
