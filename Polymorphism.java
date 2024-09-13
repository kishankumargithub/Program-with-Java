class Student{
    String name;
    int age;
    public void displayInfo(String name){
        System.out.println(name);
    }
    public void displayInfo(int age){
        System.out.println(age);
    }
    public void displayInfo(String name, int age){
        System.out.println(name + " " + age);
    }

}
public class Polymorphism {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayInfo("John");
        s.displayInfo(25);
        s.displayInfo("John", 25);
        
    }
    
}
