import java.util.*;
public class Twonumberxandn {
    public static void twonum(double x,double n){
        double result= Math.pow(x,n);
        System.out.println("The number result:"+result);
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=Sc.nextInt();
        System.out.println("Enter the scond num:");
        int n=Sc.nextInt();
        twonum(x, n);
        
        Sc.close();
    }
    
}
