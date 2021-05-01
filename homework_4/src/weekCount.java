import java.util.Scanner;

public class weekCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        int weeks = weektodays(days);
        if (weeks == 0){
            System.out.println("0 недель");
        }
        else if(weeks == 1){
            System.out.println("1 неделя");
        }
        else if (weeks >= 2 && weeks <= 4){
            System.out.println(weeks + " недели");
        }
        else if (weeks >= 5 && weeks <= 20){

        }
    }
    public static int weektodays(int days){
        int weeks;
        weeks = days / 7;
        return weeks;
    }
}
