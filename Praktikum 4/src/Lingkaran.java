public class Lingkaran {
    private final double pi = 3.14;

    // Menghitung Luas Lingkaran Menggunakan JariJari
    public float luas(int r) {
        return (float) (this.pi * r * r);
    }

    // Menghitung Luas Lingkaran Menggunakan Diameter
    public double luas(double d) {
        return (double) (0.25 * this.pi * d);
    }
}
