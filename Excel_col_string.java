import java.util.*;
public class Excel_col_string{
    static int titleToNumber(String s)
    {
        int result = 0;
        for (int i = 0; i < s.length(); i++)
        {
            result *= 26;
            result += s.charAt(i) - 'A' + 1;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of input do you have");
        int num=s.nextInt();
        String[] str=new String[num+1];
        for(int i=0;i<str.length;i++){
             str[i]=s.nextLine();
        }
        System.out.println(str.toString());
        for(int j=1;j<str.length;j++){
            System.out.println(titleToNumber(str[j]));
        }
    }
}