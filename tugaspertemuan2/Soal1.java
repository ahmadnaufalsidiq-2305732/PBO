import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner projectScanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama: ");
        float x = projectScanner.nextFloat();
        System.out.print("Masukkan bilangan kedua: ");
        float y = projectScanner.nextFloat();
        System.out.print("Masukkan bilangan ketiga: ");
        float z = projectScanner.nextFloat();
        
        float tambah = x + y + z;
        float kurang = x - y - z;
        float kali = x * y * z;
        float bagi = x / y / z;
        
        System.out.println("Hasil penjumlahan: " + tambah);
        System.out.println("Hasil pengurangan: " + kurang);
        System.out.println("Hasil perkalian: " + kali);
        System.out.println("Hasil pembagian: " + bagi);
    }
}
