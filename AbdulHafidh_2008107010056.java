/**
 * Carilah akar dari fungsi berikut ini:
 * f(x) = x3 – 10x + 8
 * Diketahui batas bawah adalah 2.4 dan batas atas adalah 2.7. Nilai toleransi error adalah 0.02 dengan iterasi maksimum 5. 
 * @author Abdul Hafidh
 * @version 2021.09.24
 */
public class AbdulHafidh_2008107010056{
    /**
     * Sebuah method untuk mendefinisikan fungsi f(x)
     * @param double x
     * @return x * x * x - 10 * x + 8
     */
    public static double fungsi(double x){
        return x * x * x - 10 * x + 8;
    }
    public static void main(String[] args){
        // Inisialisai variabel
        double a = 2.4; // bATAS BAWAH
        double b = 2.7; // BATAS ATAS
        double e = 0.02; // TOLERANSI ERROR
        int N = 5; // ITERASI MAKSIMUM

        // Mencari nilai fa dan fb
        double fa = (double) fungsi(a);
        double fb = (double) fungsi(b);
        // Jika fa * fb > 0 maka program selesai karena tidak ada akar. jika tidak dilanjutkan
        if(fa * fb == 0){
            System.out.println("Tidak ada akar");
        }else{
            // Menghitung Xr
            double xr = (a + b) / 2;
            // Menghitung f(Xr)
            double fxr = (double) fungsi(xr);
        }


    }
}