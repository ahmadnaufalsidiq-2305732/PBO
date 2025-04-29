package com.nflsdq.pertemuan89_2;

public class Person {
    protected String nama;
    protected String alamat;
    protected String noTelepon;
    protected String email;

    public Person(String nama, String alamat, String noTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Class: Person\nNama: " + nama;
    }
}

