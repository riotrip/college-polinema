package minggu3;

import java.util.Scanner;

public class KasKelas {
    private double saldo;

    public KasKelas(double saldoAwal) {
        saldo = saldoAwal;
    }

    public void tambahSaldo(double jumlah) {
        saldo += jumlah;
    }

    public void tarikSaldo(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan saldo awal kas kelas: ");
        double saldoAwal = input.nextDouble();

        KasKelas kasKelas = new KasKelas(saldoAwal);

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Saldo");
            System.out.println("2. Tarik Saldo");
            System.out.println("3. Lihat Saldo");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0/1/2/3): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah yang ingin ditambahkan: ");
                    double tambah = input.nextDouble();
                    kasKelas.tambahSaldo(tambah);
                    System.out.println("Saldo berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan jumlah yang ingin ditarik: ");
                    double tarik = input.nextDouble();
                    kasKelas.tarikSaldo(tarik);
                    break;
                case 3:
                    System.out.println("Saldo kas kelas saat ini: " + kasKelas.getSaldo());
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        input.close();
    }
}
