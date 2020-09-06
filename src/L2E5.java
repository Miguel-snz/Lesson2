import java.util.Scanner;

public class L2E5 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        int b = vvod.nextInt();
        int c = vvod.nextInt();

        if (a <= b && a <= c) {
            System.out.println(a);
        } else if (b <= a && b <= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
