import java.util.Scanner;
public class positive_negative{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(num>0){
            System.out.println("positive number");
        }
        else if(num<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("zero");
        }
    }
}