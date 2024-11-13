class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;

    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang
    // sesuai dengan ketentuan
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh
    // materi modul!)
    @Override
    public void informasi() {
        super.informasi();
        if (vipCard) {
            System.out.println("Status\t: Member VIP");
            System.out.println(
                    "\nBenefit Member VIP:\n- Diskon 10% untuk bermain di atas 3 jam\n- Gratis minuman 3 kali per hari\n- Prioritas booking komputer");
        } else {
            System.out.println("Status\t: Non VIP");
            System.out.println("\nTidak mempunyai benefit karena bukan member VIP");
        }
    }

    // To do: Buatlah method Login sesuai dengan ketentuan
    public void login(String username) {
        System.out.println("\nLogin dengan username\t: " + username);
    }

    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void bermain(int jam) {
        System.out.println("Bermain selama " + jam + " jam");
    }

    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan
    // ketentuan
    public void bermain(int jam, int menitTambahan) {
        System.out.println("Nambah billing selama " + jam + " jam " + menitTambahan + "menit");
    }
}