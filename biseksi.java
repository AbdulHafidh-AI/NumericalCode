/**
 * Carilah akar dari fungsi berikut ini:
 * f(x) = x3 – 10x + 8
 * Diketahui batas bawah adalah 2.4 dan batas atas adalah 2.7. Nilai toleransi error adalah 0.02 dengan iterasi maksimum 5. 
 * @author AbdulHafidh_2008107010056
 * @version 2021.08.24
 */
public class biseksi {
    /**
     * Sebuah method untuk mendefinisikan fungsi f(x)
     * @param x
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
            do{
                if (fa * fxr < 0){
                    b = xr;
                }else{
                    a = xr;
                }
                System.out.println("Pada Iterasi ke "+ iterasi + " Akarnya adalah: " + xr);
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

