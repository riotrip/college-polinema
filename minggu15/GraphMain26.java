package minggu15;

import java.util.Scanner;

public class GraphMain26 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kapasitas Graph: ");
        int kapasitas = scan.nextInt();
        Graph26 gedung = new Graph26(kapasitas);
        boolean run = true;
        do {
            System.out.println("\n===============================");
            System.out.println("Selamat datang di program Graph");
            System.out.println("===============================");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Banyak Edge");
            System.out.println("0. Keluar");
            System.out.print("(1/2/3/4/5/6/7/0): ");
            int input = scan.nextInt();
            System.out.println("===============================");
            switch (input) {
                case 1:
                    System.out.println("Add Edge");
                    System.out.println("===============================");
                    System.out.print("Masukkan gedung asal: ");
                    int addAsal = scan.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int addTujuan = scan.nextInt();
                    System.out.print("Masukkan jarak antar gedung: ");
                    int addJarak = scan.nextInt();
                    System.out.println("===============================");
                    gedung.addEdge(addAsal, addTujuan, addJarak);
                    System.out.println("===============================");
                    break;
                case 2:
                    System.out.println("Hapus Edge");
                    System.out.println("===============================");
                    System.out.print("Masukkan gedung asal: ");
                    int removeAsal = scan.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int removeTujuan = scan.nextInt();
                    System.out.println("===============================");
                    gedung.removeEdge(removeAsal, removeTujuan);
                    System.out.println("===============================");
                    break;
                case 3:
                    System.out.println("Graph Degree");
                    System.out.println("===============================");
                    System.out.print("Masukkan gedung: ");
                    int cekDegree = scan.nextInt();
                    System.out.println("===============================");
                    gedung.degree(cekDegree);
                    System.out.println("===============================");
                    break;
                case 4:
                    System.out.println("Print Graph");
                    System.out.println("===============================");
                    gedung.printGraph();
                    System.out.println("===============================");
                    break;
                case 5:
                    System.out.println("Cek Edge");
                    System.out.println("===============================");
                    System.out.print("Masukkan gedung asal: ");
                    int cekAsal = scan.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int cekTujuan = scan.nextInt();
                    System.out.println("===============================");
                    gedung.checkEdge(cekAsal, cekTujuan);
                    System.out.println("===============================");
                    break;
                case 6:
                    System.out.println("Update Jarak");
                    System.out.println("===============================");
                    System.out.print("Masukkan gedung asal: ");
                    int updateAsal = scan.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int updateTujuan = scan.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    int updateJarak = scan.nextInt();
                    System.out.println("===============================");
                    gedung.updateJarak(updateAsal, updateTujuan, updateJarak);
                    System.out.println("===============================");
                    break;
                case 7:
                    System.out.println("Banyak Edge");
                    System.out.println("===============================");
                    System.out.println("Banyak Edge dalam Graph: " + gedung.hitungEdge());
                    System.out.println("===============================");
                    break;
                case 0:
                    System.out.println("Keluar program\nTerimakasih!");
                    System.out.println("===============================");
                    run = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    System.out.println("===============================");
                    break;
            }
        } while (run);
    }
}
// Graph26 gedung = new Graph26(6);
// gedung.addEdge(0, 1, 50);
// gedung.addEdge(0, 2, 100);
// gedung.addEdge(1, 3, 70);
// gedung.addEdge(2, 3, 40);
// gedung.addEdge(3, 4, 60);
// gedung.addEdge(4, 5, 80);
// gedung.degree(0);
// gedung.printGraph();
// gedung.removeEdge(1, 3);
// gedung.printGraph();
// System.out.print("Masukkan gedung asal: ");
// int asal = scan.nextInt();
// System.out.print("Masukkan gedung tujuan: ");
// int tujuan = scan.nextInt();
// gedung.checkEdge(asal, tujuan);

// GraphMatriks26 gdg = new GraphMatriks26(4);
// gdg.makeEdge(0, 1, 50);
// gdg.makeEdge(1, 0, 60);
// gdg.makeEdge(1, 2, 70);
// gdg.makeEdge(2, 1, 80);
// gdg.makeEdge(2, 3, 40);
// gdg.makeEdge(3, 0, 90);
// gdg.printGraph();
// System.out.println("Hasil setelah penghapusan edge");
// gdg.removeEdge(2, 1);
// gdg.printGraph();
// gdg.degree(0);