public class ReverseString {
    public static void revers(String str,int index){
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
    }
System.out.print(str.charAt(index) );
    revers(str, index-1)    ;
}
public static void main(String[] args) {
    String str ="KishanYadav";
    revers(str, str.length()-1);
}
}


