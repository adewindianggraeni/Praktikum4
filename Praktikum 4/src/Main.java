public class Main {
    public static void main(String[] args) {
        // Membuat Object Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("===== LUAS LINGKARAN =====");
        System.out.println("Luas Lingkaran  : " + lingkaran.luas(10));
        System.out.println("Luas Lingkaran  : " + lingkaran.luas(10.5));

        System.out.println();

        // Membuat Object Hewan
        System.out.println("===== SUARA BINATANG =====");
        Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();

        kucing.bersuara();
        anjing.bersuara();
    }
}