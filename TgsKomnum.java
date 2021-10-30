/**
 * Carilah akar dari fungsi berikut ini:
 * f(x) = 0.023529 * x^3 - 0.24118 * x^2 + 0.858824 * x - 0.99118
 * Diketahui batas bawah adalah 2 dan batas atas adalah 3 Nilai toleransi error adalah 0.02 dengan iterasi maksimum 5. 
 * @author AbdulHafidh_2008107010056
 * @version 2021.10.29
 */
public class TgsKomnum {
    /**
     * Sebuah method untuk mendefinisikan fungsi f(x) = x*x*x - 10 * x + 8
     * @param x
     * @return 0.023529 * Math.pow(x,3) - 0.24118 * Math.pow(x,2) + 0.858824 * x - 0.99118
     */
    public static double fungsi(double x){
        return 0.023529 * Math.pow(x,3) - 0.24118 * Math.pow(x,2) + 0.858824 * x - 0.99118;
    }
    public static void main(String[] args){
        // Inisialisai variabel
        double a = 2; // bATAS BAWAH
        double b = 3; // BATAS ATAS
        double e = 0.1; // TOLERANSI ERROR
        double N = 5; // Iterasi maksimum

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
            // Nilai absolut
            double batasBawahKurangBatasAtas = b - a;
            Double nilaiAbsolute = Math.abs(batasBawahKurangBatasAtas);
            double iterasi = 1;
            // Inisialisasi variabel yang akan di cetak
            int iterasiCetak = 0;
            double xrCetak = 0;
            System.out.printf("\niterasi\t\tfa\t\tfb\t\txr\t\tfxr\n");
            do{
                if (fa * fxr < 0){
                    b = xr;
                }else{
                    a = xr;
                }
                System.out.printf("%f\t%f\t%f\t%f\t%f\n",iterasi,fa,fb,xr,fxr);
                xrCetak = xr;
                xr = (a + b) / 2;
                fxr = (double) fungsi(xr);
                iterasiCetak = (int) iterasi;
                iterasi++;
            }while(nilaiAbsolute > e && iterasi <= N);
            System.out.println("Jadi Iterasi akan berhenti di " + iterasiCetak + " yaitu : " +  xrCetak );
        }


    }
}

