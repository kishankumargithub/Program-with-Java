import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        sc.close();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i; // Add the odd number to the sum
            }
        }

     
        System.out.println("Sum of odd numbers from 1 to " + n + " = " + sum);
        Sc.close();
    }
}
