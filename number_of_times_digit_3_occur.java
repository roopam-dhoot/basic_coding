import java.util.*;
public class number_of_times_digit_3_occur{
    static int counts(int n){
       int count = 0;
       while (n > 0)
       {
           if (n % 10 == 3)
           {
               count++;
           }
           n = n / 10;
       }
       return count;
   }

   static int count_range(int num){
        int count=0;
        for(int i=2;i<=num;i++){
            count=count+counts(i);
        }
        return count;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.print(count_range(num));
    }
}