public class MenghitungX {

    public static double fungsi(double x){
        return 0.023529 * Math.pow(x,3) - 0.24118 * Math.pow(x,2) + 0.858824 * x - 0.99118;
    }
    public static void main(String[] args) {
        
        System.out.println(fungsi(2.5));
    }
}
