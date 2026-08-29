import java.util.*;
public class find_peak{
    public static void main(String args[]){
        int[] nums= {1,2,1,3,5,6,4};
        if(nums.length>=3){
            for(int i=0; i<nums.length-2; i++){
                if(nums[i]<nums[i+1] && nums[i+2]<nums[i+1]){
                    System.out.println("Peak: "+(i+1));
                    break;
                }
            }
        }
        else{
            System.out.println("Length is not legiment for the above process");
        }
    }
}