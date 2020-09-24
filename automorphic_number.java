import java.util.*;
public class automorphic_number{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int sq=num*num;
        boolean flag=false;
        while(num>0){
            if(num%10==sq%10) {
                flag = true;
            }
            else{
                flag=false;
            }
            num/=10;
            sq=sq/10;

        }
        if(flag) {
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not Automorphic number");
        }
        }

}