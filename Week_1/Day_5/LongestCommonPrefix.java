
public class LongestCommonPrefix{
    static String longestCommonPrefix(String[] strs){
        String p=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(p)){
                p=p.substring(0,p.length()-1);
                if(p.isEmpty()) return "";
            }
        }
        return p;
    }
    public static void main(String[] args){
        System.out.println("Output: "+longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
