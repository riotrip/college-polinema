package minggu6;

public class HotelService {
    Hotel rooms[] = new Hotel[5];
    int idh;

    void tambah(Hotel h) {
        if (idh < rooms.length) {
            rooms[idh] = h;
            idh++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilAll() {
        for (Hotel h : rooms) {
            h.tampilAll();
            System.out.println("-----------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].harga < rooms[j - 1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < rooms.length-1; i++) {
            int idhMin = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].harga > rooms[idhMin].harga) {
                    idhMin = j;
                }
            }
            Hotel temp = rooms[idhMin];
            rooms[idhMin] = rooms[i];
            rooms[i] = temp;
        }
    }
}
