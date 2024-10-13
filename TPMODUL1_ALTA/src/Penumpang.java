public class Penumpang {
    private String NIK;
    private String namaDepan;
    private String namaBelakang;

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public void tampilDaftarPenumpang() {
        System.out.println("Nomor Induk Kependudukan: " + NIK + "\nNama Depan: " + namaDepan + "\nNama Belakang: " + namaBelakang);
    }
}
