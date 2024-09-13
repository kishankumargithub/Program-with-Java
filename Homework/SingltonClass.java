class Singleton {

    private static Singleton single_instance = null;
    public String s;

    private Singleton() {
        s = "Hello, I am a singleton!";
    }

    public static Singleton getInstance() {
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}

public class SingltonClass {

    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());
        System.out.println("Hashcode of z is " + z.hashCode());
        System.out.println("Value of s is " + x.s);

        if (x == y && y == z) {
            System.out.println("Three objects point to the same memory location");
        } else {
            System.out.println("Objects do not point to the same memory location");
        }
    }
}
