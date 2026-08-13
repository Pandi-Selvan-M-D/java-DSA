import java.util.Arrays;
public class freq_count_arr_desc_print{
    public static void main(String args[]){
        int i=0,c=0,k=0,max=0,index=0,temp=0;
        int arr1[]={50, 20, 150, 20, 50, 10, 30, 10, 10};
        int[] arr2 = new int[arr1.length];
        int[] arr3=new int[arr1.length];
        Arrays.sort(arr1);
        for(int v=0;v<arr1.length;v++){
            arr2[v]=arr1[arr1.length-v-1];
        }
        while(i<arr2.length){
            int count=0;
            if(arr2[i]==temp){
                i++;
                continue;
            }
            for(int j=0;j<arr2.length;j++){
                if(arr2[i]==arr2[j]){
                    count++;
                }
            }
            arr3[k]=count;
            temp=arr2[i];
            i++;
            k++;
            c++;
        }
        i=0; k=0;
        while(i<arr2.length){
            if(arr2[i]==temp){
                i++;
                continue;
            }
            System.out.println(arr2[i]+" -> "+arr3[k]);
            temp=arr2[i];
            i++;
            k++;
        }
    }
}