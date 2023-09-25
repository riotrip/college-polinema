package minggu5;

import java.util.Scanner;

public class PemilihanPercobaan226 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        
        System.out.print("Nilai uas   : ");
        float uas = input26.nextFloat();
        System.out.print("Nilai uts   : ");
        float uts = input26.nextFloat();
        System.out.print("Nilai kuis  : ");
        float kuis = input26.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input26.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        
        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
    
}
