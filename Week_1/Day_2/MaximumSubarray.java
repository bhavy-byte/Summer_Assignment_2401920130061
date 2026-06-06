
public class MaximumSubarray{
    static int maxSubArray(int[] nums){
        int sum=0,max=Integer.MIN_VALUE;
        for(int n:nums){
            sum+=n;
            max=Math.max(max,sum);
            if(sum<0) sum=0;
        }
        return max;
    }
    public static void main(String[] args){
        System.out.println("Output: "+maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
