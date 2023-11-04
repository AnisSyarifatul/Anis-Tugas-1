import java.util.*;
public class No3_ProgramZodiak {
    public static void main(String[] args) {
        Scanner inputuser = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda: ");
        String Nama = inputuser.nextLine();
        System.out.print("Masukkan Tanggal Lahir Anda (ex=2): ");
        int Tanggal = Integer.parseInt(inputuser.nextLine());
        System.out.print("Masukkan Bulan Lahir Anda (ex=5): ");
        int Bulan = Integer.parseInt(inputuser.nextLine());
        System.out.print("Masukkan Tahun Lahir Anda (ex=2005): ");
        int Tahun = Integer.parseInt(inputuser.nextLine());
        System.out.println("==========================");
        System.out.println("Nama: " + Nama);
        System.out.println("Tanggal Lahir: " + Tanggal + "-" + Bulan + "-" + Tahun);
        if ((Tanggal >= 21 && Bulan == 3) || (Tanggal <= 19 && Bulan == 4)) {
            System.out.println("Zodiak: Aries");
        }
        if ((Tanggal >= 20 && Bulan == 4) || (Tanggal <= 20 && Bulan == 5)) {
            System.out.println("Zodiak: Taurus");
        }
        if ((Tanggal >= 21 && Bulan == 5) || (Tanggal <= 20 && Bulan == 6)) {
            System.out.println("Zodiak: Gemini");
        }
        if ((Tanggal >= 21 && Bulan == 6) || (Tanggal <= 22 && Bulan == 7)) {
            System.out.println("Zodiak: Cancer");
        }
        if ((Tanggal >= 23 && Bulan == 7) || (Tanggal <= 22 && Bulan == 8)) {
            System.out.println("Zodiak: Leo");
        }
        if ((Tanggal >= 23 && Bulan == 8) || (Tanggal <= 22 && Bulan == 9)) {
            System.out.println("Zodiak: Virgo");
        }
        if ((Tanggal >= 23 && Bulan == 9) || (Tanggal <= 22 && Bulan == 10)) {
            System.out.println("Zodiak: Libra");
        }
        if ((Tanggal >= 23 && Bulan == 10) || (Tanggal <= 21 && Bulan == 11)) {
            System.out.println("Zodiak: Scorpio");
        }
        if ((Tanggal >= 22 && Bulan == 11) || (Tanggal <= 21 && Bulan == 12)) {
            System.out.println("Zodiak: Sagittarius");
        }
        if ((Tanggal >= 22 && Bulan == 12) || (Tanggal <= 19 && Bulan == 1)) {
            System.out.println("Zodiak: Capricorn");
        }
        if ((Tanggal >= 20 && Bulan == 1) || (Tanggal <= 18 && Bulan == 2)) {
            System.out.println("Zodiak: Aquarius");
        }
        if ((Tanggal >= 19 && Bulan == 2) || (Tanggal <= 20 && Bulan == 3)) {
            System.out.println("Zodiak: Pisces");
        }
    }
}
