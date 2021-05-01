package runners;

public class CalculatorWithMathCopy {
    public void main(String[] args) {

}
    public double Add(double b, double c){
        double a;
        a = b + c;
        return a;
    }
    public double Div(double b, double c){
        double a;
        a = b / c;
        return a;
    }
    public double Sub(double b, double c){
        double a;
        a = b - c;
        return a;
    }
    public double Mult(double b, double c){
        double a;
        a = b * c;
        return a;
    }
    public double Exp(double d){
        double a;
        a = d * d;
        return a;
    }
    public double Abs(double d){
        double a;
        if (d < 0)
        {
            a = d * -1;
        }
        else
            a = d;
        return a;
    }
    public double Sqrt(double d){
        double a;
        a = Math.sqrt(d);
        return a;
    }
}
