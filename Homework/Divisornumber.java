import java.util.*;
public class Divisornumber {
    public static void commandivisor(int a,int b){
        while (b!=0) 
        {int temp =b;
            b=a%b;
          a=temp;   
        }
        System.out.println("GCD of "+a+" and "+b+" is "+a);
    }
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter first num:");
        int a=Sc.nextInt();
        System.out.println("Enter second num:");
        int b=Sc.nextInt();
        commandivisor(a, b);
        Sc.close();
    }.
    
}
