// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananKering> daftarMakananKering = new ArrayList<>(); 
    ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>(); 
    Scanner sc = new Scanner(System.in);
    public void tambahMakananKering() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.print("Nama makanan: ");
        String namaMakanan = sc.nextLine();
        System.out.print("Jumlah makanan: ");
        int jumlahMakanan = sc.nextInt();
        
        System.out.print("Harga Makanan: ");
        double hargaMakanan = sc.nextDouble();
        sc.nextLine();
        System.out.print("Brand Makanan: ");
        String brandMakanan = sc.nextLine();
        
        // Todo : Create a new object for MakananKering
        // MakananKering makananKering = new MakananKering();
        daftarMakananKering.add(new MakananKering(namaMakanan, jumlahMakanan, hargaMakanan, brandMakanan));
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.println("Makanan kering berhasil ditambahkan");
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        System.out.print("Nama makanan: ");
        String namaMakanan = sc.nextLine();
        System.out.print("Jumlah makanan: ");
        int jumlahMakanan = sc.nextInt();
        System.out.print("Harga Makanan: ");
        double hargaMakanan = sc.nextDouble();
        sc.nextLine();
        System.out.print("Bahan Makanan: ");
        String bahanMakanan = sc.nextLine();
        // Todo : Create a new object for MakananBasah
        daftarMakananBasah.add(new MakananBasah(namaMakanan, jumlahMakanan, hargaMakanan, bahanMakanan));
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
        System.out.println("Makanan Basah berhasil ditambahkan");
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
            System.out.println("Tidak ada makanan disini");
        } else {
            // Todo : Create print notification for Makanan Kering  
            for (int i = 0; i < daftarMakananKering.size(); i++) {
                daftarMakananKering.get(i).showData();
            }
            // Todo : Create print notification for  Makanan Basah
            for (int i = 0; i < daftarMakananBasah.size(); i++) {
                daftarMakananBasah.get(i).showData();
            }
        }
    }
}


