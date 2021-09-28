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

        // Mencari nilai f(a) dan f(b)
        double fa = (double) fungsi(a);
        double fb = (double) fungsi(b);
        
    }
}
