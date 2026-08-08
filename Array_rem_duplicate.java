import java.util.Arrays;
public class Array_rem_duplicate {
    boolean contains(int n1,int[] n2){
        boolean b=false;
        for(int i=0;i<n2.length;i++){
            if(n2[i]==n1){
                b=true;
                break;
            }
        }
        return b;
    }
    public static void main(String args[]){
        int a[]={1, 2, 2, 3, 4, 4, 5};
        int[] b= new int[a.length];
        int ind=0;
        Array_rem_duplicate ard= new Array_rem_duplicate();
        for(int i=0;i<a.length;i++){
            if(! ard.contains(a[i], b)){
                b[ind]=a[i];
                ind++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}