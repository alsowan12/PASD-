package Jobsheet9_Stack;

public class Mahasiswa04 {
    String nama, nim, kelas;
    int nilai;

    public Mahasiswa04(String nama, String nim, String kelas) {
        this.kelas = kelas;
        this.nama = nama;
        this.nim = nim;
        nilai = -1;
    }
    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
