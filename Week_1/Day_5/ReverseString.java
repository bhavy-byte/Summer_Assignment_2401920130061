
public class ReverseString{
    static void reverseString(char[] s){
        int l=0,r=s.length-1;
        while(l<r){
            char t=s[l]; s[l]=s[r]; s[r]=t; l++; r--;
        }
    }
    public static void main(String[] args){
        char[] s={'h','e','l','l','o'};
        reverseString(s);
        System.out.println(new String(s));
    }
}
