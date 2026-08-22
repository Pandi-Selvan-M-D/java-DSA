import java.util .*;
public class Array_2d_2{
    public static void main(String[] args){
        Scanner n= new Scanner(System.in);
        //int n1=n.nextInt();
        int[][] arr={{1,2,3}, {4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length; j++) {
                if(i==j || (j==arr[i].length-1 &&( i==0 || i==arr[j].length-1)) || (j==0 && i==arr[i].length-1) ){
                    System.out.print(arr[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}