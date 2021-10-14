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
     * Sebuah method untuk mendefinisikan fungsi f(x) = 4x^3 - 15x^2 + 17x - 6 
     * @param x
     * @return 4 * Math.pow(x, 3) - 15 * Math.pow(x, 2) + 17 * x - 6
     */
    public static double fungsiNo1(double x){
        return 4 * Math.pow(x, 3) - 15 * Math.pow(x, 2) + 17 * x - 6;
    }

    /**
     * Sebuah method untuk mendefinisikan fungsi f(x) = x^3 – 2x^2 + 3x – 6 
     * @param x
     * @return Math.pow(x, 3) - 2 * Math.pow(x, 2) + 3 * x - 6
     */
    public static double fungsiNo2(double x){
        return  Math.pow(x, 3) - 2 * Math.pow(x, 2) + 3 * x - 6;
    }

    /**
     * Sebuah method untuk mendefinisikan fungsi f(x) = x^5 + 2x^2 – 4
     * @param x
     * @return Math.pow(x, 5) + 2 * Math.pow(x, 2) - 4
     */
    public static double fungsiNo3(double x){
        return Math.pow(x, 5) + 2 * Math.pow(x, 2) - 4;
    }

    public static void main(String[] args) {
        
    }
}
