package minggu3;

public class ContohVariabel26 {
    public static void main(String[] args) {
        String hobi = "Bermain petak umpet";
        boolean pandai = true;
        char gender = 'L';
        byte umur = 20;
        double ipk = 3.66, tinggi = 1.75;
        System.out.println(hobi);
        System.out.println("Apakah pandai? " + pandai);
        System.out.println("Jenis kelamin: " + gender);
        System.out.println("Umurku saat ini: " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}
