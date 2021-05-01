import java.util.Scanner;

public class homework_2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        int mult = 1;
        if (num % 1 == 0)
        while(num > 0){
            mult *= num % 10;
            num /= 10;
            System.out.println(mult);
        }
        else{
            System.out.println("Введено не целое число");
        }
        System.out.println("mult = " + mult);
    }
}
