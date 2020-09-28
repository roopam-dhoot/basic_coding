import java.util.*;
public class reverse_string{
    public static void main(String[] args){
            String s="hello world!";
            String str2="";
            for(int i=s.length()-1;i!=-1;i--){
                str2=str2+s.charAt(i);
            }
        System.out.println(str2);
    }
}