import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        boolean b = false;
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
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }

}
