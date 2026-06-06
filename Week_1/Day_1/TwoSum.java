
import java.util.*;
public class TwoSum{
    static int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(map.containsKey(c)) return new int[]{map.get(c),i};
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int[] ans=twoSum(new int[]{2,7,11,15},9);
        System.out.println("Output: ["+ans[0]+","+ans[1]+"]");
    }
}
