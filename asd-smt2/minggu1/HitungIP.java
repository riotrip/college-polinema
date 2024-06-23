import java.util.Scanner;

public class HitungIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mataKuliah = { "Pancasila", "KTI", "CTPS", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman", "K3" };
        double[] nilAngka = new double[8];
        String[] nilHuruf = new String[8];
        double[] bobotNilai = new double[8];
        int[] sks = { 2, 2, 2, 3, 2, 2, 3, 2 };
        double totNil = 0, IP;
    
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");
        System.out.print("Masukkan nilai Matkul Pancasila : ");
        nilAngka[0] = scanner.nextDouble();
        System.out.print("Masukkan nilai Matkul KTI : ");
        nilAngka[1] = scanner.nextDouble();
        System.out.print("Masukkan nilai Matkul CTPS : ");
        nilAngka[2] = scanner.nextDouble();
        System.out.print("Masukkan nilai Matkul Matematika Dasar : ");
        nilAngka[3] = scanner.nextDouble();
        System.out.print("Masukkan nilai Matkul Bahasa Inggris : ");
        nilAngka[4] = scanner.nextDouble();
        System.out.print("Masukkan nilai Matkul Dasar Pemrograman : ");
        nilAngka[5] = scanner.nextDouble();
        System.out.print("Masukkan nilai Matkul Praktikum Dasar Pemrograman : ");
        nilAngka[6] = scanner.nextDouble();
        System.out.print("Masukkan nilai Matkul K3 : ");
        nilAngka[7] = scanner.nextDouble();
        for (int i = 0; i < 8; i++) {
            if (nilAngka[i] <= 100 && nilAngka[i] > 80) {
                nilHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilAngka[i] <= 80 && nilAngka[i] > 73) {
                nilHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilAngka[i] <= 73 && nilAngka[i] > 65) {
                nilHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilAngka[i] <= 65 && nilAngka[i] > 60) {
                nilHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilAngka[i] <= 60 && nilAngka[i] > 50) {
                nilHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilAngka[i] <= 50 && nilAngka[i] > 39) {
                nilHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else if (nilAngka[i] <= 39) {
                nilHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }
    
        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");
    
        System.out.printf("\n%-40s %-12s  %-8s    %-13s\n", "Matkul", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < nilAngka.length; i++) {
            System.out.printf("%-43s %.2f          %-12s %.2f\n", mataKuliah[i], nilAngka[i], nilHuruf[i],
                    bobotNilai[i]);
        }
        System.out.println();
    
        System.out.println();
        for (int i = 0; i < bobotNilai.length; i++) {
            totNil += (bobotNilai[i] * sks[i]);
        }
        IP = totNil / 18;
        System.out.println("======================");
        System.out.printf("IP = %.2f", IP);
    }
}
