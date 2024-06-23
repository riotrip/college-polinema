import java.util.Scanner;

public class CariPlat {
    public static void main(String[] args) {
        String[] kode = { "A", "B", "D", "E", "F", "G", "H", "L", "N", "T" };
        String[] kota = { "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA",
                "MALANG", "TEGAL" };
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode plat mobil: ");
        String input = sc.next();
        int index = -1;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i].equalsIgnoreCase(input)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Plat asal kota: " + kota[index]);
        } else {
            System.out.println("Kode plat mobil invalid");
        }
    }
}