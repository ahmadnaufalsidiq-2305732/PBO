package com.nflsdq.pertemuan89_2;

public class Employee extends Person {
    protected String kantor;
    protected double gaji;
    protected MyDate tanggalDipekerjakan;

    public Employee(String nama, String alamat, String noTelepon, String email, String kantor, double gaji) {
        super(nama, alamat, noTelepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = new MyDate();
    }

    @Override
    public String toString() {
        return "Class: Employee\nNama: " + nama;
    }
}
