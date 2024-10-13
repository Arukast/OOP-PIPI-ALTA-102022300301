import java.util.Scanner;
import java.util.ArrayList;

public class Pembelian {
    public static void main(String[] args) throws Exception {
        int selectedTiketNumber = -1;
        boolean running = true;
        Penumpang penumpang = new Penumpang();
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
        daftarPenerbangan.add(new Penerbangan("CGK, Jakarta", "DPS, Bali", 1200000, "GA101", "06:30", "08:15"));
        daftarPenerbangan.add(new Penerbangan("SUB, Surabaya", "CGK, Jakarta", 1500000, "AA301", "13:00", "15:00"));
        try (Scanner sc = new Scanner(System.in)) {
            while (running) {
                System.out.println("=== EAD Ticket Booking System ===\n1. Tampilkan Daftar Penerbangan\n2. Beli Tiket\n3. Tampilkan Pesanan Tiket\n4. Exit");
                System.out.print("Silakan Pilih Menu (Masukkan Angka): ");
                String selectedMenuNumber = sc.nextLine();
                switch (selectedMenuNumber) {
                    case "1" -> {
                        System.out.println("\n--- Menu Daftar Penerbangan ---");
                        for (int i = 0; i < daftarPenerbangan.size(); i++) {
                            System.out.print(i+1 + ". ");
                            daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                        }
                    }
                    case "2" -> {
                        System.out.println("\n--- Menu Pembelian Tiket ---\n--------------------------------------------------\nSilakan isi data terlebih dahulu!");
                        System.out.print("Masukkan NIK: ");
                        String NIK = sc.nextLine();
                        penumpang.setNIK(NIK);
                        System.out.print("Masukkan Nama Depan: ");
                        String namaDepan = sc.nextLine();
                        penumpang.setNamaDepan(namaDepan);
                        System.out.print("Masukkan Nama Belakang: ");
                        String namaBelakang = sc.nextLine();
                        penumpang.setNamaBelakang(namaBelakang);
                        System.out.println("Terima kasih telah mengisi data diri!\n--------------------------------------------------");
                        while (true) {
                            try {
                                System.out.println("Silakan pilih tiket penerbangan yang tersedia:");
                                for (int i = 0; i < daftarPenerbangan.size(); i++) {
                                    System.out.print(i+1 + ". ");
                                    daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                                }
                                System.out.print("Silakan Pilih Tiket yang tersedia (Masukkan Angka): ");
                                selectedTiketNumber = sc.nextInt();
                                if (selectedTiketNumber <= daftarPenerbangan.size()) {
                                    System.out.println("Pesanan tiket Anda telah dicatat, terima kasih!\n");
                                    sc.nextLine();
                                    break;
                                } else {
                                    System.out.println("Nomor tiket yang Anda masukkan tidak ada!\n");
                                }
                            } catch (Exception inputMismatchException) {
                                sc.nextLine();
                                System.out.println("Tolong untuk hanya memasukkan angka!\n");
                            }
                        }
                    }
                    case "3" -> {
                        System.out.println("\n--- Menu Pesanan Tiket ---");
                        if (selectedTiketNumber == -1) {
                            System.out.println("Tidak ada histori pemesanan tiket!\n");
                        } else {
                            System.out.println("Detail Tiket Penerbangan:");
                            penumpang.tampilDaftarPenumpang();
                            daftarPenerbangan.get(selectedTiketNumber-1).tampilDaftarPenerbangan(); 
                        }
                    }
                    case "4" -> {
                        System.out.println("\nTerima Kasih!");
                        running = false;
                    }
                    default -> {
                        System.out.println("\nTolong masukkan angka menu yang tersedia!\n");
                    }
                }
            }
        }
    }
}