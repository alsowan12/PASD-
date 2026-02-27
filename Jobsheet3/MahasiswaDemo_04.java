package Jobsheet3;

public class MahasiswaDemo_04 {
    public static void main(String[] args){
        Mahasiswa_04[] arrayOfMahasiswa = new Mahasiswa_04[3];
        arrayOfMahasiswa[0] = new Mahasiswa_04();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "Agnes Titanta Kinanta";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;

        arrayOfMahasiswa[1] = new Mahasiswa_04();
        arrayOfMahasiswa[1].nim = "23417201723";
        arrayOfMahasiswa[1].nama = "Ahcmad Maulana Hamzah";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk = (float) 3.36;

        arrayOfMahasiswa[2] = new Mahasiswa_04();
        arrayOfMahasiswa[2].nim = "244107023006";
        arrayOfMahasiswa[2].kelas = "TI-2E";
        arrayOfMahasiswa[2].nama = "Dirhamawan Putranto";
        arrayOfMahasiswa[2].ipk = (float) 3.80;

        System.out.println("NIM: " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama: " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas: " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK: " + arrayOfMahasiswa[0].ipk);
        System.out.println("_________________________________________________");
        System.out.println("NIM: " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama: " + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas: " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK: " + arrayOfMahasiswa[1].ipk);
        System.out.println("_________________________________________________");
        System.out.println("NIM: " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama: " + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas: " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK: " + arrayOfMahasiswa[2].ipk);
        System.out.println("_________________________________________________");
    }
    
}
