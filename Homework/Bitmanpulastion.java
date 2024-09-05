public class Bitmanpulastion {
    public static void main(String[] args) {
        int n=3;
        int pos =2;
        int bitMask =1<<pos;
        
        if((bitMask & n)==0){
            System.out.println("Bit was Zero.");
        }else{
            System.out.println("Bit was one.");
        }
        //set bit
       // int newNumber = bitMask | n;
        //System.out.println("New Number is :"+ newNumber);
        //clear bit
        int notBitmask=~(bitMask);
        int t=notBitmask & n;
        System.out.println(t);
    }
    
}
