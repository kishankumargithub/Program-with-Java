import java.util.*;
public class Greternumtwo {
    public static void greternumtwo(int a,int b){
        if(a>b){
            System.out.println(a+" :is greater:");
        }else{
            System.out.println(b+":is grater num:");
        }
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = Sc.nextInt();
        System.out.println("Enter second number:");
        int b=Sc.nextInt();
        greternumtwo(a, b);
        Sc.close();
    }

    
}