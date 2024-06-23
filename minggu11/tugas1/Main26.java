package minggu11.tugas1;

public class Main26 {
    public static void main(String[] args) {
        LinkedList26 list = new LinkedList26();

        Mahasiswa26 mhs1 = new Mahasiswa26(113, "Yusuf") ;
        Mahasiswa26 mhs2 = new Mahasiswa26(115, "Sari") ;
        Mahasiswa26 mhs3 = new Mahasiswa26(111, "Anton") ;
        Mahasiswa26 mhs4 = new Mahasiswa26(112, "Prita") ;
        Mahasiswa26 mhs5 = new Mahasiswa26(114, "Doni") ;

        list.print();
        list.addFirst(mhs1);
        list.print();
        list.addLast(mhs2);
        list.print();
        list.addFirst(mhs3);
        list.print();
        list.insertAfter(mhs3, mhs4);
        list.print();
        list.insertAt(3, mhs5);
        list.print();
    }
}
