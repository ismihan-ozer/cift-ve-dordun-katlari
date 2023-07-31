import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Sayıları girin (Programı sonlandırmak için -1'e basın):");

        while (true) {
            number = scanner.nextInt();
            if (number == -1) {
                break;
            }

            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
        }

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + sum);
    }
}
