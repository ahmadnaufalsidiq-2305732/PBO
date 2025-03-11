import java.util.Scanner;

public class Soal2 {
    public static void main(String args[]) {
        Scanner projectScanner = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int batasAwal = projectScanner.nextInt();
        
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = projectScanner.nextInt();
        
        bilGenap(batasAwal, batasAkhir);
    }
    
    public static void bilGenap(int batasAwal, int batasAkhir) {
        int jumlah = 0;
        
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                jumlah += i;
            }
        }
        
        System.out.println("\nJumlah bilangan genap dari " + batasAwal + " sampai " + batasAkhir + " adalah " + jumlah);
    }
}
