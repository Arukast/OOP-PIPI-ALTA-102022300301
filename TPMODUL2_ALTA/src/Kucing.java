public class Kucing extends Hewan {
    private final String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    @Override
    public void suara() {
        System.out.println(nama + " really like yapping meong");
    }

    @Override
    public void infoHewan() {
        System.out.println("Kucing ini bernama " + nama + ", " + nama + " berumur " + umur + " bulan, dan " + nama
                + " adalah kucing ras " + this.ras);
    }
}