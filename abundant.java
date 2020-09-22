import java.util.Scanner;
public class abundant {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner s = new Scanner(System.in);
         num = s.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum > num) {
            System.out.println("number is abundant");
        }
    }
}

