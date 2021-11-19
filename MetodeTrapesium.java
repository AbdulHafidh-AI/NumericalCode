/**
 * Sebuah class untuk menentukan soal integral dengan metode trapesium
 * @author Abdul Hafidh
 * @version 2021.11.18
 */
public class MetodeTrapesium 
{
     /**
     * Sebuah method untuk mendefinisikan fungsi dari soal yang diberikan
     * @param x
     * @return Math.pow(x, 0.1) * (1.2 - x) * (1 - Math.pow(bilanganEuler, pangkat))
     */
    public static double fungsi(double x)
    {
        double pangkat = 20 * x - 20;
        double bilanganEuler = Math.exp(1.0); 
        return Math.pow(x, 0.1) * (1.2 - x) * (1 - Math.pow(bilanganEuler, pangkat));
    }
    
    public static double trapesium(double batasBawah, double batasAtas, double n)
    {
        // Menghitung tahap pembagi h
        double h = (batasAtas - batasBawah) / n;
        // Mencari hasil integrasi
        double hasilIntegrasi = fungsi(batasBawah) + fungsi(batasAtas);

        for(int i = 0; i <= n; i++){
            double k = batasBawah + i * h;
            hasilIntegrasi = hasilIntegrasi + 2 * fungsi(k);
        }
                    // Mencari nilai akhir integrasi
                    hasilIntegrasi = hasilIntegrasi * h/2;
        return hasilIntegrasi;
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
        int n = 10;
        // Mencari jawaban dari soal yang diberikan dengan metode trapesium
        double jawaban = trapesium(batasBawah, batasAtas, n);
        // Mencetak hasil dari jawaban
        System.out.println("Jadi jawaban dengan menggunakan metode Trapesium adalah : " + jawaban);
    }
}
