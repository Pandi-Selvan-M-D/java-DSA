public class Array_first_duplicate {
    boolean found(int target,int size, int[] arr){
        for(int i=0;i<size;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Array_first_duplicate ap = new Array_first_duplicate();
        int a[]={10, 5, 3, 4, 10, 5, 2, 3};
        int[] b= new int[a.length];
        for(int i=0; i<a.length; i++){
            if(ap.found(a[i], i, a)){
                System.out.println("First Duplicate number is: "+a[i]);
                break;
            }
        }
    }
}
