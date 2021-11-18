public class Tabel{
    // FIelds
    static double batasBawah;
    static double batasAtas;

    public static void nilaiBatasNo1(){
        
    }

    /** 
     * Sebuah method untuk mendefinisikan fungsi no 1 f(x) =  x*exp(-x)+sin(2*x)
     * @param x
     * @return x * Math.exp(-x) + Math.sin(a)
     */
    public static double fungsiNo1(double x){
        return x * Math.exp(-x) + Math.sin( 2 * x);
    }
    
    /** 
     * Sebuah method untuk mendefinisikan fungsi no 2 f(x) =  cos(x+1)+exp(-x+2)
     * @param x
     * @return Math.cos(x + 1) + Math.exp(-x + 2)
     */
    public static double fungsiNo2(double x){
        // Mengubah ke persamaaan radiant terlebih dahulu
       return Math.cos(x + 1) + Math.exp(-x + 2);
   }


    public static void main(String[] args) {

        // Inisialisasi variabel
        double x0 = 1;
        double x1 = 3;
        int  N = 10;
        double xi [] = new double[N];
        int i = 0;
        double fx [] = new double[N];
        double xBawah = 0;
        double xAtas;
        // Menghitung jumlah pembagi H
        double H = (x1 - x0) / N;
        System.out.println("Nilai H: " + H );
            System.out.printf("i\t\txi\t\tfx\n");
            for(i = 0; i <= N; i++){
                xi [i] = x0 + (i * H); 
                fx [i]= (double) fungsiNo2(xi[i]);
                System.out.printf("%d\t\t%f\t%f\n",i,xi[i],fx[i]);
                if(fx[i] * fx[i] < 0){
                    xBawah = xi[i];
                    xAtas = xi[i + 1];
                    System.out.println("Nilai x bawah adalah " + xBawah);
                }
            } 
            
        } 

       // System.out.println("Nilai x bawah adalah " + xBawah);
        
        


       

        
    }

