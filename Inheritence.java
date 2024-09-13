class shape{
    public void area(){
        System.out.println("Area of shape is 0");
    }
}
class Traingle extends shape{
    public void area(int h,int b){
    System.out.println("Area of triangle is "+(h*b)/2);
    }
    }
public class Inheritence {
    public static void main(String[] args) {
        Traingle t=new Traingle();
        t.area();
        t.area(5, 6);
        
    }


    
}
