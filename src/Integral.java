import static java.lang.Math.*;
/**
 * Created by Алина on 21.04.2017.
 */
public class Integral {
    public static void main(String[] args){
        double a = 0;
        double b = 0.4;
        int n1 = 8;
        int n2 = 16;
        double i8 = Rectangle.rectangle(n1,(b-a)/n1,a);
        double i16 = Rectangle.rectangle(n2,(b-a)/n2,a);
        double iR1 = Rectangle.Runge(i8,i16);
        double i16_2 = Trapezium.trapezium(n2,(b-a)/n2,a,b);
        double i8_2 = Trapezium.trapezium(n1,(b-a)/n1,a,b);
        double iR2 = Trapezium.Runge(i8_2,i16_2);
        double i8_3 = Simpson.simpson(n1,(b-a)/n1,a,b);
        double i16_3 = Simpson.simpson(n2,(b-a)/n2,a,b);
        double iR3 = Simpson.Runge(i8_3,i16_3);
        double A1 = Rectangle.A(b,a,n1);
        double A2 = Trapezium.A(b,a,n1);
        double A3 = Simpson.A(b,a,n1);
        print(i8,i16,iR1,abs(iR3-i8),A1);
        print(i8_2,i16_2,iR2,abs(iR3-i8_2),A2);
        print(i8_3,i16_3,iR3,abs(iR3-i8_3),A3);
    }
public static void print(double i8,double i16, double iR, double t, double A){
        System.out.printf("%.10f",i8);
    for (int i = 0; i <4 ; i++) {
        System.out.print(" ");
    }
    System.out.printf("%.10f",i16);
    for (int i = 0; i <4 ; i++) {
        System.out.print(" ");
    }
    System.out.printf("%.10f",iR);
    for (int i = 0; i <4 ; i++) {
        System.out.print(" ");
    }
    System.out.printf("%.10f",t);
    for (int i = 0; i <4 ; i++) {
        System.out.print(" ");
    }
    System.out.printf("%.10f",A);
    for (int i = 0; i <4 ; i++) {
        System.out.print(" ");
    }
    System.out.println();
}

}
