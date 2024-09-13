class Student {
    String name;
    int age;
    Student(){
        System.out.println("construtor calleed");
    }

    public void getInfo() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

public class Object {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.age = 20;
        s.getInfo();
        
    }
}
