package minggu6;

import java.util.Scanner;

public class Pemilihan2Percobaan226 {
    public static void main(String[] args) {   
        float sudut1, sudut2, sudut3, totalSudut;
        Scanner input26 = new Scanner(System.in);
        
        System.out.print("Masukkan Sudut 1: ");
        sudut1 = input26.nextFloat();
        System.out.print("Masukkan Sudut 2: ");
        sudut2 = input26.nextFloat();
        System.out.print("Masukkan Sudut 3: ");
        sudut3 = input26.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)){
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            } else if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut3 == sudut1)) {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            } else {
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            }
        } else {
            System.out.println("Bukan segitiga");
        }
    }
}
