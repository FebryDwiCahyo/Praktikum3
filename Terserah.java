import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Terserah {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        out.println("Kalkulator Sederhana");
        out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        out.print("Masukkan operasi (+, -, *, /): ");
        char operator = input.next().charAt(0);

        out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    out.println("Pembagian oleh nol tidak valid.");
                    return;
                }
                break;
            default:
                out.println("Operasi matematika tidak valid.");
                return;
        }

        out.println("Hasil: " + hasil);

        input.close();
    }
}