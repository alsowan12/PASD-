import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = input.nextInt();
        input.nextLine(); // membersihkan newline

        String[][] jadwal = new String[n][4];

        // a. Menginput data jadwal
        inputJadwal(jadwal, input);

        // Menu interaktif
        int pilihan;
        do {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan seluruh jadwal");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan mata kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSemuaJadwal(jadwal);
                    break;
                case 2:
                    System.out.print("Masukkan hari (contoh: Senin): ");
                    String hari = input.nextLine();
                    tampilkanJadwalBerdasarkanHari(jadwal, hari);
                    break;
                case 3:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String mk = input.nextLine();
                    tampilkanJadwalBerdasarkanMK(jadwal, mk);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        input.close();
    }

    // Fungsi untuk menginput data jadwal
    public static void inputJadwal(String[][] jadwal, Scanner input) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = input.nextLine();
            System.out.print("Ruang: ");
            jadwal[i][1] = input.nextLine();
            System.out.print("Hari: ");
            jadwal[i][2] = input.nextLine();
            System.out.print("Jam: ");
            jadwal[i][3] = input.nextLine();
        }
    }

    // Fungsi untuk menampilkan seluruh jadwal dalam bentuk tabel
    public static void tampilkanSemuaJadwal(String[][] jadwal) {
        System.out.println("\n============================================");
        System.out.printf("%-3s | %-20s | %-10s | %-10s | %-15s%n", "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("============================================");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-3d | %-20s | %-10s | %-10s | %-15s%n",
                    (i + 1), jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
        System.out.println("============================================");
    }

    // Fungsi untuk menampilkan jadwal berdasarkan hari
    public static void tampilkanJadwalBerdasarkanHari(String[][] jadwal, String hari) {
        boolean found = false;
        System.out.println("\nJadwal untuk hari " + hari + ":");
        System.out.println("============================================");
        System.out.printf("%-3s | %-20s | %-10s | %-15s%n", "No", "Mata Kuliah", "Ruang", "Jam");
        System.out.println("============================================");
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-3d | %-20s | %-10s | %-15s%n",
                        (i + 1), jadwal[i][0], jadwal[i][1], jadwal[i][3]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada jadwal pada hari " + hari);
        }
        System.out.println("============================================");
    }

    // Fungsi untuk menampilkan jadwal berdasarkan nama mata kuliah
    public static void tampilkanJadwalBerdasarkanMK(String[][] jadwal, String mk) {
        boolean found = false;
        System.out.println("\nJadwal untuk mata kuliah \"" + mk + "\":");
        System.out.println("============================================");
        System.out.printf("%-3s | %-10s | %-10s | %-15s%n", "No", "Ruang", "Hari", "Jam");
        System.out.println("============================================");
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.printf("%-3d | %-10s | %-10s | %-15s%n",
                        (i + 1), jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada jadwal dengan mata kuliah " + mk);
        }
        System.out.println("============================================");
    }
}