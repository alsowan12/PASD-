
public class MataKuliahMain04 {
    public static void main(String[] args) {
        MataKuliah_04 mk1 = new MataKuliah_04();
        mk1.nama = "Algoritma Struktur Data";
        mk1.kodeMK = " IF1234";
        mk1.sks = 4;
        mk1.jmlhjam = 48;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(16);
        mk1.kurangiJam(8);
        mk1.tampilkanInformasi();

        MataKuliah_04 mk2 = new MataKuliah_04 ("Struktur Data", "IF5678", 3, 48);
        mk2.tampilkanInformasi();
        MataKuliah_04 mk3 = new MataKuliah_04("Pemrograman Berorientasi Objek", "IF9012", 3, 48);
        mk3.tampilkanInformasi();
        MataKuliah_04 mk4 = new MataKuliah_04("Basis Data", "IF3456", 3, 48);
        mk4.tampilkanInformasi();
    }
    
}
