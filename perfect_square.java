import java.util.Scanner;
public class  perfect_square{
    public static void main(String[] args){
int num;
double fVar;
Scanner s=new Scanner(System.in);
num=s.nextInt();
fVar=Math.sqrt(num);

        if(fVar-Math.floor(fVar)==0){
           System.out.println("perfect square");
        }
        else{
            System.out.println("Not a perfect square");
        }
        }
}