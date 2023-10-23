import java.util.Scanner;

public class utsSoal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, total;

        System.out.println("Masukkan sudut a: ");
        a = scan.nextInt();
        System.out.println("Masukkan sudut b: ");
        b = scan.nextInt();
        System.out.println("Masukkan sudut c: ");
        c = scan.nextInt();

        total = a+b+c;

        if (total == 180 && total > 0) {
            if (a == b || b == c || c ==a) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else {
                System.out.println("Segitiga tersebut bukan segitiga siku-siku");
            }
        } else {
            System.out.println("Bangun tersebut bukan segitiga");
        }
    }
}