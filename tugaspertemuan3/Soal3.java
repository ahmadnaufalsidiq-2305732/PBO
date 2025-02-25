import java.util.Scanner;

public class Soal3 {
    public static void main(String args[]) {
        Scanner projectScanner = new Scanner(System.in);
        
        System.out.print("Masukkan jam masuk: ");
        int jamMasuk = projectScanner.nextInt();
        System.out.print("Masukkan jam keluar: ");
        int jamKeluar = projectScanner.nextInt();
        
        int lamaParkir;
        
        if (jamKeluar < jamMasuk){
            lamaParkir = (12 - jamMasuk) + jamKeluar;
        } else {
            lamaParkir = jamKeluar - jamMasuk;
        }
        
        int biayaParkir;
        
        if (lamaParkir <= 2) {
            biayaParkir = 1500;
        } else {
            biayaParkir = 1500 + ((lamaParkir - 2) * 1000);
        }
        
        System.out.println("Lama parkir: " + lamaParkir + " jam");
        System.out.println("Biaya parkir: " + biayaParkir);
    }
}
