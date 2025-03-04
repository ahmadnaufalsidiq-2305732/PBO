import java.util.Scanner;

public class Soal3 {
    public static void main(String args[]) {
        Scanner projectScanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai a: ");
        int a = projectScanner.nextInt();
        
        System.out.print("Masukkan nilai b: ");
        int b = projectScanner.nextInt();
        
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        
        System.out.println("Pembagi bilangan terbesarnya yaitu " + a);
    }
}
