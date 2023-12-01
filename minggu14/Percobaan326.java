package minggu14;

import java.util.Scanner;

public class Percobaan326 {
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal: ");
        saldoAwal = scan.nextInt();
        System.out.print("Lamanya investasi (tahun): ");
        tahun = scan.nextInt();

        System.out.println("Jumlah saldo setelah " + tahun + " tahun: ");
        System.out.println(hitungLaba(saldoAwal, tahun));
    }
}
