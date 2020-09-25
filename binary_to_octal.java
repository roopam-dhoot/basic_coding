import java.util.*;
public class binary_to_octal{
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int octal=0,decimal=0,i=0;
    while(num !=0){
        decimal+=(num%10)*Math.pow(2,i);
                ++i;
                num/=10;
    }
    i=1;
    while(decimal !=0){
        octal+=(decimal%8)*i;
        decimal/=8;
        i*=10;
    }
    System.out.println(octal);
}
}