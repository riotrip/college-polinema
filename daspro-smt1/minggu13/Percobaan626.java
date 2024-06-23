package minggu13;

import java.util.Scanner;

public class Percobaan626 {
    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.println("Masukkan panjang: ");
        p = scan.nextInt();
        System.out.println("Masukkan lebar: ");
        l = scan.nextInt();
        System.out.println("Masukkan tinggi: ");
        t = scan.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah: " + L);

        vol = hitungVolume(p, t, l);
        System.out.println("Volume balok adalah: " + vol);
    }
}
