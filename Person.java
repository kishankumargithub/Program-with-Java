class Person {
    private String name;
    private int age;
    private double salary; 
    public void setData(String n, int a, double s) {
        name = n;
        age = a;
        salary = s;
    }

    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age); 
        System.out.println("Salary: " + salary); 
    }

    public static void main(String[] args) {
        Person obj = new Person(); 
        obj.setData("AMIT", 45, 50000); 
        obj.display(); 
    }
}
	
	