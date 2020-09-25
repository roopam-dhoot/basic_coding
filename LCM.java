import java.util.*;
public class LCM{
    public static void main(String[] args){
Scanner s=new Scanner(System.in);
int num1=s.nextInt();
int num2=s.nextInt();
int lcm;
int largest=(num1>num2)?num1:num2;
while(true){
    if(largest%num1==0 && largest%num2==0){
        lcm=largest;
        break;
    }
   ++largest;
}
System.out.print(largest);
    }
}