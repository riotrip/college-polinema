package minggu6;

import java.util.Scanner;

public class MainHotel26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Hotel Cahaya", "Jakarta", 3000000, (byte) 4);
        Hotel h2 = new Hotel("Hotel Bulan", "Bali", 5000000, (byte) 5);
        Hotel h3 = new Hotel("Hotel Bintang", "Malang", 1000000, (byte) 3);
        Hotel h4 = new Hotel("Hotel Matahari", "Surabaya", 800000, (byte) 1);
        Hotel h5 = new Hotel("Hotel Angkasa", "Bandung", 1500000, (byte) 2);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);
        boolean run = true;

        do {
            System.out.println("\n-----------------------------");
            System.out.println("Selamat datang di program Pemesanan Hotel");
            System.out.println("-----------------------------");
            System.out.println("Pilih Hotel Berdasarkan:");
            System.out.println("1. Harga Termurah");
            System.out.println("2. Bintang Tertinggi");
            System.out.println("0. Keluar");
            System.out.print("(1/2/0): ");
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("\n-----------------------------");
                    System.out.println("Pilihan hotel berdasarkan harga termurah");
                    System.out.println("-----------------------------");
                    list.bubbleSort();
                    list.tampilAll();
                    break;
                    case 2:
                    System.out.println("\n-----------------------------");
                    System.out.println("Pilihan hotel berdasarkan bintang tertinggi");
                    System.out.println("-----------------------------");
                    list.selectionSort();
                    list.tampilAll();
                    break;
                case 0:
                    System.out.println("-----------------------------");
                    System.out.println("Terima Kasih!");
                    run = false;
                    break;
                default:
                    System.out.println("-----------------------------");
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (run);
    }
}
