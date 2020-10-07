import java.util.*;
public class No_of_digit{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int cnt=0;
        while(num>0){
            int d=num%10;
            num=num/10;
            cnt++;
        }
        System.out.println("no of digit in a number"+cnt);
    }
}