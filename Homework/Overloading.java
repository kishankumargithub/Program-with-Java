class Employee {
    public static int base = 10000;
    int Salary() {
        return base;
    }
}

class Manager extends Employee {
    int Salary() {
        return base + 20000;
    }
}

class Clerk extends Employee {
    int Salary() {
        return base + 10000;
    }
}

public class Overloading {
    static void printSalary(Employee e) {
        System.out.println(e.Salary());
    }

    public static void main(String[] args) {
        Employee obj1 = new Manager();
        System.out.println("Manager's salary:");
        printSalary(obj1);

        Employee obj2 = new Clerk();
        System.out.println("Clerk's salary:");
        printSalary(obj2);
    }
}
