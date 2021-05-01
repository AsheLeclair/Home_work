package calcs;

import runners.CalculatorWithMathExtends;

import java.util.Scanner;

public class CalculatorWithMathExtendsMain {
    private Object CalculatorWithCounterClassic;

    public static long main(String[] args){
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите b: ");
        double b = scan.nextDouble();
        System.out.println("Введите c: ");
        double c = scan.nextDouble();
        System.out.println("Введите число для Возведения в степень, корень, модуль");
        double d = scan.nextDouble();
        int choice = 1;
        long j = 0;
        while (choice != 0) {
            System.out.println("Калькулятор:");
            System.out.println("1. Сложение");
            System.out.println("2. Деление");
            System.out.println("3. Вычитание");
            System.out.println("4. Умножение");
            System.out.println("5. Степень");
            System.out.println("6. Модуль");
            System.out.println("7. Корень");
            System.out.println("0. Выход");
            choice = scan.nextInt();
            switch (choice) {
                case (1):
                    System.out.println(CalculatorWithMathExtends.Add(b, c));
                    break;
                case (2):
                    System.out.println(calc.Div(b, c));
                    break;
                case (3):
                    System.out.println(calc.Sub(b, c));
                    break;
                case (4):
                    System.out.println(calc.Mult(b, c));
                    break;
                case (5):
                    System.out.println(calc.Exp(d));
                    break;
                case (6):
                    System.out.println(calc.Abs(d));
                    break;
                case (7):
                    System.out.println(calc.Sqrt(d));
                    break;
                case (0):
                    break;
                case(8):
                    j++;
                    System.out.println();
                    return j;
            }

        }
    }
}

