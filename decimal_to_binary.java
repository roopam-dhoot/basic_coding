import java.util.*;
public class decimal_to_binary{
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int binary[]=new int[100];
    int num=s.nextInt();
    int temp=0;
    while(num>0){
        binary[temp++]=num%2;
        num=num/2;
    }
    for(int i=temp-1;i>=0;i--){
        System.out.print(binary[i]);
    }
    }
}
