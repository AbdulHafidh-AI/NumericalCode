/**
 * Sebuah class untuk menentukan soal integral dengan metode trapesium
 * @author Abdul Hafidh
 * @version 2021.11.18
 */
public class MetodeTrapesium {
     /**
     * Sebuah method untuk mendefinisikan fungsi dari soal yang diberikan
     * @param x
     * @return Math.pow(x, 0.1) * (1.2 - x) * (1 - Math.pow(bilanganEuler, pangkat))
     */
    public static double fungsi(double x)
    {
        double pangkat = 20 * (x - 1);
        double bilanganEuler = 2.718;
        return Math.pow(x, 0.1) * (1.2 - x) * (1 - Math.pow(bilanganEuler, pangkat));
    }
    
    public static double trapesium(double batasBawah, double batasAtas, double n)
    {
        // Menghitung tahap pembagi h
        double h = (batasAtas - batasBawah) / n;
        // Mencari hasil integrasi
        double hasil = fungsi(batasAtas) + fungsi(batasAtas);

        for(int i = 0; i <= n; i++){
            double k = batasBawah + i *h;
            hasil = hasil + 2 * fungsi(k);

            // Mencari nilai akhir integrasi
            hasil = hasil * h/2;
        }
        return hasil;
    }

    /**
     * command line argument
     * @param args
     */
    public static void main(String[] args)
    {
        // inisialisasi variabel
        int batasBawah = 0;
        int batasAtas = 1;
        int n = 2;
        double jawaban = trapesium(batasBawah, batasAtas, n);
        System.out.println("Jadi jawaban dengan menggunakan metode Simpson 1/3 adalah : " + jawaban);
    }
}
