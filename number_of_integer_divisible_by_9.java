import java.util.*;
public class number_of_integer_divisible_by_9{
    public static void main(String[] args){
int count=0;
Scanner s=new Scanner(System.in);
        int num=s.nextInt();
for(int i=1;i<num;i++){
    if(i%9==0){
count++;
    }
        }
System.out.println(count);
        }
}