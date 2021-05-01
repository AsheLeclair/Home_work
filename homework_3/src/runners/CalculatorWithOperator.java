package runners;

public class CalculatorWithOperator {

    public static double Add(double b, double c){
        double a;
        a = b + c;
        return a;
    }
    public static double Div(double b, double c){
        double a;
        a = b / c;
        return a;
    }
    public static double Sub(double b, double c){
        double a;
        a = b - c;
        return a;
    }
    public static double Mult(double b, double c){
        double a;
        a = b * c;
        return a;
    }
    public static double Exp(double d){
        double a;
        a = d * d;
        return a;
    }
    public static double Abs(double d){
        double a;
        if (d < 0)
        {
            a = d * -1;
        }
        else
            a = d;
        return a;
    }
    public static double Sqrt(double d){
        double a;
        a = Math.sqrt(d);
        return a;
    }
}
