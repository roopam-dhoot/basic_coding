import java.util.Scanner;
public class armstrong_range{
public static void main(String[] args){
 Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    for(int i=a;i<=b;i++){
        int number=i;
        int sum=0;
        while(number > 0){
            int digit=number%10;
            number=number/10;
            sum=sum+digit*digit*digit;

        }
        if(sum == i){
            System.out.println(i+"is armstrong number");
        }
    }
        }
}