package com.nflsdq.pertemuan89_2;

public class Pertemuan89_2 {
    public static void main(String[] args) {
        Person p = new Person("Sidiq", "Bandung", "08123456789", "sidiq@gmail.com");
        Student s = new Student("Piya", "Semarang", "08234567890", "piya@gmail.com", Student.MATAKE);
        Employee e = new Employee("Citra", "Surabaya", "08345678901", "citra@gmail.com", "IT Departemen", 10000000);
        Faculty f = new Faculty("Doni", "Yogyakarta", "08456789012", "doni@gmail.com", "IT Departemen", 7000000, "08.00-16.00", "Dekan");
        Staff st = new Staff("Lutfil", "Bali", "08567890123", "lutfil@gmail.com", "Keuangan", 4500000, "S.Ak.");

        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(st.toString());
    }

}
