package minggu3.BangunRuang;

import java.lang.Math;

public class Kerucut {
    public double jariJari;
    public double sisiMiring;

    public double lpKerucut() {
        double selimut = Math.PI * jariJari * sisiMiring;
        return Math.PI * jariJari * (selimut + jariJari);
    }

    public double volKerucut() {
        double tinggi = Math.sqrt(Math.pow(sisiMiring, 2) - Math.pow(jariJari, 2));
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggi;
    }
}
