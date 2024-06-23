package minggu13;

import java.util.Scanner;

public class Kubus26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s, Lp, vol;
        System.out.println("Masukkan panjang sisi kubus: ");
        s = sc.nextInt();

        Lp = hitungLp(s);
        System.out.println("Luas permukaan adalah " + Lp);

        vol = hitungVolume(s);
        System.out.println("Volume kubus adalah " + vol);
    }

    static int hitungLp(int s) {
        int Lp = 6 * s * s;
        return Lp;
    }

    static int hitungVolume(int s) {
        int vol = s * s * s;
        return vol;
    }

}