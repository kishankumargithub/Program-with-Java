public class PrintNummber {
    public static void PrintNummb(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        PrintNummb(n+1);
    }
public static void main(String[] args) {
    int n=1;
    PrintNummb(n);
    
}    
}
