import java.util .*;
public class Array_2d_1{
    public static void main(String[] args){
        Scanner n= new Scanner(System.in);
        //int n1=n.nextInt();
        int[][] arr={{1,2,3}, {4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr.length; j++) {
                sum+=arr[i][j];
            }
            System.out.println("Sum of row "+(i+1)+" = "+sum);
        }
    }
}