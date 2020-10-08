import java.util.*;
public class Digit_occur_number{
    public static void main(String[] args){
    int cnt=0;
Scanner s=new Scanner(System.in);
    int num =s.nextInt();
int temp=s.nextInt();
while(num>0){
    int d=num%10;
    if(d==temp){
        cnt++;
    }
    num=num/10;


}
        System.out.println(cnt);
    }
}