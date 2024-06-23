package minggu3.BangunRuang;

import java.util.Scanner;

public class BangunMain26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        do {
            System.out.println("\nPilih Bangun: ");
            System.out.println("1 = Kerucut");
            System.out.println("2 = Limas Segi Empat");
            System.out.println("3 = Bola");
            System.out.print("(1/2/3): ");
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Masukkan jumlah bangun kerucut yang dimiliki: ");
                    int n = scan.nextInt();
                    Kerucut[] krArray = new Kerucut[n];
                    for (int i = 0; i < krArray.length; i++) {
                        System.out.println("Bangun Ruang Kerucut ke-" + (i + 1));
                        krArray[i] = new Kerucut();
                        System.out.print("Masukkan jari-jari: ");
                        krArray[i].jariJari = scan.nextDouble();
                        System.out.print("Masukkan sisi miring : ");
                        krArray[i].sisiMiring = scan.nextDouble();
                        System.out
                                .println("Luas Permukaan Bangun Kerucut ke-" + (i + 1) + ": " + krArray[i].lpKerucut());
                        System.out.println("Volume Bangun Kerucut ke-" + (i + 1) + ": " + krArray[i].volKerucut());
                    }
                    break;
                case 2:
                    System.out.println("Masukkan jumlah bangun limas segi empat yang dimiliki: ");
                    n = scan.nextInt();
                    Limas[] lmArray = new Limas[n];
                    for (int i = 0; i < lmArray.length; i++) {
                        System.out.println("Bangun Ruang Limas Segi Empat ke-" + (i + 1));
                        lmArray[i] = new Limas();
                        System.out.print("Masukkan alas: ");
                        lmArray[i].sisi = scan.nextDouble();
                        System.out.print("Masukkan tinggi: ");
                        lmArray[i].tinggi = scan.nextDouble();
                        System.out.println("Luas Permukaan Bangun Kerucut ke-" + (i + 1) + ": " + lmArray[i].lpLimas());
                        System.out.println("Volume Bangun Kerucut ke-" + (i + 1) + ": " + lmArray[i].volLimas());
                    }
                    break;
                case 3:
                    System.out.println("Masukkan jumlah bangun bola yang dimiliki: ");
                    n = scan.nextInt();
                    Bola[] blArray = new Bola[n];
                    for (int i = 0; i < blArray.length; i++) {
                        System.out.println("Bangun Ruang Bola ke-" + (i + 1));
                        blArray[i] = new Bola();
                        System.out.print("Masukkan jari-jari: ");
                        blArray[i].jariJari = scan.nextDouble();
                        System.out.println("Luas Permukaan Bangun Kerucut ke-" + (i + 1) + ": " + blArray[i].lpBola());
                        System.out.println("Volume Bangun Kerucut ke-" + (i + 1) + ": " + blArray[i].volBola());
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (run);
    }
}
