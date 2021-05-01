public class homework_1_2 {
    public static void main(String[] args) {
        int a = 8;
        a = 5 + 2 / a;
        System.out.println(a);
        a = 8;
        a = (5 + 2) / a;
        System.out.println(a);
        a = 8;
        a = (5 + 3) / a;
        System.out.println(a);
        a = 8;
        a = (5 + 3) / --a;
        System.out.println(a);
        a = 8;
        a = (5 * 2 >> 3) / --a;
        System.out.println(a);
        a = 8;
        a = ((5 + (7 > 20 ? (68 >= 68 ? 1 : 0) : 22 * 2 >> 3)) / --a);
        a = 6 - (((2 > 3) && (12 * 12) <= 119) ? 1 : 0);
    }
}
