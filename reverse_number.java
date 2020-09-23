import java.util.*;
public class reverse_number{
public static void main(String[] args){
 Scanner s=new Scanner(System.in);
    int  num=s.nextInt();
    int reverse=0;
    while(num>0){
        int d=num%10;
        reverse=reverse*10+d;
        num/=10;
    }
    System.out.println(reverse);
        }
}