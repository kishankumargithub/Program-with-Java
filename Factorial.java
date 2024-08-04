import java.util.*;
public class Factorial {
    public static void printfactorial(int n){
        if(n<0){
            System.out.println("Factorial is not defined for negative numbers");
            return;
        }
        int factorial =1;
        for(int i=n; i>=1; i--){
            factorial *= i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= Sc.nextInt();
        printfactorial(n);
        Sc.close();

        
    }
    
}
