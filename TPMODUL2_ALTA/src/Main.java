import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Burung> listBurung = new ArrayList<>();
    static ArrayList<Kucing> listKucing = new ArrayList<>();

    protected static void addAnimal() {
        boolean running = true;
        while (running) {
            System.out.print("What Animal You Want To Add:\n1. Cat\n2. Bird\nChoose Options: ");
            String chosenOption = sc.nextLine();
            switch (chosenOption) {
                case "1" -> {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Cat Breeds: ");
                    String catBreeds = sc.nextLine();
                    listKucing.add(new Kucing(name, age, catBreeds));
                    System.out.println();
                    running = !running;
                    break;
                }
                case "2" -> {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Feather Color: ");
                    String featherColor = sc.nextLine();
                    listBurung.add(new Burung(name, age, featherColor));
                    System.out.println();
                    running = !running;
                    break;
                }
                default -> System.out.println("\nThere is no option " + chosenOption + "\n");
            }
        }
    }

    protected static void showAnimalData() {
        boolean running = true;
        while (running) {
            String food;
            System.out.print("What Animal Data You Want To Show:\n1. Cat\n2. Bird\nChoose Options: ");
            String chosenOption = sc.nextLine();
            switch (chosenOption) {
                case "1" -> {
                    System.out.print("What food do you want to give to the cats?: ");
                    food = sc.nextLine();
                    for (Kucing kc : listKucing) {
                        kc.infoHewan();
                        kc.suara();
                        kc.makan();
                        System.out.println(kc.makan(food));
                        System.out.println();
                    }
                    running = !running;
                }
                case "2" -> {
                    System.out.print("What food do you want to give to the birds?: ");
                    food = sc.nextLine();
                    for (Burung br : listBurung) {
                        br.infoHewan();
                        br.suara();
                        br.makan();
                        System.out.println(br.makan(food));
                        System.out.println();
                    }
                    running = !running;
                }
                default -> System.out.println("\nThere is no option " + chosenOption + "\n");
            }
        }
    }

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.print(
                    "=== EAD MODUL 2 ===\n--- Menu ---\n1. Add Animal\n2. Show Animal Data\n3. Exit\nChoose Menu Options: ");
            String chosenMenu = sc.nextLine();
            System.out.println();
            switch (chosenMenu) {
                case "1" -> addAnimal();
                case "2" -> showAnimalData();
                case "3" -> running = !running;
                default -> System.out.println("There is no option " + chosenMenu + "\n");
            }
        }
    }
}
