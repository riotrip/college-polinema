package minggu5;

public class LatihanMain26 {
    public static void main(String[] args) {
        int[] Accel = { 1111, 2222, 3333, 4444, 5555 };
        int[] topPower = { 555, 444, 333, 222, 111 };
        Latihan lat = new Latihan(Accel, topPower);

        System.out.println("_______________________________________________________________________");
        System.out.println("|Merk        | Tipe            | Tahun | top_acceleration | top_power |");
        System.out.println("_______________________________________________________________________");
        System.out.println("|Mazda       | RX-7            | 2016  | 1111             | 555       |");
        System.out.println("|BMW         | GTR 3           | 2009  | 2222             | 444       |");
        System.out.println("|Subaru      | Impreza WRX STI | 2013  | 3333             | 333       |");
        System.out.println("|Toyota      | AE86 Trueno     | 1986  | 4444             | 222       |");
        System.out.println("|Volkswagen  | Golf GTI        | 2014  | 5555             | 111       |");
        System.out.println("=======================================================================");

        System.out.println();

        System.out.println("Top Acceleration adalah " + lat.highestAccel());
        System.out.println("Low Acceletaion adalah " + lat.lowAccel());
        System.out.println("Rata Rata power adalah " + lat.avgPower());
    }

}