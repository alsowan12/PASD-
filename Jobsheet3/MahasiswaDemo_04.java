package Jobsheet3;
import java.util.Scanner;
public class MahasiswaDemo_04 {
    public static void main(String[] args){
        
Scanner sc = new Scanner (System.in);
        Mahasiswa_04[] arrayOfMahasiswa = new Mahasiswa_04[3];
        String dummy;
        for (int i = 0; i < 3; i++){
            arrayOfMahasiswa[i] = new Mahasiswa_04();
            System.out.println("Masukkan Data Mahasiswa Ke-" + (i + 1));
            System.out.println("NIM :");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.println("Nama :");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.println("Kelas :");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.println("IPK :");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------------------------");

        }
       
        for (int i=0; i < 3; i++){
            System.out.println("Data Ke" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
        } 

    }
    
}
