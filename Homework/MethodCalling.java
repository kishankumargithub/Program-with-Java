class Addition{
    int sum=0;

public int Addtwo(int a,int b){
    sum=a+b;
    return sum;
}}
public class MethodCalling {
    public static void main(String[] args) {
        Addition obj=new Addition();
        System.out.println("Sum is: "+obj.Addtwo(5, 7));  // calling method Addtwo and passing arguments 5 and 7  // it will return sum and print it.  // output will be: Sum is: 12  // it will not print anything if you don't use return statement.  // if you want to print sum then you need to use return statement.  // you can also use this method in other classes by creating
    }
    
}
