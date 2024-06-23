package minggu3;

public class ArrayBalok26 {
    public static void main(String[] args) {
        Balok[] bilArray = new Balok[3];

        bilArray[0] = new Balok(100, 30, 12);
        bilArray[1] = new Balok(120, 40, 15);
        bilArray[2] = new Balok(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + bilArray[i].hitungVolume());
        }
    }
}