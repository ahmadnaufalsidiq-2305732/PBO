import java.util.Scanner;

public class Soal2 {
    public static void main(String args[]) {
        Scanner projectScanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int x = projectScanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int y = projectScanner.nextInt();    
        System.out.print("Masukkan angka ketiga: ");
        int z = projectScanner.nextInt();
        
        if (x > y && x > z) {
            System.out.println(x + " adalah bilangan paling besar.");
        } else if (y > x && y > z) {
            System.out.println(y + " adalah bilangan paling besar.");
        } else if (z > x && z > y) {
            System.out.println(z + " adalah bilangan paling besar.");
        } else {
            System.out.println("Ada lebih dari 1 bilangan yang paling besar.");
        }
    }
}
