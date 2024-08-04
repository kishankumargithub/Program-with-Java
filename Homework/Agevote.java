import java.util.*;
public class Agevote {
    public static void vote(int age){
        if(age>=18){
            System.out.println("You are eligible to vote.");
        }else{
            System.out.println("You are not eligible to vote.");
        }
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=Sc.nextInt();
        vote(age);
        Sc.close();
    }
    
}
