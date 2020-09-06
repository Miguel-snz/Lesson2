import java.util.Scanner;

public class L2E6 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int number = vvod.nextInt();
        if (number < 0 && number%2!=0){
            System.out.println("Отрицательное нечетное число");
        }
        else if (number > 0 && number%2!=0){
            System.out.println("Положительное нечетное число");
        }
        else if (number < 0 && number%2==0){
            System.out.println("Отрицательное четное число");
        }
        else if (number > 0 && number%2==0){
            System.out.println("Положительное четное число");
        }
        else {
            System.out.println("Нулевое число");
        }
    }
}
