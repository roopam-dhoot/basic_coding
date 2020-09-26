import java.util.*;
public class quadratic_equation{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        double b=s.nextDouble();
        double c=s.nextDouble();
        double determinant=(b*b)-(4*a*c);
        double sqrt_determinant=Math.sqrt(determinant);
        if(determinant>0){
            double firstRoot=(-b+sqrt_determinant)/(2*a);
            double secondRoot=(-b-sqrt_determinant)/(2*a);
            System.out.println(firstRoot +""+ secondRoot);
        }
        else{
            System.out.println("Root is :: "+(-b + sqrt_determinant)/(2*a));
        }
    }
}