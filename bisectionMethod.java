import java.util.Scanner; // Library Scan
/**
 * Source code untuk menghitung suatu persamaan Non linier dengan Metode Biseksi
 * @author Abdul Hafidh
 * @version 2021.09.22 
 */
public class bisectionMethod{
    /**
     * Sebuah method untuk mendefinisikan f(x)
     * @param double x
     * @return nilai
     */
    public static double fungsi(double x){
        return x*x*x - x*x + 2;
    }
    public static void main(String[] args) {
        // Inisialisasi variabel
        int a; // Batas Xbawah
        int b; // Batas Xatas
        int e; // Toleransi error
        int N; // Iterasi Maksimum
        double x = 0;
        // Proses input
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Masukkan nilai batas Xbawah: ");
            a = in.nextInt();
            System.out.print("Masukkan nilai batas Xatas: ");
            b = in.nextInt();
            System.out.print("Toleransi error: ");
            e = in.nextInt();
            System.out.print("Iterasi Maksimum: ");
            N = in.nextInt();
        }
        // Mencari nilai f(a) * f(b)
        int fa = (int) fungsi(a);
        int fb = (int) fungsi(b);
        int hasilPerkalian = fa * fb;
        // Kondisi
        if (hasilPerkalian > 0){
            System.out.print("Tidak ada akar dari persamaaan tersebut");
        }
    }
}