/**
 * Sebuah class untuk menentukan soal integral dengan menggunakan metode simpson
 * @author Abdul Hafidh
 * @version 2021.11.18
 */
public class MetodeSimpson
{
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
    /**
     * Sebuah Method untuk mencari nilai integrasi
     * @param batasBawah
     * @param batasAtas
     * @param n
     * @return
     */
    public static double simpson(double batasBawah, double batasAtas,int n)
    {
        double h = (batasAtas - batasBawah) / n;
        // Mencari nilai
        double hasil = fungsi(batasBawah) + fungsi(batasAtas);
        // 1/3 simpson
        for(int i = 0; i <= n; i++){
            double k = batasBawah + i * h;
            if (i % 2 == 0){
                hasil = hasil + 2 * fungsi(k);
            }else{
                hasil = hasil + 4 * fungsi(k);
            }
        }
        // Mencari hasil dari integrasi
        hasil = hasil * h/3;
        return hasil;
    }
    /**
     * Command line argument
     * @param args
     */
    public static void main(String[] args) {
        
        int batasBawah = 0;
        int batasAtas = 1;
        int n = 2;
        double jawaban = simpson(batasBawah, batasAtas, n);
        System.out.println("Jadi jawaban dengan menggunakan metode Simpson 1/3 adalah : " + jawaban);
    }
}
