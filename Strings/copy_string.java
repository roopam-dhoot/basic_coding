import java.util.*;
public class copy_string {
    public static void main(String[] args) {
        String str1 = "Hello World!";
        String str2 = "";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        for (int i=0; i <str1.length() ;i++){

                str2 = str2 + str1.charAt(i);//Concatenate existing string with new String


        }//End
        //str2 = new String(str2);
        System.out.println(str2);
    }
}