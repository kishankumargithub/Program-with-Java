import java.util.*;
public class Tablenum {
    public static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"=");
            System.out.println(n*i);
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=Sc.nextInt();
        table(n);
        Sc.close();
    }
    
}
