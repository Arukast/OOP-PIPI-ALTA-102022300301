public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer kp = new Komputer(5, "Warnet EAD", 3000);
        // To do: Panggillah Method Informasi dari class Komputer
        kp.informasi();
        System.out.println("\n==========================================\n");

        // To do: Buatlah sebuah Objek baru dari class KomputerVIP
        KomputerVIP kvip = new KomputerVIP(5, "Warnet Gaming", 7000, true);
        // To do: Panggillah Method Informasi dari class KomputerVIP
        kvip.informasi();
        // To do: Panggillah Method Login
        kvip.login("Asep");
        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism
        // overloading
        kvip.bermain(2);
        kvip.bermain(2, 3);

        System.out.println("\n==========================================\n");

        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium kPremium = new KomputerPremium(7, "Warnet Sukabirus", 5000, true);
        // To do: Panggillah Method Informasi dari class KomputerPremium
        kPremium.informasi();
        // To do: Panggillah Method Pesan
        kPremium.pesan(3);
        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism
        // overloading
        kPremium.tambahLayanan("Nasi Goreng");
        kPremium.tambahLayanan("Mie Tek-tek", "Es Teh");
    }
}