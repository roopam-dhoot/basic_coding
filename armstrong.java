import java.util.Scanner;
public class armstrong{
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int temp=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+digit*digit*digit;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("number is armstrong number");
        }
        else{
            System.out.println("number in not an armstrong number");
        }
    }
}