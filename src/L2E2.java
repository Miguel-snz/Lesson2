import java.util.Scanner;

public class L2E2 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner (System.in);
        int number = vvod.nextInt();
        int digit, sum = 0;
        digit = number%10;
        sum += digit;

        number = number/10;
        digit = number%10;
        sum += digit;

        number = number/10;
        sum += number;

        System.out.println(sum);
    }
}
