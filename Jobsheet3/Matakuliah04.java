package Jobsheet3;
public class Matakuliah04{

    public String kode;
    public String nama;
    public int sks;
    public int jumlahjam;
public Matakuliah04(){
    }
    public Matakuliah04(String kode, String nama, int sks, int jumlahjam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }
    void tambahData(String kode, String nama, int sks, int jumlahjam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }
    void cetakInfo(){
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahjam);
    }
}