public class ClassDosenMain_04 {
    public static void main(String[] args) {
        ClassDosen_04 dosen1 = new ClassDosen_04();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Muhammad Ali Farhan";
        dosen1.bidangKeahlian = "Ilmu Komputer";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;

        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2024);
        dosen1.ubahKeahlian("Kecerdasan Buatan");
        dosen1.tampilkanInformasi();

        ClassDosen_04 dosen2 = new ClassDosen_04("D002", "Dr. Varrel Naswa", "Progammer", true, 2012);
        dosen2.tampilkanInformasi();
        ClassDosen_04 dosen3 = new ClassDosen_04("D003", "Dr. Annisa Nabila", "Fisika", true, 2015);
        dosen3.tampilkanInformasi();
        ClassDosen_04 dosen4 = new ClassDosen_04("D004", "Dr. Rina", "Data Science", true, 2018);
        dosen4.tampilkanInformasi();
    }
}
