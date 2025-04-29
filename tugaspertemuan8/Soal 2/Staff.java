package com.nflsdq.pertemuan89_2;

public final class Staff extends Employee {
    private String gelar;

    public Staff(String nama, String alamat, String noTelepon, String email,
                 String kantor, double gaji, String gelar) {
        super(nama, alamat, noTelepon, email, kantor, gaji);
        this.gelar = gelar;
    }

    @Override
    public final String toString() {
        return "Class: Staff\nNama: " + nama;
    }
}

