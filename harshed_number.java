import java.util.*;
public class harshed_number{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int sum=0,temp;
        temp=num;
        while (num>0){
            int d=num%10;
            sum=sum+d;
            num=num/10;
        }
        if(temp%sum==0){
            System.out.println("Harshed number");
        }
        else{
            System.out.println("Not an harshed number");
        }
    }
}