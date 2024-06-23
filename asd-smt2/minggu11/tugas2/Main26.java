package minggu11.tugas2;

import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList26 list = new LinkedList26();
        String nim, nama;
        boolean run = true;
        do {
            System.out.println("\n-----------------------------");
            System.out.println("Selamat datang di program antrian Layanan Unit Kemahasiswaan!");
            System.out.println("-----------------------------");
            System.out.println("Pilih layanan: ");
            System.out.println("1. Input antrian");
            System.out.println("2. Hapus antrian");
            System.out.println("3. Lihat antrian");
            System.out.println("4. Cari antrian");
            System.out.println("0. Keluar");
            System.out.print("(1/2/3/0): ");
            int input = scan.nextInt();
            System.out.println("-----------------------------");
            switch (input) {
                case 1:
                    System.out.println("Masukkan antrian: ");
                    System.out.println("-----------------------------");
                    System.out.print("Input NIM: ");
                    scan.nextLine();
                    nim = scan.nextLine();
                    System.out.print("Input Nama: ");
                    nama = scan.nextLine();
                    Mahasiswa26 mhs = new Mahasiswa26(nim, nama);
                    list.addLast(mhs);
                    System.out.println("-----------------------------");
                    break;
                case 2:
                    boolean kembali = true;
                    do {
                        System.out.println("Hapus antrian berdasarkan: ");
                        System.out.println("-----------------------------");
                        System.out.println("1. Antrian terdepan");
                        System.out.println("2. Antrian paling belakang");
                        System.out.println("3. Nomor antrian");
                        System.out.println("4. NIM/Nama");
                        System.out.println("0. Kembali");
                        System.out.print("(1/2/3/4/0): ");
                        int hapusAntri = scan.nextInt();
                        System.out.println("-----------------------------");
                        switch (hapusAntri) {
                            case 1:
                                System.out.println("Hapus antrian paling depan: ");
                                System.out.println("-----------------------------");
                                list.removeFirst();
                                System.out.println("-----------------------------");
                                kembali = false;
                                break;
                            case 2:
                                System.out.println("Hapus antrian paling belakang: ");
                                System.out.println("-----------------------------");
                                list.removeLast();
                                System.out.println("-----------------------------");
                                kembali = false;
                                break;
                            case 3:
                                System.out.println("Hapus antrian berdasarkan nomor antrian: ");
                                System.out.println("-----------------------------");
                                list.print();
                                System.out.println("-----------------------------");
                                System.out.print("Masukkan nomor antrian: ");
                                int inputNo = scan.nextInt();
                                list.removeAt((inputNo - 1));
                                System.out.println("-----------------------------");
                                kembali = false;
                                break;
                            case 4:
                                System.out.println("Hapus antrian berdasarkan NIM/Nama: ");
                                System.out.println("-----------------------------");
                                list.print();
                                System.out.println("-----------------------------");
                                System.out.print("Masukkan NIM/Nama: ");
                                scan.nextLine();
                                String inputNm = scan.nextLine();
                                Mahasiswa26 hpsMhs = new Mahasiswa26(inputNm, inputNm);
                                list.remove(hpsMhs);
                                System.out.println("-----------------------------");
                                kembali = false;
                                break;
                            case 0:
                                System.out.println("Kembali ke menu awal!");
                                System.out.println("-----------------------------");
                                kembali = false;
                                break;
                            default:
                                System.out.println("Pilihan tidak valid!");
                                System.out.println("-----------------------------");
                        }
                    } while (kembali);
                    break;
                case 3:
                    list.print();
                    System.out.println("-----------------------------");
                    break;
                case 4:
                    boolean back = true;
                    do {
                        System.out.println("Cari antrian berdasarkan: ");
                        System.out.println("-----------------------------");
                        System.out.println("1. Nomor antrian");
                        System.out.println("2. NIM/Nama");
                        System.out.println("0. Kembali");
                        System.out.print("(1/2/0): ");
                        int cariAntri = scan.nextInt();
                        System.out.println("-----------------------------");
                        switch (cariAntri) {
                            case 1:
                                System.out.println("Cari antrian berdasarkan nomor antrian: ");
                                System.out.println("-----------------------------");
                                list.print();
                                System.out.println("-----------------------------");
                                System.out.print("Masukkan nomor antrian: ");
                                int cariNo = scan.nextInt();
                                System.out.println("-----------------------------");
                                Mahasiswa26 noMhs = list.getData(cariNo - 1);
                                if (noMhs != null) {
                                    System.out.println("Antrian ke-" + cariNo + " ditemukan!");
                                    System.out.println("NIM: " + noMhs.nim + ", Nama: " + noMhs.nama);
                                } else {
                                    System.out.println("Antrian ke-" + cariNo + " tidak ditemukan!");
                                }
                                System.out.println("-----------------------------");
                                back = false;
                                break;
                            case 2:
                                System.out.println("Cari antrian berdasarkan NIM/Nama: ");
                                System.out.println("-----------------------------");
                                list.print();
                                System.out.println("-----------------------------");
                                System.out.print("Masukkan NIM/Nama: ");
                                scan.nextLine();
                                String cariNm = scan.nextLine();
                                int posisi = list.indexOf(cariNm);
                                if (posisi != -1) {
                                    Mahasiswa26 dataMhs = list.getData(posisi);
                                    System.out.println("Antrian dengan NIM/Nama tersebut ditemukan pada posisi ke-"
                                            + (posisi + 1));
                                    System.out.println("Pemilik antrian NIM: " + dataMhs.nim + " dan Nama: "
                                            + dataMhs.nama + " ditemukan!");
                                } else {
                                    System.out.println("Antrian dengan NIM/Nama tersebut tidak ditemukan!");
                                }
                                System.out.println("-----------------------------");
                                back = false;
                                break;
                            case 0:
                                System.out.println("Kembali ke menu awal!");
                                System.out.println("-----------------------------");
                                back = false;
                                break;
                            default:
                                System.out.println("Pilihan tidak valid!");
                                System.out.println("-----------------------------");
                        }
                    } while (back);
                    break;
                case 0:
                    System.out.println("Keluar program\nTerimakasih!");
                    System.out.println("-----------------------------");
                    run = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    System.out.println("-----------------------------");
            }
        } while (run);
    }
}
