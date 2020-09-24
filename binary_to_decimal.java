import java.util.*;
public class binary_to_decimal{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        long decimal=0;
        int temp=0;
        while(true){
            if(num==0){
                break;
            }
            else{
                int n=num%10;
                decimal+=n*Math.pow(2,temp);
                num=num/10;
                temp++;
            }
        }
        System.out.println(decimal);
    }
}