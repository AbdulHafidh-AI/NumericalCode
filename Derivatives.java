import java.util.function.DoubleFunction;

public class Derivatives {
    // approximate the limit
    private static final double DX = 0.0001;

    /**
     * @param f f(x), the function to derive
     * @return f'(x), the derivative of the f(x)
     */
    private static DoubleFunction<Double> derive(DoubleFunction<Double> f) {
        return (x) -> (f.apply(x + DX) - f.apply(x)) / DX;
    }

    public static void main(String[] args) {
        {
            // f(x) = x^3
            DoubleFunction<Double> cube = (x) -> x * x * x;
            System.out.println(cube);
            
            // f'(x) = 3 * x^2
            DoubleFunction<Double> cubeDeriv = derive(cube);

            // f'(2) = 3 * 2^2 = 12
            assert Math.round(cubeDeriv.apply(2)) == 12.0;

            // f'(3) = 3 * 3^2 = 27
            assert Math.round(cubeDeriv.apply(3)) == 27.0;

            // f'(4) = 3 * 4^2 = 48
            assert Math.round(cubeDeriv.apply(4)) == 48.0;
        }

        {
            // f(x) = sin(x), f'(x) = cos(x)
            DoubleFunction<Double> sinDeriv = derive(Math::sin);
            
            // f'(2π) = cos(2π) = 1.0
            assert Math.round(sinDeriv.apply(Math.PI * 2)) == 1.0;
        }
    }
}