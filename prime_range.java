import java.util.*;
public class prime_range{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        boolean flag;
        for(int i=a;i<=b;i++){
            if (i == 1 || i == 0)
                continue;
            flag=false;
            for(int j=2;j<=i/2;j++) {
                if (i % j==0){
                    flag=true;
                    break;
                }

            }
            if(!flag){
                System.out.println(i);
            }


        }
    }
}