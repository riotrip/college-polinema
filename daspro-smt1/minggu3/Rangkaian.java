package minggu3;

import java.util.Scanner;

public class Rangkaian {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        float R1, R2, R3, R4, Rparalel, Rtotal, V;
        int I;
        System.out.println("R1, R2, R3 Merupakan rangkaian paralel, Sementara R4 adalah rangkaian Seri");
        System.out.print("Masukkan nilai R1: ");
        R1 = scan.nextFloat();
        System.out.print("Masukkan nilai R2: ");
        R2 = scan.nextFloat();
        System.out.print("Masukkan nilai R3: ");
        R3 = scan.nextFloat();
        System.out.print("Masukkan nilai R4: ");
        R4 = scan.nextFloat();
        Rparalel = 1/(1/R1 + 1/R2 + 1/R3);
        Rtotal = R4 + Rparalel;
        System.out.println(String.format("Hambatan total sebesar: %f Ohm", Rtotal));
        System.out.print("Masukkan nilai kuat arus: ");
        I = scan.nextInt();
        V = I*Rtotal;
        System.out.print(String.format("Total tegangan adalah: %f Volt", V));
    }
}