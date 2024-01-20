import java.util.Scanner;

public class Proje7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam50VeUstu = 0;
        int toplam50denKucuk = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz (0-100 arası): ");
            int sayi = scanner.nextInt();

            if (sayi >= 0 && sayi <= 100) {
                if (sayi >= 50) {
                    toplam50VeUstu += sayi;
                } else {
                    toplam50denKucuk += sayi;
                }
            } else {
                System.out.println("Geçersiz sayı. Lütfen 0-100 arasında bir sayı giriniz.");
                i--;
            }
        }


        double oran = (toplam50denKucuk == 0) ? 0 : (double) toplam50VeUstu / toplam50denKucuk;


        System.out.println("50 ve üstü olanların toplamı: " + toplam50VeUstu);
        System.out.println("50'den küçük olanların toplamı: " + toplam50denKucuk);
        System.out.println("Oran: " + oran);
    }
}

