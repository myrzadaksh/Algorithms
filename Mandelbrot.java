import java.awt.Color;

public class Mandelbrot {

    public static Color mand(Complex z0) {
        Complex z = z0;
        for (int t = 0; t < 255; t++) {
            if (z.abs() > 2.0) return Color.WHITE;
            z = z.times(z);
            z = z.plus(z0);
        }
        return Color.BLACK;
    }

    public static void main(String[] args) {
        double xc = Double.parseDouble(args[0]);
        double yc = Double.parseDouble(args[1]);
        double size = Double.parseDouble(args[2]);
        int N = Integer.parseInt(args[3]);
        Picture pic = new Picture(N, N);

        for (int col = 0; col < N; col++)
            for (int row = 0; row < N; row++) {
                double x0 = xc - size / 2 + size * col / N;
                double y0 = yc - size / 2 + size * row / N;
                Complex z0 = new Complex(x0, y0);
                Color color = mand(z0);
                pic.set(col, N - 1 - row, color);
            }
        pic.show();
    }
}
//-0.5 0 2 32 - *typical input to test*
