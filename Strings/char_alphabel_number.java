import java.util.*;
public class char_alphabel_number{
    public static void main(String[] args){
            Scanner s=new Scanner(System.in);
        char a = s.next().charAt(0);
        if((a>='a' && a<='z' )||(a>='A' && a<='Z')){
            System.out.println("Alphbat");
        }
        else{
            System.out.println("not an alphabet");
        }
    }
}