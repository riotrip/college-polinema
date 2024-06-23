package minggu3;

import java.util.Scanner;

public class MahasiswaMain26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mahasiswa[] mhsArray = new Mahasiswa[3];

        for (int i = 0; i < mhsArray.length; i++) {
            mhsArray[i] = new Mahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            mhsArray[i].nama = scan.nextLine();
            System.out.print("Masukkan NIM: ");
            mhsArray[i].nim = scan.nextInt();
            System.out.print("Masukkan jenis kelamin: ");
            mhsArray[i].jk = scan.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            mhsArray[i].ipk = scan.nextFloat();
            scan.nextLine();
        }
        System.out.println();
        for (int i = 0; i < mhsArray.length; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            mhsArray[i].tampilData();
        }
        float rataRataIPK = mhsArray[0].hitungRataRataIPK(mhsArray);
        System.out.println("\nRata-rata IPK: " + rataRataIPK);

        Mahasiswa mahasiswaTerbaik = mhsArray[0].ipTertinggi(mhsArray);
        System.out.println("\nData Mahasiswa dengan IPK Terbesar:");
        mahasiswaTerbaik.tampilData();
    }
}
