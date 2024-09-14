/**
 * Overriding
 */
class Parent{
    void show(){
        System.out.println("This is Parent class");
    }   
}
class Child extends Parent{
    @Override
    void show(){
        System.out.println("This is Child class");
    }
}
public class Overriding {

    public static void main(String[] args) {
        Parent obj1=new Parent();
        obj1.show();
        Parent obj2=new Child();
        obj2.show();

    
    }

}