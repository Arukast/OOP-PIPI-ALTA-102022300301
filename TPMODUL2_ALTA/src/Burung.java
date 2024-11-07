public class Burung extends Hewan {
    private final String warnaBulu;

    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void suara() {
        System.out.println(nama + " berkicau dengan indah");
    }

    @Override
    public void infoHewan() {
        System.out.println("Burung ini bernama " + nama + ", " + nama + " berumur " + umur + " bulan, dan " + nama
                + " memiliki bulu yang cantik berwarna " + warnaBulu);
    }
}
