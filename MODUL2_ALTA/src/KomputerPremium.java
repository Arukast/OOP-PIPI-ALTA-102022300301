class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;

    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang
    // sesuai dengan ketentuan
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh
    // materi modul!)
    @Override
    public void informasi() {
        super.informasi();
        if (ruangPrivat) {
            System.out.println("Status\t: Ruangan Premium");
            System.out.println(
                    "\nFasilitas Ruangan Premium:\n- Ruangan ber-AC\n- Kursi Gaming\n- Spesifikasi komputer tinggi\n- Koneksi internet cepat");
        } else {
            System.out.println("Status\t: Ruangan Standar");
            System.out.println(
                    "\nFasilitas Ruangan Standar:\n- Ruangan gerah\n- Sofa Zaman Majapahit\n- Komputer budget\n- Koneksi internet lambat");
        }

    }

    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void pesan(int nomorKomputer) {
        System.out.println("\nMemesan komputer nomor\t\t: " + nomorKomputer);
    }

    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void tambahLayanan(String makanan) {
        System.out.println("Menambah layanan makanan\t: " + makanan);
    }

    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai
    // dengan ketentuan
    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah layanan makanan\t: " + makanan + " dan minuman " + minuman);
    }
}
