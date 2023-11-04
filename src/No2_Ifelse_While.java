import java.util.*;
public class No2_Ifelse_While {
    public static void main(String[] args) {
        Scanner inputuser = new Scanner (System.in);
        int Angka, lol = 0;
        System.out.print("Masukkan Nama Anda: ");
        String Nama = inputuser.nextLine();
        System.out.print("Masukkan angka favorit anda (1-10): ");
        try {
            Angka = Integer.parseInt(inputuser.nextLine());
            while (lol<10) {
                lol++;
                if (lol == Angka) {
                    System.out.println("\""+ Angka +"\" Angka ini adalah favorit " + Nama);
                }
                else {
                    System.out.println("Cetak Angka biasa \"" + lol +"\"");
                }
            }
        }
        catch (Exception e) {
            System.out.println("Anda hanya bisa memasukkan angka");
        }

    }
}
