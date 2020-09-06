import java.util.Scanner;

public class L2E4 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int number = vvod.nextInt();

        if (number > 0) {
            number += 1;
        } else if (number < 0) {
            number -= 2;
        } else number = 10;

        System.out.println(number);
    }
}
