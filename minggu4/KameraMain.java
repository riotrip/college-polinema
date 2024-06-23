package minggu4;

import java.util.Scanner;

public class KameraMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Kamera[] kamera = new Kamera[2];
        kamera[0] = new Kamera("Canon", "DSLR", 10000);
        kamera[1] = new Kamera("Sony", "Mirrorless", 20000);
        boolean run = true;
        int jumlahHari;
        double biayaSewa;
        String member;
        do {
            System.out.println("\n======================");
            System.out.println("Selamat datang di program persewaan kamera");
            System.out.println("Pilih kamera yang ingin anda sewa:");
            System.out.println("======================");
            for (int i = 0; i < kamera.length; i++) {
                System.out.println("Pilihan " + (i + 1) + " = ");
                kamera[i].tampilData();
            }
            System.out.println("Pilihan 0 = Keluar");
            System.out.println("======================");
            System.out.print("(1/2/0): ");
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("======================");
                    kamera[0].tampilData();
                    System.out.println("======================");
                    System.out.println("Apakah anda memiliki membership? (y/n)");
                    scan.nextLine();
                    member = scan.nextLine();
                    if (member.equalsIgnoreCase("y")) {
                        kamera[0].setHargaSewaPerHari(8000);
                        System.out.println("Harga sewa per hari anda: Rp. " + kamera[0].getHargaSewaPerHari());
                    }
                    System.out.println("Masukkan berapa hari anda menyewanya: ");
                    jumlahHari = scan.nextInt();
                    biayaSewa = kamera[0].hitungBiayaSewa(jumlahHari);
                    System.out.println("Total biaya sewa anda selama " + jumlahHari + " hari: Rp. " + biayaSewa);
                    kamera[0].setHargaSewaPerHari(10000);
                    System.out.println("======================");
                    break;
                case 2:
                    System.out.println("======================");
                    kamera[1].tampilData();
                    System.out.println("======================");
                    System.out.println("Apakah anda memiliki membership? (y/n)");
                    scan.nextLine();
                    member = scan.nextLine();
                    if (member.equalsIgnoreCase("y")) {
                        kamera[1].setHargaSewaPerHari(18000);
                        System.out.println("Harga sewa per hari anda: Rp. " + kamera[1].getHargaSewaPerHari());
                    }
                    System.out.println("Masukkan berapa hari anda menyewanya: ");
                    jumlahHari = scan.nextInt();
                    biayaSewa = kamera[1].hitungBiayaSewa(jumlahHari);
                    System.out.println("Total biaya sewa anda selama " + jumlahHari + " hari: Rp. " + biayaSewa);
                    kamera[1].setHargaSewaPerHari(20000);
                    System.out.println("======================");
                    break;
                case 0:
                    System.out.println("======================");
                    System.out.println("Terima Kasih!");
                    run = false;
                    break;
                default:
                    System.out.println("======================");
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (run);
    }
}
