package BruteForceDivideConquer.Minggu5;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen :");
        int elemen = sc.nextInt();
        Sum sm = new Sum(elemen);
        for (int i=0 ; i<elemen; i++){
            System.out.print("Masukkan keuntungan ke-" + (i+1) + " : ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println("Total Keuntungan Menggunakan BF : " + sm.TotalBF());
        System.out.println("Total Keuntungan Menggunakan DC : " + sm.TotalDC(sm.keuntungan, 0, sm.keuntungan.length - 1));

    }
}
