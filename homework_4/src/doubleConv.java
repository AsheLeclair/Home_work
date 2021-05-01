import java.util.Scanner;

public class doubleConv {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите число: ");
            double number = scan.nextDouble();
            String str = toString(number);
            System.out.println(str);
        }

        public static String toString(double number) {
            String str = String.valueOf(number);
            return str;
        }
}
