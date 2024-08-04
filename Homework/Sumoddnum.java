import java.util.*;

public class Sumoddnum {
    public static void odd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of odd numbers from 1 to " + n + " = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        odd(n);
        sc.close();
    }
}