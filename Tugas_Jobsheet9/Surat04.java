package Tugas_Jobsheet9;

public class Surat04 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin;
    int durasi;

    // Konstruktor Parameter
    public Surat04(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilData() {
        System.out.printf("ID: %s | Nama: %s | Kelas: %s | Izin: %c | Durasi: %d hari\n", 
            idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
    }
}
    

