import java.util.*;
public class remove_vowels{
    public static void main(String[] args){

        StringBuffer  s=new StringBuffer ("hello world");
        Character a[]={'a','e','i','o','u','A','E','I','O','U'};
        List<Character > v = Arrays.asList(a);
        for(int i=0;i<s.length();i++){
            if(v.contains(s.charAt(i))){
                s.replace(i,i+1,"");
            }
        }
        System.out.println(s);

    }
}