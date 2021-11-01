import java .util.Scanner;
/**
 * Sebuah source code untuk mencari jawaban dari soal dibawah ini dengan menggunakan metode NewtonRaphson
 * 1. Tentukan akar dari persamaan 4x^3 – 15x^2 + 17x – 6 = 0 menggunakan  Metode Newton Raphson dengan  x0=3, toleransi galat relatif x=0.001
 * 2. Tentukan akar dari persamaan x^3 – 2x^2 + 3x – 6 = 0 menggunakan Metode Newton Raphson dengan  x0=3, toleransi galat relatif x=0.001
 * 3. Tentukan akar dari persamaan x^5 + 2x^2 – 4 = 0 menggunakan Metode Newton Raphson dengan  x0=1, toleransi galat relatif x=0.001
 * @author Abdul Hafidh
 * @version 2021.10.15
 */
public class NewtonRaphson {
    /** 
     * Sebuah method untuk mendefinisikan fungsi no 1 f(x) = 4x^3 - 15x^2 + 17x - 6 
     * @param x
     * @return 4 * Math.pow(x, 3) - 15 * Math.pow(x, 2) + 17 * x - 6
     */
    public static double fungsiNo1(double x){
        return 4 * Math.pow(x, 3) - 15 * Math.pow(x, 2) + 17 * x - 6;
    }

    /**
     * Sebuah method untuk mendefinisikan fungsi derivatives no 1 f'(X) = 12x^2 - 30x + 17
     * @param x
     * @return 12 * Math.pow(x, 2) - 30 * x + 17
     */
    public static double fungsiDerivativesNo1(double x){
        return 12 * Math.pow(x, 2) - 30 * x + 17;
    }

    /**
     * Sebuah method untuk mendefinisikan fungsi no 2 f(x) = x^3 – 2x^2 + 3x – 6 
     * @param x
     * @return Math.pow(x, 3) - 2 * Math.pow(x, 2) + 3 * x - 6
     */
    public static double fungsiNo2(double x){
        return  Math.pow(x, 3) - 2 * Math.pow(x, 2) + 3 * x - 6;
    }
    /**
     * Sebuah method untuk mendefinisikan fungsi derivatives no 2 f(x) = 3x^2 - 4x + 3
     * @param x
     * @return 3 * Math.pow(x, 2) - 4 * x + 3
     */
    public static double fungsiDerivativesNo2(double x){
        return 3 * Math.pow(x, 2) - 4 * x + 3;
    }
    /**
     * Sebuah method untuk mendefinisikan fungsi no 3 f(x) = x^5 + 2x^2 – 4
     * @param x
     * @return Math.pow(x, 5) + 2 * Math.pow(x, 2) - 4
     */
    public static double fungsiNo3(double x){
        return Math.pow(x, 5) + 2 * Math.pow(x, 2) - 4;
    }
    /**
     * Sebuah method untuk mendefinisikan fungsi derivatives no 3 f(x) = 5x^4 + 4x
     * @param x
     * @return 5 * Math.pow(x,4) + 4 * x
     */
    public static double fungsiDerivativesNo3(double x){
        return 5 * Math.pow(x,4) + 4 * x;
    }
    
    /**
     * Sebuah Method main untuk mencetak output
     * @param args
     */

    public static void main(String[] args) {
        String ulang;
        char lagi;
        int pilihan; 
        int iterasiAwal;
        double e; // Toleransi error
        int N = 10; // Iterasi Maksimum
        double x0; // Nilai pendekatan awal
        double fx0; // fungsi f(x0) dari nilai pendekatan awal
        double fx0Turunan; // fungsi turunan fx0
        double fx1  = 0;  // fungsi dari nilai x yang telah di cari
        double x1 = 0; // nilai x yang akan di cari
        try(Scanner in = new Scanner(System.in)){
            do{
            System.out.print("Masukkan pilihan soal: ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                System.out.println("========================== SOAL NO 1 =======================================");
                System.out.printf("\nIterasi\t\tx0\t\tf(x0)\t\tx1\t\tf(x1)\n");
                   iterasiAwal = 1; // iterasi dimulai dari 1
                    x0 = 3;
                    e = 0.001;
                    // Mencari nilai f(x0) dan f'(x0)
                    do{
                    fx0 = (double) fungsiNo1(x0);
                    fx0Turunan = (double) fungsiDerivativesNo1(x0);
                    if (fx0Turunan == 0){
                        System.out.println("ERROR MATEMATIKA");
                        break;
                    }
                    x1 = x0 - fx0/fx0Turunan;
                    System.out.printf("%d\t\t%f\t%f\t%f\t%f\n", iterasiAwal,x0,fx0,x1,fx1);
                    x0 = x1;
                    iterasiAwal = iterasiAwal + 1;
                    if(iterasiAwal > N){
                        System.out.println("Tidak konvergen");
                        break;
                    }
                    fx1 = (double) fungsiNo1(x1);
                }while(Math.abs(fx1) > e); 
                System.out.println("Akar persamaanya adalah : " + x1);
                    break;
                case 2:
                System.out.println("========================== SOAL NO 2 =======================================");
                System.out.printf("\nIterasi\t\tx0\t\tf(x0)\t\tx1\t\tf(x1)\n");
                    iterasiAwal = 1; // iterasi dimulai dari 1
                    x0 = 3;
                    e = 0.001;
                    do{
                        // Mencari nilai f(x0) dan f'(x0)
                        fx0 = (double) fungsiNo2(x0);
                        fx0Turunan = (double) fungsiDerivativesNo2(x0);
                        if (fx0Turunan == 0){
                            System.out.println("ERROR MATEMATIKA");
                            break;
                        }
                        x1 = x0 - fx0/fx0Turunan;
                        System.out.printf("%d\t\t%f\t%f\t%f\t%f\n", iterasiAwal,x0,fx0,x1,fx1);
                        x0 = x1;
                        iterasiAwal = iterasiAwal + 1;
                        if(iterasiAwal > N){
                            System.out.println("Tidak konvergen");
                            break;
                        }
                        fx1 = (double) fungsiNo2(x1);
                    }while(Math.abs(fx1) > e); 
                    System.out.println("Akar persamaanya adalah : " + x1);
                    break;
                case 3:
                System.out.println("========================== SOAL NO 3 =======================================");
                System.out.printf("\nIterasi\t\tx0\t\tf(x0)\t\tx1\t\tf(x1)\n");
                    iterasiAwal = 1; // iterasi dimulai dari 1
                    x0 = 1;
                    e = 0.001;
                    do{
                        // Mencari nilai f(x0) dan f'(x0)
                        fx0 = (double) fungsiNo3(x0);
                        fx0Turunan = (double) fungsiDerivativesNo3(x0);
                        if (fx0Turunan == 0){
                            System.out.println("ERROR MATEMATIKA");
                        }
                        x1 = x0 - fx0/fx0Turunan;
                        System.out.printf("%d\t\t%f\t%f\t%f\t%f\n", iterasiAwal,x0,fx0,x1,fx1);
                        x0 = x1;
                        iterasiAwal = iterasiAwal + 1;
                        if(iterasiAwal > N){
                            System.out.println("Tidak konvergen");
                        }
                        fx1 = (double) fungsiNo3(x1);
                    }while(Math.abs(fx1) > e); 
                    System.out.println("Akar persamaanya adalah : " + x1);
                    break;
                default:
                System.out.println("Pilihan yang anda masukkan tidak tersedia");
                    break;
            }
        // Membuat suatu pernyataan untuk bermain kembali atau tidak  
        System.out.print("Apakah kamu ingin melihat jawaban dari soal yang lainya? (y/n) :  ");
        in.nextLine(); // Memanggil method ini agar bisa dideteksi oleh method Scanner in dari library import java.util.Scanner
        ulang = in.nextLine();
        lagi = ulang.charAt(0); // Memanggil method charAt(0) karena pada akhir inputan user hanya boleh menginput satu huruf 
        }while(lagi == 'Y' || lagi == 'y');
        }
        System.out.println("========   TERIMA KASIH ========");
    }
}