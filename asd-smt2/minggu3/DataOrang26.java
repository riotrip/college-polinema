package minggu3;

public class DataOrang26 {
    public static void main(String[] args) {
        Orang[][] dataOrang = new Orang[2][2];

        dataOrang[0][0] = new Orang();
        dataOrang[0][0].nama = "Rio";
        dataOrang[0][0].umur = 20;
        dataOrang[0][1] = new Orang();
        dataOrang[0][1].nama = "Ren";
        dataOrang[0][1].umur = 25;

        System.out.println(dataOrang[0][0].nama + " berumur " + dataOrang[0][0].umur + " tahun");
        System.out.println(dataOrang[0][1].nama + " berumur " + dataOrang[0][1].umur + " tahun");
    }
}
