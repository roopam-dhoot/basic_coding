import java.util.*;
public class Strong{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
         int temp=num;
        int sum=0,fact,d;
        while(num!=0){
             d=num%10;
             fact=1;
            for(int i=d;i>=1;i--){
                fact=fact*i;
            }
            num/=10;
            sum=sum+fact;

        }
        if(sum == temp){
            System.out.println("It is a strongest number");
        }
        else{
            System.out.println("Not a strong number");
        }
    }
}