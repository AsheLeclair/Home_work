import java.util.Scanner;

public class itswitch {
    public static void main(String[] args) {
        System.out.println("Введите имя:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        switch (name){
            case ("Анастасия"):
                System.out.println("Я тебя так долго ждал");
                break;
            case("Вася"):
                System.out.println("Привет!\nЯ тебя так долго ждал");
                break;
            default:
                System.out.println("Добры день, а вы кто?");
                break;
        }
    }
}
