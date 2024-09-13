abstract class ArithmeticOperation {
    abstract void printInfo();
}

class Add extends ArithmeticOperation {
    void printInfo() {
        int a = 3;
        int b = 4;
        System.out.println("Addition: " + (a + b));
    }
}

class Sub extends ArithmeticOperation {
    void printInfo() {
        int a = 3;
        int b = 4;
        System.out.println("Subtraction: " + (a - b));
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        ArithmeticOperation addOperation = new Add();
        addOperation.printInfo();

        ArithmeticOperation subOperation = new Sub();
        subOperation.printInfo();
    }
}
