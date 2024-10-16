// Don't delete any comments below!!!

public class Makanan {
    // Todo : Create private attribute of Makanan (nama, jumlah, and harga)
    private String nama;
    private int jumlah ;
    private double harga;
    // Todo : Create Constructor of Makanan
    public Makanan(String nama, int jumlah, double harga){
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
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

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
}
