
public class ContainerWithMostWater{
    static int maxArea(int[] h){
        int l=0,r=h.length-1,ans=0;
        while(l<r){
            ans=Math.max(ans,Math.min(h[l],h[r])*(r-l));
            if(h[l]<h[r]) l++; else r--;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println("Output: "+maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
