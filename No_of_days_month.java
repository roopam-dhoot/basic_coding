import java.util.*;
public class No_of_days_month{
    public static void main(String[] args){
        int days[] = {31,28,31,30,31,30,31,30,31,30,31,30,31};
        Scanner s=new Scanner(System.in);
                int num=s.nextInt();
        int month=s.nextInt();
        boolean b=false;
        if (num % 4 == 0) {
            if (num % 100 == 0) {
                if (num % 400 == 0) {
                    b=true;
                }
                else {
                    b=false;
                }
            }
            else{
                b=true;
            }

        }
        else {
            b=false;
        }
        if(b){
        days[1]=29;
        }
        System.out.println("No of days in month"+days[month-1]);
    }
}