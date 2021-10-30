import java.util.Scanner;
/**
 * 1.  fungsi f(x) yaitu x*exp(-x)+sin(2*x) dengan nilai x=[1, 2.4], nilai iterasi adalah 10 dan nilai toleransi error adalah 0.002.
 * 2.  fungsi f(x) yaitu cos(x+1)+exp(-x+2) dengan nilai x=[1,3], nilai iterasi adalah 10 dan nilai toleransi error adalah 0.001.
 * 3.  fungsi f(x) yaitu cos(x)-sin(x) dengan nilai x=[0,2], nilai iterasi adalah 10 dan nilai toleransi error adalah 0.001.
 * @author Abdul Hafidh
 * @version 2021.10.28
 */
public class Secant{

    /** 
     * Sebuah method untuk mendefinisikan fungsi no 1 f(x) =  x*exp(-x)+sin(2*x)
     * @param x
     * @return x *Math.exp(-x) + Math.toRadians(2 * x)
     */
    public static double fungsiNo1(double x){
        return x *Math.exp(-x) + Math.toRadians(2 * x);
    }

    /** 
     * Sebuah method untuk mendefinisikan fungsi no 2 f(x) =  cos(x+1)+exp(-x+2)
     * @param x
     * @return Math.cos(Sudut) + Math.exp(-x + 2)
     */
    public static double fungsiNo2(double x){
        // Mencari nilai sin pada nilai cos(x + 1)
        double Sudut = Math.toRadians(x + 1);
        return Math.cos(Sudut) + Math.exp(-x + 2);
    }

    /** 
     * Sebuah method untuk mendefinisikan fungsi no 3 f(x) =  cos(x)-sin(x)
     * @param x
     * @return Math.cos(sudut) - sudut2
     */
    public static double fungsiNo3(double x){
        // Mencari nilai sin untuk cos (x) dan - sin(x)
        double sudut = Math.toRadians(x);
        double sudut2 = Math.toRadians(x);
        return Math.cos(sudut) - sudut2;
    }

    /**
     * Sebuaah method main yang bertujuan untuk mengeluarkan output
     * @param args
     */
    public static void main(String[] args) {
        //Inisialisasi Variabel
        double x0,x1,e;
        int N;
        int soal;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jawaban soal yang kamu inginkan: ");
        soal = in.nextInt();
        switch (soal) {
            case 1:
        
                break;
            case 2:

                 break;
            case 3:
                 break;
            default:
                break;
        }
    }
}