class MethodOverloading {
    
    public void display(int a) {
        System.out.println("Argument is " + a);
    }

    public void display(int a, int b) {
        System.out.println("Arguments are " + a + " and " + b);
    }

    public void display(double o) {
        System.out.println("Argument is " + o);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display(10);       
        obj.display(10, 20);    
        obj.display(10000.0);   
    }
}
