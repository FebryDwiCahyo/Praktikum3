import java.util.Scanner;

/**
 * Program ini menghitung luas lingkaran berdasarkan jari-jari yang dimasukkan oleh pengguna.
 */
public class MenghitungLuasLingkaran {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk masukan pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan jari-jari lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        /**
         * @param r
         */
        double r = input.nextDouble();

        // Menghitung luas lingkaran
        double luas = Math.PI * r * r;

        // Menampilkan hasil
        System.out.println("Luas lingkaran dengan jari-jari " + r + " adalah: " + luas);

        // Menutup Scanner untuk mencegah kebocoran sumber daya
        input.close();
    }
}
