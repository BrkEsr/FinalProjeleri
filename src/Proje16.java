import java.util.Scanner;

public class Proje16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Metni giriniz: ");
        String metin = scanner.nextLine();


        System.out.print("Kaç kez kontrol edilecek karakteri giriniz: ");
        char kontrolEdilecekKarakter = scanner.next().charAt(0);


        int karakterSayisi = 0;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == kontrolEdilecekKarakter) {
                karakterSayisi++;
            }
        }


        System.out.println("'" + kontrolEdilecekKarakter + "' karakteri metin içinde " + karakterSayisi + " kez bulunmaktadır.");
    }
}
