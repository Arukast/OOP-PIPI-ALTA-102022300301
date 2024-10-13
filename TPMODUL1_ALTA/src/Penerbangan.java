public class Penerbangan {
    private final String nomorPenerbangan;
    private final String bandaraKeberangkatan; 
    private final String bandaraTujuan; 
    private final String waktuKeberangkatan; 
    private final String waktuKedatangan; 
    private final float hargaTiket; 

    public Penerbangan(String bandaraKeberangkatan, String bandaraTujuan, float hargaTiket, String nomorPenerbangan, String waktuKeberangkatan, String waktuKedatangan) {
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.hargaTiket = hargaTiket;
        this.nomorPenerbangan = nomorPenerbangan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
    }

    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    public String getBandaraKeberangkatan() {
        return bandaraKeberangkatan;
    }

    public String getBandaraTujuan() {
        return bandaraTujuan;
    }

    public String getWaktuKeberangkatan() {
        return waktuKeberangkatan;
    }

    public String getWaktuKedatangan() {
        return waktuKedatangan;
    }

    public float getHargaTiket() {
        return hargaTiket;
    }

    public void tampilDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan: " + nomorPenerbangan + "\nBandara Keberangkatan: " + bandaraKeberangkatan + " ---> Bandara Tujuan: " + bandaraTujuan + "\nWaktu Keberangkatan: " + waktuKeberangkatan + " ---> Waktu Kedatangan: " + waktuKedatangan + "\nHarga Tiket: Rp." + hargaTiket + "\n");
    }
}
