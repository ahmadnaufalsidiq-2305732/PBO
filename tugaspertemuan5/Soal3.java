import java.util.Scanner;

public class Soal3 {
    public static void main(String args[]) {
        Scanner projectScanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai a: ");
        int a = projectScanner.nextInt();
        
        System.out.print("Masukkan nilai b: ");
        int b = projectScanner.nextInt();
        
        int hasil = hitungFPB(a, b);
        
        System.out.println("Pembagi bilangan terbesarnya yaitu " + hasil);
    }
    
    public static int hitungFPB(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return hitungFPB(b, a % b);
        }
    }
}
