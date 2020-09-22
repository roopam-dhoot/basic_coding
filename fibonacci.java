import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int t1=0,t2=1;
for(int i=0;i<=a;i++){
        System.out.println(t1);
        int temp=t1+t2;
            t1=t2;
            t2=temp;
        }
    }
}