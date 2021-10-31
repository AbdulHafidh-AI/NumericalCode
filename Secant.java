import java.util.Scanner;
/**
 * 1.  fungsi f(x) yaitu x*exp(-x)+sin(2*x) dengan nilai x=[1, 2.4], nilai iterasi adalah 10 dan nilai toleransi error adalah 0.002.
 * 2.  fungsi f(x) yaitu cos(x+1)+exp(-x+2) dengan nilai x=[1,3], nilai iterasi adalah 10 dan nilai toleransi error adalah 0.001.
 * 3.  fungsi f(x) yaitu cos(x)-sin(x) dengan nilai x=[0,2], nilai iterasi adalah 10 dan nilai toleransi error adalah 0.001.
 * @author Abdul Hafidh
 * @version 2021.10.30
 */
public class Secant{

    /** 
     * Sebuah method untuk mendefinisikan fungsi no 1 f(x) =  x*exp(-x)+sin(2*x)
     * @param x
     * @return x *Math.exp(-x) + Math.toRadians(2 * x)
     */
    public static double fungsiNo1(double x){
        double a = Math.toRadians(2 * x); // Mengubah persamaannya ke nilai radiant dulu sebelum memanggil method sin
        return x *Math.exp(-x) + Math.sin(a);
    }

    /** 
     * Sebuah method untuk mendefinisikan fungsi no 2 f(x) =  cos(x+1)+exp(-x+2)
     * @param x
     * @return Math.cos(Sudut) + Math.exp(-x + 2)
     */
    public static double fungsiNo2(double x){
         // Mengubah ke persamaaan radiant terlebih dahulu
        double a = Math.toRadians(x + 1);
        return Math.cos(a) + Math.exp(-x + 2);
    }

    /** 
     * Sebuah method untuk mendefinisikan fungsi no 3 f(x) =  cos(x)-sin(x)
     * @param x
     * @return Math.cos(sudut) - sudut2
     */
    public static double fungsiNo3(double x){
        // Mengubah ke persamaaan radiant terlebih dahulu
        double sudutCos = Math.toRadians(x); 
        double sudutSin = Math.toRadians(x);
        return Math.cos(sudutCos) - Math.sin(sudutSin);
    }

    /**
     * Sebuaah method main yang bertujuan untuk mengeluarkan output
     * @param args
     */
    public static void main(String[] args) {
        //Inisialisasi Variabel
        double x0,x1,e;
        double x2;
        double fx0,fx1,fx2 = 0;
        int N,iterasi;
        String ulang;
        char lagi;
        int soal;
        Scanner in = new Scanner(System.in);
        do{
        System.out.print("Masukkan Jawaban soal yang kamu inginkan: ");
        soal = in.nextInt();
        switch (soal) {
            case 1:
            System.out.println("========================== SOAL NO 1 =======================================");
            System.out.printf("\nIterasi\t\tx0\t\tf(x0)\t\tx1\t\tf(x1)\t\tx2\t\tf(x2)\n");
            // Memberi nilai untuk masing-masing variabel di bawah sesuai dengan apa yang diinginkan oleh nomor 1
                break;
            case 2:
            System.out.println("========================== SOAL NO 2 =======================================");
            System.out.printf("\nIterasi\t\tx0\t\tf(x0)\t\tx1\t\tf(x1)\t\tx2\t\tf(x2)\n");
            // Memberi nilai untuk masing-masing variabel di bawah sesuai dengan apa yang diinginkan oleh nomor 2
                 break;
            case 3:
            System.out.println("========================== SOAL NO 3 =======================================");
            System.out.printf("\nIterasi\t\tx0\t\tf(x0)\t\tx1\t\tf(x1)\t\tx2\t\tf(x2)\n");
            // Memberi nilai untuk masing-masing variabel di bawah sesuai dengan apa yang diinginkan oleh nomor 3
                 break;
            default:
                break;
        }
         // Membuat suatu pernyataan untuk bermain kembali atau tidak  
         System.out.print("Apakah kamu ingin melihat jawaban dari soal yang lainya? (y/n) :  ");
         in.nextLine(); // Memanggil method ini agar bisa dideteksi oleh method Scanner in dari library import java.util.Scanner
         ulang = in.nextLine();
         lagi = ulang.charAt(0); // Memanggil method charAt(0) karena pada akhir inputan user hanya boleh menginput satu huruf 
    }while(lagi == 'Y' || lagi == 'y');
        // Sebuah Method untuk menutup inputan
        in.close();
    }
}