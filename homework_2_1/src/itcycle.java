import java.util.Scanner;

public class itcycle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] mas = new int[num];
        int a = 1;
        mas[0] = 1;
        for (int j = 0; j < num; j++){
            mas[j] = a++;
            System.out.println(mas[j]);
        }

            int sum = 1;
            for (int i = 0; i < mas.length; i++) {
                sum *= mas[i];
            }
            System.out.println(sum);
    }
}
