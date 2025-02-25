import java.util.Scanner;

public class Soal1 {
    public static void main(String args[]) {
        Scanner projectScanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int x = projectScanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int y = projectScanner.nextInt(); 
        System.out.print("Masukkan angka ketiga: ");
        int z = projectScanner.nextInt();
        
        if (x >= 1000 && x < 10000) {
            System.out.println(x + " adalah angka ribuan.");
        } else {
            System.out.println(x + " bukan angka ribuan.");
        }
        
        if (y >= 1000 && y < 10000) {
            System.out.println(y + " adalah angka ribuan.");
        } else {
            System.out.println(y + " bukan angka ribuan.");
        }
        
        if (z >= 1000 && z < 10000) {
            System.out.println(z + " adalah angka ribuan.");
        } else {
            System.out.println(z + " bukan angka ribuan.");
        }
    }
}
