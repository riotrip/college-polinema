package minggu3.BangunRuang;

public class Bola {
    public double jariJari;

    public double lpBola() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double volBola() {
        return (4.0 / 3) * Math.PI * jariJari * jariJari * jariJari;
    }
}
