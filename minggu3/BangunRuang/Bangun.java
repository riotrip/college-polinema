package minggu3.BangunRuang;

public class Bangun {
    public double jariJari;
    public double sisi;
    public double tinggi;
    public double sisiMiring;

    public double lpKerucut() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }

    public double volKerucut() {
        return (1.0 / 3) * Math.PI * jariJari * jariJari * sisiMiring;
    }

    public double lpLimas() {
        return 2 * sisi * sisi + 4 * (sisi * tinggi) / 2;
    }

    public double volLimas() {
        return (1.0 / 3) * sisi * sisi * tinggi;
    }

    public double lpBola() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double volBola() {
        return (4.0 / 3) * Math.PI * jariJari * jariJari * jariJari;
    }

}
