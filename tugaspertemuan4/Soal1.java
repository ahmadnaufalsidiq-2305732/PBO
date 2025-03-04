import java.util.Scanner;

public class Soal1 {
    public static void main(String args[]) {
        Scanner projectScanner = new Scanner(System.in);
        
        System.out.print("Masukkan berapa kali kalimat akan dicetak: ");
        int n = projectScanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Saya senang belajar bahasa Java");
        }
    }
}
