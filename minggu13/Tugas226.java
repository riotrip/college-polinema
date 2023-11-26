package minggu13;

import java.util.Scanner;

public class Tugas226 {

    public static void main(String[] args) {
        inputNilai();
    }

    public static void inputNilai() {
        int[][] nilai = new int[5][7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan Nama Mahasiswa : ");
            sc.next();
            String namaMahasiswa = sc.nextLine();
            System.out.println("Masukkan nilai untuk " + namaMahasiswa);
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
    }
}