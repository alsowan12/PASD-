package BruteForceDivideConquer.Minggu5;

public class Faktorial {

    int FaktorialBF(int n) {
    int Fakto = 1;
    int i = 1; 

    while (i <= n) { 
        Fakto = Fakto * i;
        i++; 
    }
    return Fakto;
}
    
    int FaktorialDC (int n){
        if ( n == 1){
            return 1;
        } else {
            int fakto = n * FaktorialDC(n-1);
            return fakto;
        }
    }
}
