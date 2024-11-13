
// Don't delete any comments below!!!
// Todo: Import Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        // Todo : Create ManajemenInventaris Object and Scanner
        ManajemenInventaris manajemenInventaris = new ManajemenInventaris();
        Scanner sc = new Scanner(System.in);
        // Todo : Create Loop list menu
        while (running) {
            System.out.println(
                    "Menu:\n1. Tambah makanan kering\n2. Tambah Makanan basah\n3. Tampilkan semua Makanan\n4. Keluar");
            System.out.print("Pilih Menu: ");
            String pilihan = sc.nextLine();
            if ("1".equals(pilihan)) {
                manajemenInventaris.tambahMakananKering();
            } else if ("2".equals(pilihan)) {
                manajemenInventaris.tambahMakananBasah();
            } else if ("3".equals(pilihan)) {
                manajemenInventaris.tampilkanSemuaMakanan();
            } else if ("4".equals(pilihan)) {
                System.out.println("Keluar dari program");
                sc.close();
                break;
            }
        }
    }
}
