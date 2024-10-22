import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        System.out.println("Lütfen 10 tane sayı girin:");
        for (int i = 0; i < 10; i++) {
            int sayi = scanner.nextInt();
            toplam += sayi;
        }
    }
}
