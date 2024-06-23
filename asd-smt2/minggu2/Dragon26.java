package minggu2;

public class Dragon26 {
    int x, y, width, height;

    public Dragon26(int xAwal, int yAwal, int widthArea, int heightArea) {
        x = xAwal;
        y = yAwal;
        width = widthArea;
        height = heightArea;
    }
    void moveLeft() {
        x--;
        detectCollision();
    }

    void moveRight() {
        x++;
        detectCollision();
    }

    void moveUp() {
        y--;
        detectCollision();
    }

    void moveDown() {
        y++;
        detectCollision();
    }

    void printPosition() {
        System.out.println("Posisi Dragon: (" + x + ", " + y + ")");
    }

    void detectCollision() {
        if (x < 0 || x > width || y < 0 || y > height) {
            System.out.println("Dragon bergerak melewati batas!");
            System.out.println("Game Over");
            System.exit(0);
        }
    }
}
