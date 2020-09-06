import java.util.Scanner;

public class L2E7 {
    public static void main(String[] args) {
        System.out.println("Введите продолжительность разговора");
        Scanner vvodMin = new Scanner(System.in);
        int min = vvodMin.nextInt();
        System.out.println("Введите код города: Москва-905, Ростов-194, Краснодар-491, Киров-800");
        Scanner vvodKod = new Scanner(System.in);
        String kod = vvodKod.nextLine();
        double Moskva = 4.15;
        double Rostov = 1.98;
        double Krasnodar = 2.69;
        double Kirov = 5.00;

        switch (kod){
            case "905":
                System.out.println("Москва. Стоимость разговора: "+min*Moskva);
                break;
            case "194":
                System.out.println("Ростов. Стоимость разговора: "+min*Rostov);
                break;
            case "491":
                System.out.println("Краснодар. Стоимость разговора: "+min*Krasnodar);
                break;
            case "800":
                System.out.println("Киров. Стоимость разговора: "+min*Kirov);
                break;
            default:
                System.out.println("Введенный код не указан в списке");
        }
    }
}
