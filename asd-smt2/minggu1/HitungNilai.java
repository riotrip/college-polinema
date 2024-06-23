import java.util.Scanner;

public class HitungNilai {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nilTugas, nilKuis, nilUTS, nilUAS;
        double nilAkhir;
        String nilHuruf = "";

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilTugas = scan.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        nilKuis = scan.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        nilUTS = scan.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        nilUAS = scan.nextInt();
        System.out.println("======================");

        if (nilTugas < 0 || nilTugas > 100 ||
                nilKuis < 0 || nilKuis > 100 ||
                nilUTS < 0 || nilUTS > 100 ||
                nilUAS < 0 || nilUAS > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            nilAkhir = (nilTugas * 0.2) + (nilKuis * 0.2) + (nilUTS * 0.3) + (nilUAS * 0.3);
            if (nilAkhir <= 100 && nilAkhir > 80) {
                nilHuruf = "A";
            } else if (nilAkhir <= 80 && nilAkhir > 73) {
                nilHuruf = "B+";
            } else if (nilAkhir <= 73 && nilAkhir > 65) {
                nilHuruf = "B";
            } else if (nilAkhir <= 65 && nilAkhir > 60) {
                nilHuruf = "C+";
            } else if (nilAkhir <= 60 && nilAkhir > 50) {
                nilHuruf = "C";
            } else if (nilAkhir <= 50 && nilAkhir > 39) {
                nilHuruf = "D";
            } else if (nilAkhir <= 39) {
                nilHuruf = "E";
            }
            System.out.println("Nilai Akhir : " + nilAkhir);
            System.out.println("Nilai Huruf : " + nilHuruf);
            System.out.println("======================");
            if (nilHuruf == "D" || nilHuruf == "C") {
                System.out.println("ANDA TIDAK LULUS");
            } else {
                System.out.println("ANDA LULUS");
            }
        }
        System.out.println("======================");
    }
}