import java.util.Locale;
import java.util.Scanner;

public class Conv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scan.nextInt();
        String str = toString(number);
        System.out.println(str);
    }

    public static String toString(int number) {
        String str = String.valueOf(number);
        return str;
    }
}