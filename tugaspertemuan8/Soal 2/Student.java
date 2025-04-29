package com.nflsdq.pertemuan89_2;

public class Student extends Person {
    public static final String MABA = "Mahasiswa Baru";
    public static final String MATAKE = "Mahasiswa Tahun Kedua";
    public static final String MAJU = "Junior";
    public static final String MASE = "Senior";

    private String status;

    public Student(String nama, String alamat, String noTelepon, String email, String status) {
        super(nama, alamat, noTelepon, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student\nNama: " + nama;
    }
}

