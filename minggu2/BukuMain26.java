package minggu2;

public class BukuMain26 {
    public static void main(String[] args) {
        Buku26 bk1 = new Buku26();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.gantiHarga(6000);
        bk1.terjual(5);
        bk1.hitungDiskon();
        bk1.tampilInformasi();
        
        Buku26 bk2 = new Buku26("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.hitungDiskon();
        bk2.tampilInformasi();
        
        Buku26 Rio = new Buku26("One Piece", "Eiichiro Oda", 80, 15, 35000);
        Rio.hitungDiskon();
        Rio.tampilInformasi();
    }
}
