// Don't delete any comments below!!!

public class MakananKering {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    private String nama; 
    private int jumlah;
    private double harga;
    private String brand;
    // Todo : Create Constructor of MakananKering
    public MakananKering (String nama, int jumlah, double harga, String brand){
        this.nama= nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.brand = brand;
    }
    // Todo : Create Getter and Setter
    public String getNama() {
        return nama;
    }
    public int getJumlah() {
        return jumlah;
    }
    public double getHarga() {
        return harga;
    }
    public String brand() {
        return brand;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    // Todo : Create Method ShowData
    public void showData() {
        System.out.println("Nama makanan: " + nama + "\nJumlah: " + jumlah + "\nHarga: " + harga + "\nBrand: " + brand);
    }
}
