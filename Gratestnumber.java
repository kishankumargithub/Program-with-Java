import java.util.*;
public class Gratestnumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = Sc.nextInt();
        System.out.println("Enter second number:");
        int b = Sc.nextInt();
        System.out.println("Enter third number:");
        int c = Sc.nextInt();
        if(a>b && a>c){
            System.out.println("The greatest number is: "+a);
        }
        else if(b>c){
            System.out.println("The gratest number is:"+b);
        }
        else{
            System.out.println("the gratest number is: "+c);
        }
        Sc.close();

        
    }
    
}
