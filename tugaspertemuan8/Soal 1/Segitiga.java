package com.nflsdq.pertemuan89_1;

public class Segitiga extends ObjekGeometris {
    private double sisi1 = 1.0;
    private double sisi2 = 1.0;
    private double sisi3 = 1.0;

    public Segitiga() {
        super();
    }

    public Segitiga(double sisi1, double sisi2, double sisi3) {
        super();
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double getSisi1() {
        return sisi1;
    }

    public double getSisi2() {
        return sisi2;
    }

    public double getSisi3() {
        return sisi3;
    }

    public double getKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    public double getLuas() {
        double s = getKeliling() / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + sisi1 + " sisi2 = " + sisi2 + " sisi3 = " + sisi3;
    }
}

