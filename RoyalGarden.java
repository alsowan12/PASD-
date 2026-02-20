import java.util.Scanner;

public class RoyalGarden {

    // Fungsi untuk menampilkan data stok bunga dengan header dinamis
    public static void tampilkanStokBunga(String[] cabang, int[][] stokBunga, String[] jenisBunga) {
        System.out.println("\n===============================================================================");
        System.out.println("DATA STOCK BUNGA HARIAN");
        System.out.println("===============================================================================");
        
        // Membuat header kolom dinamis berdasarkan jenisBunga
        System.out.printf("%-18s", "Cabang");
        for (String bunga : jenisBunga) {
            System.out.printf(" | %-10s", bunga);
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
        
        for (int i = 0; i < cabang.length; i++) {
            System.out.printf("%-18s", cabang[i]);
            for (int j = 0; j < jenisBunga.length; j++) {
                System.out.printf(" | %-10d", stokBunga[i][j]);
            }
            System.out.println();
        }
        System.out.println("===============================================================================");
    }
    
    // Fungsi untuk menampilkan rincian harga
    public static void tampilkanHarga(String[] jenisBunga, int[] hargaBunga) {
        System.out.println("\n===============================================================================");
        System.out.println(" RINCIAN HARGA BUNGA");
        System.out.println("===============================================================================");
        
        for (int i = 0; i < jenisBunga.length; i++) {
            System.out.printf("%-30s : Rp %,d%n", jenisBunga[i], hargaBunga[i]);
        }
        System.out.println("===============================================================================");
    }
    
    // Fungsi untuk menghitung pendapatan satu cabang
    public static int hitungPendapatan(int[] stok, int[] harga) {
        int total = 0;
        for (int i = 0; i < stok.length; i++) {
            total += stok[i] * harga[i];
        }
        return total;
    }
    
    // Fungsi untuk menentukan status cabang
    public static String tentukanStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
    
    // Fungsi untuk menampilkan detail perhitungan cabang
    public static void tampilkanDetailCabang(String namaCabang, int[] stok, String[] jenisBunga, 
                                             int[] harga, int totalPendapatan, String status) {
        System.out.println("\n===============================================================================");
        System.out.println(" " + namaCabang);
        System.out.println("===============================================================================");
        
        for (int i = 0; i < jenisBunga.length; i++) {
            int subtotal = stok[i] * harga[i];
            System.out.printf("%-15s : %2d x Rp %,10d = Rp %,15d%n", 
                jenisBunga[i], stok[i], harga[i], subtotal);
        }
        
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("%-30s : Rp %,15d%n", "TOTAL PENDAPATAN", totalPendapatan);
        System.out.printf("%-30s : %-15s%n", "STATUS", status);
        System.out.println("===============================================================================");
    }
    
    // Fungsi untuk menampilkan ringkasan semua cabang
    public static void tampilkanRingkasan(String[] cabang, int[] totalPendapatan, String[] statusCabang) {
        System.out.println("\n===============================================================================");
        System.out.println(" RINGKASAN STATUS CABANG");
        System.out.println("===============================================================================");
        System.out.printf("%-18s | %-20s | %-20s%n", "Cabang", "Total Pendapatan", "Status");
        System.out.println("-------------------------------------------------------------------------------");
        
        for (int i = 0; i < cabang.length; i++) {
            System.out.printf("%-18s | Rp %,15d | %-20s%n", 
                cabang[i], totalPendapatan[i], statusCabang[i]);
        }
        System.out.println("===============================================================================");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Data RoyalGarden
        String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        int[][] stokBunga = {
            {10, 5, 15, 7},   // RoyalGarden 1: Aglonema, Keladi, Alocasia, Mawar
            {6, 11, 9, 12},   // RoyalGarden 2
            {2, 10, 10, 5},   // RoyalGarden 3
            {5, 7, 12, 9}     // RoyalGarden 4
        };
        
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        
        // Array untuk menyimpan hasil
        int[] totalPendapatan = new int[cabang.length];
        String[] statusCabang = new String[cabang.length];
        
        // Header Program
        System.out.println("===============================================================================");
        System.out.println(" ROYALGARDEN - TOKO BUNGA");
        System.out.println("===============================================================================");
        
        // Tampilkan data stok menggunakan fungsi
        tampilkanStokBunga(cabang, stokBunga, jenisBunga);
        
        // Tampilkan harga menggunakan fungsi
        tampilkanHarga(jenisBunga, hargaBunga);
        
        // Hitung dan tampilkan detail setiap cabang
        System.out.println("\n===============================================================================");
        System.out.println(" PERHITUNGAN PENDAPATAN CABANG");
        System.out.println("===============================================================================");
        
        for (int i = 0; i < cabang.length; i++) {
            // Hitung pendapatan menggunakan fungsi
            totalPendapatan[i] = hitungPendapatan(stokBunga[i], hargaBunga);
            
            // Tentukan status menggunakan fungsi
            statusCabang[i] = tentukanStatus(totalPendapatan[i]);
            
            // Tampilkan detail menggunakan fungsi
            tampilkanDetailCabang(cabang[i], stokBunga[i], jenisBunga, hargaBunga, 
                                 totalPendapatan[i], statusCabang[i]);
        }
        
        // Tampilkan ringkasan menggunakan fungsi
        tampilkanRingkasan(cabang, totalPendapatan, statusCabang);
        
        // Hitung grand total
        int grandTotal = 0;
        for (int i = 0; i < totalPendapatan.length; i++) {
            grandTotal += totalPendapatan[i];
        }
        
        System.out.println("\n===============================================================================");
        System.out.printf("%-40s : Rp %,15d%n", "TOTAL PENDAPATAN SELURUH CABANG", grandTotal);
        System.out.println("===============================================================================");
        
        input.close();
    }
}