package minggu4;

import java.util.Scanner;

public class HargaBayar26 {
    public static void main(String[] args) {
        int harga, jumlah, halBuku;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan merk buku yang dibeli: ");
        merkBuku = input.next();
        System.out.println("Masukkan jumlah halaman buku dibeli: ");
        halBuku = input.nextInt();
        System.out.println("Masukkan jumlah diskon buku dibeli: ");
        dis = input.nextDouble();
        System.out.println("Masukkan harga barang yang dibeli: ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli: ");
        jumlah = input.nextInt();

        total = harga*jumlah;
        jmlDis = total*dis;
        bayar = total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah: "+jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah: "+bayar);
    }   
}
    