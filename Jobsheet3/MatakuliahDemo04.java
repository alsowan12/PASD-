package Jobsheet3;
import java.util.Scanner;
public class MatakuliahDemo04{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Berapa Banyak Matakuliah yang ingin dimasukkan?");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Matakuliah04[] arrayOfMatakuliah = new Matakuliah04[jumlah];
        String kode, nama, dummy;
        int sks, jumlahjam;

        for (int i = 0; i < arrayOfMatakuliah.length; i++){
            System.out.println("\nMasukkan Data Matakuliah Ke-" + (i +1));
            System.out.println("Kode :");
            kode = sc.nextLine();
            System.out.println("Nama :");
            nama = sc.nextLine();
            System.out.println("SKS :");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.println("Jumlah Jam :");
            dummy = sc.nextLine();
             jumlahjam = Integer.parseInt(dummy);
            System.out.println("----------------------------------------------");
            
           
            arrayOfMatakuliah[i] = new Matakuliah04();
            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahjam);
    }
            System.out.println("\n === Data Hasil Input ===");
            for (int j = 0; j < arrayOfMatakuliah.length; j++){
                System.out.println("\nData Ke-" + (j + 1));
                arrayOfMatakuliah[j].cetakInfo();
            }
            
}
}