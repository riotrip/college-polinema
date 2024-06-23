import java.util.Scanner;

public class Rumus {
    public static void main(String[] args) {
        boolean run = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nPilih Menu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (1/2/3/0): ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    kecepatan();
                    break;
                case 2:
                    jarak();
                    break;
                case 3:
                    waktu();
                    break;
                case 0:
                    System.out.println("Terima Kasih");
                    run = false;
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
            }
        } while (run);
    }

    static void kecepatan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak (km) : ");
        int jarak = sc.nextInt();
        System.out.print("Masukkan waktu (h) :");
        int waktu = sc.nextInt();
        int kecepatan = jarak / waktu;
        System.out.println("Hasil kecepatan (km/h) : " + kecepatan);
    }

    static void jarak() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (km/h) : ");
        int kecepatan = sc.nextInt();
        System.out.print("Masukkan waktu (h) :");
        int waktu = sc.nextInt();
        int jarak = kecepatan * waktu;
        System.out.println("Hasil jarak (km) : " + jarak);
    }

    static void waktu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak (km) : ");
        int jarak = sc.nextInt();
        System.out.print("Masukkan kecepatan (km/h) :");
        int kecepatan = sc.nextInt();
        int waktu = jarak / kecepatan;
        System.out.println("Hasil waktu (h) : " + waktu);
    }
}