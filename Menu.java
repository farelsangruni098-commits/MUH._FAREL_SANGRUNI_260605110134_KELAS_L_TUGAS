
import java.util.Scanner;

public class Menu {

    static Scanner input = new Scanner(System.in);

    // Method untuk menghitung faktorial menggunakan rekursi
    static long faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    // Method untuk menghitung perpangkatan menggunakan for
    static double perpangkatan(double a, int b) {
        double hasil = 1;

        for (int i = 1; i <= Math.abs(b); i++) {
            hasil *= a;
        }

        if (b < 0) {
            hasil = 1 / hasil;
        }

        return hasil;
    }

    // Method untuk perkalian matriks 2x2
    static void perkalianMatriks() {

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];

        System.out.println("\n=== INPUT MATRIKS A ===");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("\n=== INPUT MATRIKS B ===");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = input.nextInt();
            }
        }

        // Proses perkalian matriks
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = 0;

                for (int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Menampilkan hasil
        System.out.println("\n=== HASIL PERKALIAN MATRIKS ===");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method utama
    public static void main(String[] args) {

        int pilihan;

        while (true) {

            System.out.println("\n================================");
            System.out.println(" KALKULATOR MATEMATIKA & MATRIKS");
            System.out.println("================================");
            System.out.println("1. Hitung Faktorial");
            System.out.println("2. Hitung Perpangkatan");
            System.out.println("3. Perkalian Matriks 2 x 2");
            System.out.println("0. Keluar");
            System.out.println("================================");

            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan bilangan: ");
                    int n = input.nextInt();

                    if (n < 0 || n > 20) {
                        System.out.println("Input harus antara 0 sampai 20!");
                    } else {
                        System.out.println("Hasil faktorial = " + faktorial(n));
                    }
                    break;

                case 2:
                    System.out.print("Masukkan bilangan pokok: ");
                    double a = input.nextDouble();

                    System.out.print("Masukkan bilangan pangkat: ");
                    int b = input.nextInt();

                    if (a == 0 && b < 0) {
                        System.out.println("Bilangan tidak boleh 0 dengan pangkat negatif!");
                    } else {
                        System.out.println("Hasil perpangkatan = " + perpangkatan(a, b));
                    }
                    break;

                case 3:
                    perkalianMatriks();
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        }
    }
}
