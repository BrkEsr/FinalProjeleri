import java.util.Scanner;

public class Proje2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();


        if (isPalindrom(kelime)) {
            System.out.println(kelime + " kelimesi bir palindromdur.");
        } else {
            System.out.println(kelime + " kelimesi bir palindrom değildir.");
        }
    }


    private static boolean isPalindrom(String kelime) {

        kelime = kelime.replaceAll("\\s", "").toLowerCase();

        int uzunluk = kelime.length();
        for (int i = 0; i < uzunluk / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(uzunluk - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
