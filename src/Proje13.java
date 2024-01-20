import java.util.Scanner;

public class Proje13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("1. kenar uzunluğunu giriniz: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("2. kenar uzunluğunu giriniz: ");
        double kenar2 = scanner.nextDouble();

        System.out.print("3. kenar uzunluğunu giriniz: ");
        double kenar3 = scanner.nextDouble();

        if (ucgenOlsunMu(kenar1, kenar2, kenar3)) {

            if (kenar1 == kenar2 && kenar2 == kenar3) {
                System.out.println("Bu bir eşkenar üçgendir.");
            } else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
                System.out.println("Bu bir ikizkenar üçgendir.");
            } else if (ucgenDikKenarMi(kenar1, kenar2, kenar3) || ucgenDikKenarMi(kenar2, kenar1, kenar3) || ucgenDikKenarMi(kenar3, kenar1, kenar2)) {
                System.out.println("Bu bir dik kenar üçgendir.");
            } else {
                System.out.println("Bu bir üçgendir.");
            }
        } else {
            System.out.println("Bu kenar uzunlukları ile bir üçgen oluşturulamaz.");
        }
    }


    private static boolean ucgenOlsunMu(double kenar1, double kenar2, double kenar3) {
        return (kenar1 + kenar2 > kenar3) && (kenar1 + kenar3 > kenar2) && (kenar2 + kenar3 > kenar1);
    }


    private static boolean ucgenDikKenarMi(double a, double b, double c) {
        return (a * a + b * b == c * c);
    }
}

