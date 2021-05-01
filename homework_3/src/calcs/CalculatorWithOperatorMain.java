package calcs;

import java.util.Scanner;

import static runners.CalculatorWithOperator.*;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите b: ");
        double b = scan.nextDouble();
        System.out.println("Введите c: ");
        double c = scan.nextDouble();
        System.out.println("Введите число для Возведения в степень, корень, модуль");
        double d = scan.nextDouble();
        int choice = 1;
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
                    System.out.println(Add(b, c));
                    break;
                case (2):
                    System.out.println(Div(b, c));
                    break;
                case (3):
                    System.out.println(Sub(b, c));
                    break;
                case (4):
                    System.out.println(Mult(b, c));
                    break;
                case (5):
                    System.out.println(Exp(d));
                    break;
                case (6):
                    System.out.println(Abs(d));
                    break;
                case (7):
                    System.out.println(Sqrt(d));
                    break;
                case (0):
                    break;
            }
        }
    }
}