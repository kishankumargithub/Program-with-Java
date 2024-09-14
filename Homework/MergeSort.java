public class MergeSort {
    public static void conqure (int arr[],int si,int mid,int ei){
        int merger[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merger[x]=arr[idx1];
                idx1++;
            }
            else{
                merger[x]=arr[idx2];
                idx2++;
            }
            x++;
        }
        while(idx1<=mid){
            merger[x]=arr[idx1];
            idx1++;
            x++;
        }
        while(idx2<=ei){
            merger[x]=arr[idx2];
            idx2++;
            x++;
        }
        for(int i=0,j=si; i<merger.length;i++,j++){
            arr[j]=merger[i];
        }
    }
    public static void Divide(int arr[],int si,int ei){
       if(si>=ei){
        return;
       }
       int mid=si+(ei-si)/2;
        Divide(arr, si, mid);
        Divide(arr, mid+1, ei);
        conqure(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        int n=arr.length;
        Divide(arr, 0, n-1);
        System.out.println("Sorted array is");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
