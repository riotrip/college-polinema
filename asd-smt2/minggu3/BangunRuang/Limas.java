package minggu3.BangunRuang;

public class Limas {
    public double sisi;
    public double tinggi;

    public double lpLimas() {
        double sisiTegak = 0.5 * sisi * tinggi;
        return (sisi * sisi) + (4 * sisiTegak);
    }

    public double volLimas() {
        return (1.0 / 3) * (sisi * sisi) * tinggi;
    }
}
