import java.util.Scanner;

public class NumberWriter {
    public static final String[] BELOW_TWENTY = { "ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать" };
    public static final String[] TENS = { "сто", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто" };
    public static final String[] THOUSANDS = {"тысяча","тысяч","две тысячи"};
    public static final String[] MILLIONS = {"миллион","миллиона","миллионов"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while ( true ) {
            System.out.print("Число от -999999999 до 999999999: ");
            if ( ! scanner.hasNextInt() )
                break;
            int number = scanner.nextInt();
            if ( number < -999999999 || number > 999999999) {
                System.out.println("Попробуй ещё раз...");
                continue;
            }

            if ( number < 20 )
                System.out.println(BELOW_TWENTY[number]);
            else if ( number < 100 ) {
                int high = number / 10;
                int low = number % 10;
                String text = TENS[high];
                if ( low != 0 )
                    text = text + " " + BELOW_TWENTY[low];
                System.out.println(text);
            }
            else if(number < 1000000){
                
            }
            else
                System.out.println(TENS[0]);
        }

        scanner.close();
    }
}
