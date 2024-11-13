class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;

    // To do: Buatlah constructor pada class Komputer
    public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerJam) {
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }

    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh
    // materi modul!)
    public void informasi() {
        System.out
                .println("Informasi Komputer:\nJumlah Komputer\t: " + jumlahKomputer + "\nNama Warnet\t: " + namaWarnet
                        + "\nHarga per Jam\t: " + hargaPerJam);
    }
}