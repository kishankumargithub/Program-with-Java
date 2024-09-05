public class ThowerofHnoie {
    public static void tower(int n,String src, String helper,String deSt){
       if(n==1){
        System.out.println("Move disk 1 from source "+src+" to destination "+deSt);
  return;
    }
        tower(n-1, src, deSt, helper);
        System.out.println("Move disk "+n+" from "+src+" to "+deSt);
        tower(n-1, helper, src, deSt);

    }
    public static void main(String[] args) {
        int n=3;
        tower(n,"A","B","C");
        
    }
    
}
