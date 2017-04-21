import static java.lang.Math.*;

/**
 * Created by Алина on 21.04.2017.
 */
public class Rectangle {

   public static double rectangle(int n, double h, double a){
            double temp = 0;
            for (int i = 0; i < n ; i++) {
                temp = temp + f(a + (2 * i + 1) * h / 2);
            }

            return temp*h;
        }

    public static double f(double x) {
        double f = 1 / (0.3 + sin(x));
        return f;
    }
    public static double A(double b, double a, int n){
       double A = pow(abs(b-a),3)*(74.0741)/(24*pow(n,2));
       return A;
    }
    public static double Runge(double i8, double i16){
        double I = (i8-pow(2,2)*i16)/(1-pow(2,2));
        return I;
    }

}