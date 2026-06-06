
import java.util.Arrays;
public class MoveZeroes{
    static void moveZeroes(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]!=0){
                int t=nums[i]; nums[i]=nums[j]; nums[j]=t; j++;
            }
    }
    public static void main(String[] args){
        int[] a={0,1,0,3,12};
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}
