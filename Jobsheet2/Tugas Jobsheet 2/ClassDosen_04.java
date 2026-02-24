public class ClassDosen_04 {
    public ClassDosen_04 () {
        // Konstruktor default
    }
    public ClassDosen_04 (String idDosen, String nama, String bidangKeahlian, boolean statusAktif, int tahunBergabung){
        this.idDosen = idDosen;
        this.nama = nama;
        this.bidangKeahlian = bidangKeahlian;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
    }
    String idDosen;
    String nama;
    String bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;
    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
    }
    void setStatusAktif(boolean statusBaru) {
        statusAktif = statusBaru;
    }
    void hitungMasaKerja(int tahunSekarang) {
        int masaKerja = tahunSekarang - tahunBergabung;
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }
    void ubahKeahlian(String keahlianBaru) {
        bidangKeahlian = keahlianBaru;
    }
}
