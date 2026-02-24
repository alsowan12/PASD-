
public class MataKuliah_04{
    public MataKuliah_04 () {
        // Konstruktor default
    }
    public MataKuliah_04 (String nm, String kodeMK, int sks, int jmlhjam) {
        // Konstruktor berparameter
        nama = nm;
        this.kodeMK = kodeMK;
        this.sks = sks;
        this.jmlhjam = jmlhjam;
    }
    // Atribut-atribut untuk menyimpan data mata kuliah seperti nama, kodeMK, sks, dan jmlhjam yang bisa disebut dengan menggunakan this
    String nama;
    String kodeMK;
    int sks;
    int jmlhjam;
    // Method untuk menampilkan data mata kuliah, mengubah sks, menambah jam, dan mengurangi jam
    void tampilkanInformasi() {
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jmlhjam);
    }
    void ubahSKS (int sksBaru) {
        sks = sksBaru;
    }
    void tambahJam (int jamBaru) {
        jmlhjam += jamBaru;
    }
    void kurangiJam (int jamKurang) {
        if (jamKurang <= jmlhjam) {
            jmlhjam -= jamKurang;
        } else {
            System.out.println("Jumlah jam yang dikurangi melebihi jumlah jam saat ini.");
        }
    }
    // Method untuk mengubah sks, menambah jam, dan mengurangi jam

}
