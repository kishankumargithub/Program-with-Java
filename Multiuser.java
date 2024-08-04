import java.util.*;
public class Multiuser {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int [][] arr =new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
    System.out.println("Enter arr value for arr["+ i +"] ["+ j +"]:");
              arr[i][j]= Sc.nextInt();
            }

        }
        System.out.println("You entered:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println(arr[i][j]);
            }
        }
        Sc.close();
    }
    
}
