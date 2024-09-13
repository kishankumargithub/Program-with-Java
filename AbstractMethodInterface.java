interface Sum {
    int operation_two_var(int a, int b);
    int operation_three_var(int a, int b, int c);
}

public class AbstractMethodInterface implements Sum {
    public int operation_two_var(int a, int b) {
        return a * b;
    }

    public int operation_three_var(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Sum object = new AbstractMethodInterface();
        System.out.println("The product of two numbers is: " + object.operation_two_var(5, 3));
        System.out.println("The product of three numbers is: " + object.operation_three_var(5, 3, 2));
    }
}
