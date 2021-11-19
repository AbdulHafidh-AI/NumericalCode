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
        double pangkat = 20 * x - 20; 
        double bilanganEuler = Math.exp(1.0); // Nilai bilangan euler
        return Math.pow(x, 0.1) * (1.2 - x) * (1 - Math.pow(bilanganEuler, pangkat));
    }
    /**
     * Sebuah Method untuk mencari nilai integrasi
     * @param batasBawah
     * @param batasAtas
     * @param n
     * @return hasilIntegrasi
     */
    public static double simpson(double batasBawah, double batasAtas,int n)
    {
        // Menghitung tahap pembagi h
        double h = (batasAtas - batasBawah) / n;
        // Mencari hasil integrasi
        double hasilIntegrasi = fungsi(batasBawah) + fungsi(batasAtas);
        // 1/3 simpson
        for(int i = 1; i <= n; i++){
            double k = batasBawah + i * h;
            if (i % 2 == 0){
                hasilIntegrasi = hasilIntegrasi + 2 * fungsi(k);
            }else{
                hasilIntegrasi = hasilIntegrasi + 4 * fungsi(k);
            }
        }
        // Mencari hasil dari integrasi
        hasilIntegrasi = hasilIntegrasi* h/3;
        return hasilIntegrasi;
    }
    /**
     * Command line argument
     * @param args
     */
    public static void main(String[] args) {
        // Inisialisasi variabel
        int batasBawah = 0;
        int batasAtas = 1;
        int n = 10;
        // Memanggil fungsi ini untuk mencari soal yang diberikan dengan metode simpson
        double jawaban = simpson(batasBawah, batasAtas, n);
        // Mencetak hasil 
        System.out.println("Jadi jawaban dengan menggunakan metode Simpson 1/3 adalah : " + jawaban);
    }
}
