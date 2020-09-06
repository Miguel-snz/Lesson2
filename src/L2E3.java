import java.util.Scanner;

public class L2E3 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int number = vvod.nextInt();
        if (number>0) {
            number += 1;
        }
        System.out.println(number);
    }
}
