package com.nflsdq.pertemuan89_2;

public class Faculty extends Employee {
    private String jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String noTelepon, String email, 
            String kantor, double gaji, String jamKerja, String pangkat) {
        super(nama, alamat, noTelepon, email, kantor, gaji);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return "Class: Faculty\nNama: " + nama;
    }
}