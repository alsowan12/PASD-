package Jobsheet2;

public class MahasiswaMain {
    public static void main(String[] args){
        Mahasiswa_04 mhs1 = new Mahasiswa_04 ();
        mhs1.nama = "Muhammad ALi Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "TI-2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI-2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa_04 mhs2 = new Mahasiswa_04 ("Annisa Nabila","2141720160", 3.25, "TI-2L");
        mhs2.updateIPK(3.60);
        mhs2.tampilkanInformasi();    

        Mahasiswa_04 mhs3 = new Mahasiswa_04("Rina", "1234567890", 3.75, "TI-2M");
        mhs3.ubahKelas("SI-2M");
        mhs3.updateIPK(3.80);
        mhs3.tampilkanInformasi();

        Mahasiswa_04 mhs4 = new Mahasiswa_04("Dewi Lestari", "2256789012", 3.80, "TI-2N");
        mhs4.ubahKelas("SI-2N");
        mhs4.updateIPK(3.85);
        mhs4.tampilkanInformasi();

    }
    
}
