package minggu2;

import java.util.Scanner;

public class DragonMain26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dragon26 dragon = new Dragon26(5, 5, 10, 10);
        dragon.printPosition();
        boolean run = true;
        do {
            System.out.println("Gerakkan dragon");
            System.out.println("W = Atas");
            System.out.println("A = Kiri");
            System.out.println("S = Bawah");
            System.out.println("D = Kanan");
            System.out.print("(W/A/S/D): ");
            String input = scan.nextLine();
            switch (input) {
                case "W", "w":
                    dragon.moveUp();
                    dragon.printPosition();
                    System.out.println();
                    break;
                case "A", "a":
                    dragon.moveLeft();
                    dragon.printPosition();
                    System.out.println();
                    break;
                case "S", "s":
                    dragon.moveDown();
                    dragon.printPosition();
                    System.out.println();
                    break;
                case "D", "d":
                    dragon.moveRight();
                    dragon.printPosition();
                    System.out.println();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (run);
    }
}
