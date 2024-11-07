public class Hewan {
    protected String nama;
    protected int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void suara() {
        System.out.println("Hewan ini bersuara!");
    }

    public void makan() {
        System.out.println(nama + " sedang makan");
    }

    public String makan(String makanan) {
        return this.nama + " sedang makan " + makanan;
    }

    public void infoHewan() {
        System.out.println("Hewan ini memiliki informasi berupa nama dan umur!");
    }
}
