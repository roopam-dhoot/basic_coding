import java.util.*;
public class string_palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str2="";
        for(int i=s.length()-1;i!=-1;i--){
            str2=str2+s.charAt(i);
        }
        System.out.println(str2);
        if(s.equals(str2)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}