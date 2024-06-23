package minggu10.Tugas;

public class Queue26 {
    Pembeli26[] data;
    int front;
    int rear;
    int size;
    int max;
    Pembeli26[] dataDeq;
    int dequeuedIndex;

    public Queue26(int n) {
        max = n;
        data = new Pembeli26[max];
        size = 0;
        front = rear = dequeuedIndex = -1;
        dataDeq = new Pembeli26[max];
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(Pembeli26 dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(0);
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public Pembeli26 Dequeue() {
        Pembeli26 dt = null;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0);
        } else {
            dt = data[front];
            size--;
            if (dequeuedIndex == max - 1) {
                dequeuedIndex = 0;
            } else {
                dequeuedIndex++;
            }
            dataDeq[dequeuedIndex] = dt;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Antrian terdepan: ");
            System.out.println("Nama: " + data[front].nama + ", No. HP: " + data[front].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Antrian paling belakang: ");
            System.out.println("Nama: " + data[rear].nama + ", No. HP: " + data[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public int cariAntrian(String cari) {
        int posisi = -1;
        for (int j = 0; j < data.length; j++) {
            if (data[j].nama.equalsIgnoreCase(cari)) {
                posisi = j;
            }
        }
        return posisi;
    }

    public void peekPosition(String nama) {
        int i = front;
        while (i != rear) {
            if (data[i].nama.equalsIgnoreCase(nama)) {
                System.out.println(nama + " berada di antrian ke-" + (i - front + 1));
                return;
            }
            i = (i + 1) % max;
        }
        System.out.println(nama + " tidak ada di antrian");
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println("Nama: " + data[i].nama + ", No. HP: " + data[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println("Nama: " + data[i].nama + ", No. HP: " + data[i].noHP);
            System.out.println("Jumlah antrian = " + size);
        }
    }

    public Pembeli26[] cekKeluar() {
        Pembeli26[] dataKeluar = new Pembeli26[dequeuedIndex + 1];
        int index = 0;
        for (int i = 0; i <= dequeuedIndex; i++) {
            dataKeluar[index++] = dataDeq[i];
        }

        return dataKeluar;
    }

    public void dataPembeli() {
        Pembeli26[] dataKeluar = cekKeluar();
        if (dataKeluar.length == 0) {
            System.out.println("Belum ada pembeli yang di-keluar.");
        } else {
            System.out.println("Data pembeli yang sudah tidak antri:");
            for (Pembeli26 orang : dataKeluar) {
                System.out.println("Nama: " + orang.nama + ", No. HP: " + orang.noHP);
            }
        }
    }

}
