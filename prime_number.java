import java.util.*;
public class prime_number{
    public static void main(String[] args){
Scanner s =new Scanner(System.in);
int num=s.nextInt();
boolean flag=false;
for(int i=2;i<num/2;i++){
    if(num%i==0){
        flag=true;
        break;

    }

}
if(!flag){
    System.out.println("prime number");
}
else{
    System.out.println("not a prime number");
}
    }
}