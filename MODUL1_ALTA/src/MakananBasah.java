// Don't delete any comments below!!!
public class MakananBasah {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)
    private String nama;
    private int jumlah;
    private double harga;
    private String bahan;

    // Todo : Create Constructor of MakananBasah
    public MakananBasah(String nama, int jumlah, double harga, String bahan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.bahan = bahan;
    }
    // Todo : Create Getter and Setter
    public String getNama(){
        return nama;
    }
    public int getJumlah(){
        return jumlah;
    }
    public double getHarga(){
        return harga;
    }
    public String getBahan(){
        return bahan;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
    public void setBahan(String bahan){
        this.bahan = bahan;
    }
    // Todo : Create Method ShowData
    public void showData(String nama, int jumlah, double harga, String bahan) {
        System.out.println("Nama makanan: " + nama + "\nJumlah: " + jumlah + "\nHarga: " + harga + "\nBahan: " + bahan);
    }
}
