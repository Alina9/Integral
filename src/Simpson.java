import static java.lang.Math.*;

/**
 * Created by Алина on 21.04.2017.
 */
public class Simpson {
    public static double simpson(int n, double h, double a,double b){
        double temp = 0;
        for (int i = 1; i < n+1; i++) {
            temp = temp + 4*f(a+(2*i-1)*h/2);
        }
        for (int i = 1; i < n ; i++) {
            temp = temp + 2*f(a+i*h);

        }
        return (temp + f(a) + f(b))*h/6;
    }

    public static double f(double x) {
        double f = 1 / (0.3 + sin(x));
        return f;
    }
    public static double A(double b, double a, int n){
        double A = pow(abs(b-a),5)*(9580.25)/(2880*pow(n,4));
        return A;
    }
    public static double Runge(double i8, double i16){
        double I = (i8-pow(2,4)*i16)/(1-pow(2,4));
        return I;
    }
}
