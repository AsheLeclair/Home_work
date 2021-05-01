package runners;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
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
