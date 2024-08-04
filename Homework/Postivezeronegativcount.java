import java.util.*;
public class Postivezeronegativcount {
    public static void number( int a){
        int count =0;
        for(int i=0;i<a;i++){
            if(i>0 && i<0){
                count++;
            }else{
                System.out.println(i);
            }
        }   
    }
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=Sc.nextInt();
        number(a);

        Sc.close();
    }
    
}
