import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Proje20 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum gününüzü (GG.AA.YYYY) formatında giriniz: ");
        String dogumGunTarihiStr = scanner.next();


        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        try {

            Date dogumGunTarihi = dateFormat.parse(dogumGunTarihiStr);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dogumGunTarihi);

            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            String[] gunler = {"", "Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};

            System.out.println("Doğum gününüz " + gunler[dayOfWeek] + " günüdür.");
        } catch (ParseException e) {
            System.out.println("Geçersiz tarih formatı. Lütfen GG.AA.YYYY formatında giriniz.");
        }
    }
}
