import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, k;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        k = scanner.nextInt();
        double ortalama, toplam = 0;
        int sayac = 0;

        for (i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayac++;
            }
        }
        ortalama = toplam / sayac;

        if (sayac == 0) {
            System.out.println("3'e ve 4'e Bölünen Sayı Yoktur.");

        } else System.out.println("3'e ve 4'e Bölünen Sayıların Ortalaması:  " + ortalama);
        
    }
}