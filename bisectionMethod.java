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
     * @return 
     */
    public static double f(double x){
        return x - 3 / (x * x) - 4;
    }
    public static void main(String[] args) {
        // Inisialisasi variabel
        int a; // Batas Xbawah
        int b; // Batas Xatas
        int e; // Toleransi error
        int N; // Iterasi Maksimum
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

    }
}