package Jobsheet1;
import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        // Inisialisasi data kode plat dan kota
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] KOTA = {
            {"BANTEN"},           // A
            {"JAKARTA"},          // B
            {"BANDUNG"},          // D
            {"CIREBON"},          // E
            {"BOGOR"},            // F
            {"PEKALONGAN"},       // G
            {"SEMARANG"},         // H
            {"SURABAYA"},         // L
            {"MALANG"},           // N
            {"TEGAL"}             // T
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode plat mobil: ");
        char kodeInput = input.next().toUpperCase().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodeInput) {
                System.out.println("Nama kota: " + KOTA[i][0]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }

        input.close();
    }
}