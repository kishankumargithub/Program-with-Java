import java.util.*;
public class Primenumber {
    public static void prime(int n){
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }

            }       
         }
         if(isPrime){
            System.out.println(n +":is a prime number:");
         }else{
            System.out.println(n +":is not a prime number:");
         }
    }
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n = Sc.nextInt();
        prime(n);
        Sc.close();
        
     }
    
    }
  

