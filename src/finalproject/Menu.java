package main;

import java.util.Scanner;
import managers.CreatureManager;
import creatures.Dragon;
import creatures.Unicorn;
import creatures.Phoenix;

public class Menu {

    public static void main(String[] args) {
        // Initialize scanner and manager
        Scanner myScanner = new Scanner(System.in);
        CreatureManager manager = new CreatureManager();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n---Creature Management---");
            System.out.println("1. Add Creature");
            System.out.println("2. Display Creatures");
            System.out.println("3. Modify Creature");
            System.out.println("4. Remove Creature");
            System.out.println("5. Filter by Type");
            System.out.println("6. Show Statistics");
            System.out.println("7. Save Data");
            System.out.println("8. Load Data");
            System.out.println("9. Exit");
            System.out.print("Enter your choice (1-9): ");

            int choice = myScanner.nextInt();
            myScanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addCreature(manager, myScanner);
                    break;
                case 2:
                    manager.displayCreatures();
                    break;
                case 3:
                    System.out.println("Feature not implemented yet.");
                    break;
                case 4:
                    removeCreature(manager, myScanner);
                    break;
                case 5:
                    filterByType(manager, myScanner);
                    break;
                case 6:
                    System.out.println("Feature not implemented yet.");
                    break;
                case 7:
                    System.out.println("Feature not implemented yet.");
                    break;
                case 8:
                    System.out.println("Feature not implemented yet.");
                    break;
                case 9:
                    exit = true;
                    System.out.println("Exiting Creature Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 9.");
            }
        }

        myScanner.close();
    }

    private static void addCreature(CreatureManager manager, Scanner scanner) {
        System.out.println("\n---Add Creature---");
        System.out.println("1. Dragon");
        System.out.println("2. Unicorn");
        System.out.println("3. Phoenix");
        System.out.print("Choose creature type (1-3): ");

        int creatureType = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter creature name: ");
        String name = scanner.nextLine();

        switch (creatureType) {
            case 1:
                manager.addCreature(new Dragon(name));
                break;
            case 2:
                manager.addCreature(new Unicorn(name));
                break;
            case 3:
                manager.addCreature(new Phoenix(name));
                break;
            default:
                System.out.println("Invalid creature type.");
        }
    }

    private static void removeCreature(CreatureManager manager, Scanner scanner) {
        System.out.println("\n---Remove Creature---");
        manager.displayCreatures();
        System.out.print("Enter the name of the creature to remove: ");
        String name = scanner.nextLine();
        manager.removeCreatureByName(name);
    }

    private static void filterByType(CreatureManager manager, Scanner scanner) {
        System.out.println("\n---Filter by Type---");
        System.out.println("1. Dragon");
        System.out.println("2. Unicorn");
        System.out.println("3. Phoenix");
        System.out.print("Choose type to filter (1-3): ");

        int type = scanner.nextInt();
        manager.displayCreaturesByType(type);
    }
}
