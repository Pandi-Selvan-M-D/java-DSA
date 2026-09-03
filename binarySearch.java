public class binarySearch {
    public static void main(String args[]){
        int[] arr= {10, 20, 30, 40, 50, 60, 70};
        int target =20;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println("Found: "+mid);
                break;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    }
}