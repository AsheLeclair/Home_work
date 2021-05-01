import java.util.Scanner;

public class itifelse {
    public static void main(String[] args) {
        System.out.println("Введите имя:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        if (name == "Вася") {
            System.out.println("Привет!\nЯ тебя так долго ждал");
        }
        else if (name == "Анастасия") {
            System.out.println("Я тебя так долго ждал");
        }
        else{
            System.out.println("Добры день, а вы кто?");
        }
    }
}
