import java.util.Arrays;
public class Array_order_arrange {
    public static void main(String[] args) {
        int a[]={1, 3, 5, 2, 8, 7, 4};
        int[] b=new int[a.length];
        Arrays.sort(a);     
        int k=0,l=0,j=a.length-1;
        for(int i=0;i<a.length;i++) {
            if(k>a.length/2){
                break;
            }
            else{
                if(i%2==0){ 
                    b[i]=a[k];
                    k++;
                }
                else{
                    b[i]=a[j];
                    j--;
                }
                
            }
            
        }
        System.out.println(Arrays.toString(b));
    }
}
