public class FungsiBunga {
    static double hargaAlognima = 75000;
    static double hargaKeladi = 50000;
    static double hargaAlocasia = 60000;
    static double hargaMawar = 10000;

    public static void main(String[] args) {
        String[] bunga = { "RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4", "Aglonema", "Keladi",
                "Alocasia", "Mawar" };
        int[][] stokRoyalGarden = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };
        System.out.println("1. Pendapatan setiap cabang jika semua bunga terjual habis:");
        pendapatanCabang(bunga, stokRoyalGarden);
        System.out.println("\n2. Stok setiap jenis bunga pada:");
        stokJenisBunga(bunga, stokRoyalGarden);
        System.out.println("\n3. Stok setelah pengurangan karena bunga mati:");
        int[] stokDikurangi = { -1, -2, 0, -5 };
        stokMati(bunga, stokRoyalGarden, stokDikurangi);
    }

    static void pendapatanCabang(String[] bunga, int[][] stokRoyalGarden) {
        double[] harga = { 0, 0, 0, 0, hargaAlognima, hargaKeladi, hargaAlocasia, hargaMawar };
        for (int i = 0; i < 4; i++) {
            double pendapatan = 0;
            for (int j = 4; j < bunga.length; j++) {
                pendapatan += harga[j] * stokRoyalGarden[i][j - 4];
            }
            System.out.printf("%s: %.2f%n", bunga[i], pendapatan);
        }
    }

    static void stokJenisBunga(String[] bunga, int[][] stokRoyalGarden) {
        for (int i = 4; i < bunga.length; i++) {
            int totalStok = 0;
            for (int[] royalGardenStok : stokRoyalGarden) {
                totalStok += royalGardenStok[i - 4];
            }
            System.out.printf("%s: %d%n", bunga[i], totalStok);
        }
    }

    static void stokMati(String[] bunga, int[][] stokRoyalGarden, int[] stokDikurangi) {
        for (int i = 0; i < bunga.length - 4; i++) {
            for (int j = 0; j < stokRoyalGarden.length; j++) {
                stokRoyalGarden[j][i] += stokDikurangi[i];
            }
        }
        stokJenisBunga(bunga, stokRoyalGarden);
    }
}