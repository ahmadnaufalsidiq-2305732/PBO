import java.util.Scanner;

public class praktikumUTS1 {
    public static void main(String[] args) {
        Scanner projectScanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat tiga digit: ");
        int bilangan = projectScanner.nextInt();

        if (bilangan < 100 || bilangan > 999) {
            System.out.println("Bilangan yang dimasukkan bukan bilangan tiga digit.");
        } else {
            int digitAwal = bilangan / 100;
            int digitAkhir = bilangan % 10;
            
            if (digitAwal == digitAkhir) {
                System.out.println(bilangan + " adalah bilangan palindrom.");
            } else {
                System.out.println(bilangan + " bukan bilangan palindrom.");
            }
        }
    }
}
