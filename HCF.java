import java.util.*;
public class HCF{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        int hcf=1;
        for(int i=1;i<=num1 && i<=num2;++i){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf);
    }
}