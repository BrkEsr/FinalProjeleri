public class Proje10 {

    public static void main(String[] args) {
        int sayi = 2;
        int adet = 0;

        System.out.println("İlk 20 asal sayı:");

        while (adet < 20) {
            if (asalMi(sayi)) {
                System.out.print(sayi + " ");
                adet++;
            }
            sayi++;
        }
    }


    private static boolean asalMi(int sayi) {
        if (sayi < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}

