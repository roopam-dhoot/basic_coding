import java.util.*;
public class Indentify_character{
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    char a = s.next().charAt(0);
    if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'|| a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){
        System.out.println("vowels");
        }
else{
    System.out.println("consonent");
        }
        }
}