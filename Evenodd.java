import java.util.*;
public class Evenodd {
    public static void evenodd(int n){
        if(n%2==0){
            System.out.println(n +":Number is even");
        }else{
            System.out.println(n +":Number is odd");
        }

    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=Sc.nextInt();
        evenodd(n);
        Sc.close();
        
    }
        
    }

    
