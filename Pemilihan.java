import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=======================");
        System.out.print("Masukkan nilai Tugas: "); 
        double tugas = scanner.nextDouble();
        System.out.print("Masukkan nilai Kuis: ");
        double kuis = scanner.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = scanner.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = scanner.nextDouble();
        System.out.println("=======================");      
        System.out.println("=======================");

        // Validasi rentang nilai (0–100)
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai Tidak Valid");
            scanner.close();
            return; // Hentikan program jika ada nilai tidak valid
        }

        // Hitung nilai akhir dengan bobot: Tugas 20%, Kuis 20%, UTS 30%, UAS 30% (total 100%)
        double nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);

        // Konversi ke nilai huruf
        String nilaiSetara = "";
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiSetara = "A";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            nilaiSetara = "B+";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            nilaiSetara = "B";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiSetara = "C+";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiSetara = "C";
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            nilaiSetara = "D";
        } else if (nilaiAkhir >= 0 && nilaiAkhir < 39) {
            nilaiSetara = "E";
        } else {
            nilaiSetara = "Nilai di luar jangkauan"; // Antisipasi jika nilaiAkhir di luar 0-100
        }

        // Tentukan status kelulusan
        String status;
        if (nilaiSetara.equals("A") || nilaiSetara.equals("B+") || nilaiSetara.equals("B") || 
            nilaiSetara.equals("C+") || nilaiSetara.equals("C")) {
            status = "SELAMAT ANDA LULUS";
        } else {
            status = "TIDAK LULUS";
        }

        System.out.println("Nilai Akhir: " + String.format("%.2f", nilaiAkhir));
        System.out.println("Nilai Huruf: " + nilaiSetara);
        System.out.println("=======================");
        System.out.println("=======================");
        System.out.println(status);

        scanner.close();
    }
}