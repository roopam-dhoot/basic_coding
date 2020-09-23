import java.util.*;
public class pow_number{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        int e=s.nextInt();
        long r=1;
        while(e!=0){
            r=r*b;
            e--;
        }
        System.out.println(r);
    }
}