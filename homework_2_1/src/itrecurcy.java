import java.util.Scanner;

public class itrecurcy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] mas = new int[num];
        System.out.println(rec(num));
    }
    public static int rec(int num){
        int result = 1;
        if (num == 0 || num == 1){
            return result;
        }
        result = num * rec(num - 1);
        return result;
    }
}
