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
        arrayOfMahasiswa[0] = new Mahasiswa_04();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "Agnes Titanta Kinanta";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;

        arrayOfMahasiswa[1] = new Mahasiswa_04();
        arrayOfMahasiswa[1].nim = "23417201723";
        arrayOfMahasiswa[1].nama = "Ahcmad Maulana Hamzah";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk = (float) 3.36;

        arrayOfMahasiswa[2] = new Mahasiswa_04();
        arrayOfMahasiswa[2].nim = "244107023006";
        arrayOfMahasiswa[2].kelas = "TI-2E";
        arrayOfMahasiswa[2].nama = "Dirhamawan Putranto";
        arrayOfMahasiswa[2].ipk = (float) 3.80;

        for (int i=0; i < 3; i++){
            System.out.println("data Mahasiswa Ke-" + (i + 1));
            System.out.println("NIM : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK : " + arrayOfMahasiswa[i].ipk);
            System.out.println("----------------------------------------------");
        } 

    }
    
}
