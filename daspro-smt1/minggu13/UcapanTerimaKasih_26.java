package minggu13;

import java.util.Scanner;

public class UcapanTerimaKasih_26 {
    public static String PenerimaUcapan() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri Ucapan:");
        String namaOrang = scan.nextLine();
        scan.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapan = "Hope you doing well!";
        UcapanTambahan(ucapan);
    }
}
