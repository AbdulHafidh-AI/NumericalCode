/**
 * 
 * 
 * @author Abdul Hafidh
 * @version 2021.09.30
 */
public class regulaFalsi {
    /**
     * Sebuah method untuk mendefinisikan f(X)
     * @param x
     * return x*x-4*x+3
     */
    public static double fungsi(double x){
        return x*x-4*x+3;
    }
    public static void main(String[] args) {
        // Inisialisasi variabel
        double a = -3;
        double b = 4;
        double e = 0.01;
        double N = 10;
        double I = 1;
        double x;
        double fx;

        // Mencari nilai f(a) dan f(b)
        double fa = (double) fungsi(a);
        double fb = (double) fungsi(b);

        if (fa * fb == 0){
            System.out.println("Tidak ada akar");
        }
        // Untuk Untuk iterasi I = 1 s/d n atau error > e
        do{
        // Menghitung x
         x = (fb * a - fa *b) / fb - fa;
        // Menghitung nilai f(X)
         fx = (double) fungsi(x);
        if(fa * fx < 0){
            b = x;
        }else{
            a = x;
        }
        I++;
    }while(Math.abs(fx) < e);
        System.out.println("Jadi nilai x nya adalah" + x);

    }
}
