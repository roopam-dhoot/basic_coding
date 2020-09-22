import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int temp=a;
    int b=0;
      while(a!=0){
          int d=a%10;
          b=b*10+d;
          a=a/10;
        }
      if(b==temp){
          System.out.println("Is a palindrome");
      }
      else{
          System.out.println("Is not a palindrome");
        }
        }
}