import java.util.Scanner;

public class Arrayuser1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}