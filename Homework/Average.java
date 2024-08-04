import java.util.*;
 public class Average {
    public static void average(int a, int b, int c){
        int sum = a+b+c;
        float average =sum/3;
        System.out.println("The average of the three numbers is:"+average);
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=Sc.nextInt();
        System.out.println("Enter the second number:");
        int b=Sc.nextInt(); 
        System.out.println("Enter the third number:");
        int c=Sc.nextInt();
        average(a, b, c);
        Sc.close();

    }

    }

    

    
