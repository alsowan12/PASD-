package Jobsheet2;

public class MahasiswaMain {
    public static void main(String[] args){
        Mahasiswa_04 mhsl = new Mahasiswa_04 ();
        mhsl.nama = "Muhammad ALi Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "TI-2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanData();
        mhsl.ubahKelas("SI-2K");
        mhsl.updateIPK(3.60);
        mhsl.tampilkanData();

    }
    
}
