package Jobsheet9_Stack;

public class Mahasiswa04 {
    String nama, nim, kelas;
    double nilai;

    public Mahasiswa04(String nama, String nim, String kelas) {
        this.kelas = kelas;
        nilai = -1;
    }
    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
