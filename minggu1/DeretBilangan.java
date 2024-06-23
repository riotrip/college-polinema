import java.util.Scanner;

public class DeretBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nim;
        int n = 0, i;

        System.out.print("Masukkan NIM: ");
        nim = scanner.nextLine();
        for (i = nim.length() - 2; i < nim.length(); i++) {
            char digitChar = nim.charAt(i);
            n = n * 10 + (digitChar - '0');
        }
        if (n < 10) {
            n += 10;
        }
        System.out.println("n: " + n);
        for (i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; 
            }
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
