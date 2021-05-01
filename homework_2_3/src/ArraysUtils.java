import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {
        arrayFromConsole();
        arrayRandom();
    }

    public static int[] arrayFromConsole(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Массив:");
        for (int j = 0; j < n; j++){
            System.out.println(" " + arr[j]);
        }
        return arr;
    }
    public static int[] arrayRandom(int size, int maxValueExclusion){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размерность рандомного массива:");
        size = scan.nextInt();
        System.out.println("Укажите до какого числа генерировать андомные значения: ");
        maxValueExclusion = scan.nextInt();
        int[] container = arrayRandom(size, maxValueExclusion);
        for(int i = 0; i < size; i++){
            container[i] = rand.nextInt(100);
            System.out.println(container[i]);
        }
        return container;
    }
}
