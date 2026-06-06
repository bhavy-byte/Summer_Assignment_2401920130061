
import java.util.*;
public class ContainsDuplicate{
    static boolean containsDuplicate(int[] nums){
        HashSet<Integer> s=new HashSet<>();
        for(int n:nums) if(!s.add(n)) return true;
        return false;
    }
    public static void main(String[] args){
        System.out.println("Output: "+containsDuplicate(new int[]{1,2,3,1}));
    }
}
