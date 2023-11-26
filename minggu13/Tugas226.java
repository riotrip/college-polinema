package minggu13;

import java.util.Scanner;

public class Tugas226 {
    static void inputNilai(int[][] nilai, String[] nama) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai dari Mahasiswa " + nama[i]);
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai Minggu ke-" + (j + 1) + " : ");
                nilai[i][j] = scan.nextInt();
            }
            System.out.println();
        }
    }

    static void tampilNilai(int[][] nilai, String[] nama) {
        int i = 0;
        for (int a[] : nilai) {
            System.out.print("Nilai dari Mahasiswa " + nama[i] + "\t: ");
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
            i++;
        }
    }

    static String cariMhsTertinggi(int[][] nilai, String[] nama) {
        String NamaTertinggi = null;
        int maks = nilai[0][0];
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > maks) {
                    maks = nilai[i][j];
                    NamaTertinggi = nama[i];
                }
            }
        }
        return NamaTertinggi;
    }

    static void cariNilaiMaks(int[][] nilai, int[] nilaiMaks) {
        nilaiMaks[0] = nilai[0][0];
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > nilaiMaks[0]) {
                    nilaiMaks[0] = nilai[i][j];
                    nilaiMaks[1] = j + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] nilaiMhs = new int[5][7];
        String[] namaMhs = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
        int[] nilaiTertinggi = new int[2];

        inputNilai(nilaiMhs, namaMhs);

        tampilNilai(nilaiMhs, namaMhs);

        String mhsNilaiTertinggi = cariMhsTertinggi(nilaiMhs, namaMhs);
        System.out.println("\nMahasiswa dengan nilai tertinggi adalah " + mhsNilaiTertinggi);

        cariNilaiMaks(nilaiMhs, nilaiTertinggi);
        System.out.println("Nilai tertinggi adalah " + nilaiTertinggi[0] + " di Minggu ke-" + nilaiTertinggi[1]);

    }
}