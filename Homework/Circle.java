import java.util.*;
public class Circle {
    public  static void Circumference(int r){
        double c = 2*r*3.14;
        System.out.println("Circumfernce of circle:"+c);

    }
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter cicale redius:");
        int r=Sc.nextInt();
        Circumference(r);
        Sc.close();
    }
    
}
