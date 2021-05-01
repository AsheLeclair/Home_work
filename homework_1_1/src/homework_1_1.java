public class homework_1_1 {
    public static void main(String[] args) {
        Bitwise2();
    }
   /* static void Bitwise1(){
        int a = 42;
        int b = 15;
        int c = a | b;// 00101010 = 42; 00001111 = 15; 00101111 = 47
        int d = a & b;// 00101010 = 42; 00001111 = 15; 00001010 = 10
        int e = a ^ b;// 00101010 = 42; 00001111 = 15; 00100101 = 37
        int f = ~b;// 00001111 = 15; 11111111111111111111111111010101;
        int g = ~a;// 00101010 = 42; 11111111111111111111111111110000;
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println("a | b = " + Integer.toBinaryString(c));
        System.out.println("a & b = " + Integer.toBinaryString(d));
        System.out.println("a ^ b = " + Integer.toBinaryString(e));
        System.out.println("~ a = " + Integer.toBinaryString(f));
        System.out.println("~ b = " + Integer.toBinaryString(g));
    }*/
    static void Bitwise2(){
        int a = -42;
        int b = -15;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = ~b;
        int g = ~a;
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println("a | b = " + Integer.toBinaryString(c));
        System.out.println("a & b = " + Integer.toBinaryString(d));
        System.out.println("a ^ b = " + Integer.toBinaryString(e));
        System.out.println("~ a = " + Integer.toBinaryString(f));
        System.out.println("~ b = " + Integer.toBinaryString(g));
    }
}
