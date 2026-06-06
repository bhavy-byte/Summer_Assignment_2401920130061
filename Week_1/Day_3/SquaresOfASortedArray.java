
import java.util.Arrays;
public class SquaresOfASortedArray{
    static int[] sortedSquares(int[] nums){
        int n=nums.length,l=0,r=n-1,p=n-1;
        int[] res=new int[n];
        while(l<=r){
            int a=nums[l]*nums[l],b=nums[r]*nums[r];
            if(a>b){res[p--]=a;l++;}
            else{res[p--]=b;r--;}
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4,-1,0,3,10})));
    }
}
