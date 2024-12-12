package finalproject;

import Creature;
import java.util.ArrayList;
import java.util.List;

public class CreatureManager {
    private List<Creature> creatures;

    public CreatureManager() {
        creatures = new ArrayList<>();
    }

    // Add a creature to the list
    public void addCreature(Creature creature) {
        creatures.add(creature);
        System.out.println(creature.getName() + " has been added.");
    }

    // Display all creatures
    public void displayCreatures() {
        if (creatures.isEmpty()) {
            System.out.println("No creatures available.");
        } else {
            System.out.println("\n---List of Creatures---");
            for (Creature creature : creatures) {
                System.out.println(creature.getDetails());
            }
        }
    }

    // Remove a creature by name
    public void removeCreatureByName(String name) {
        boolean removed = creatures.removeIf(creature -> creature.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println(name + " has been removed.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    // Display creatures by type
    public void displayCreaturesByType(int type) {
        String creatureType = getTypeFromNumber(type);
        if (creatureType == null) {
            System.out.println("Invalid type.");
            return;
        }

        List<Creature> filteredCreatures = new ArrayList<>();
        for (Creature creature : creatures) {
            if (creature.getType().equalsIgnoreCase(creatureType)) {
                filteredCreatures.add(creature);
            }
        }

        if (filteredCreatures.isEmpty()) {
            System.out.println("No creatures of type " + creatureType + " found.");
        } else {
            System.out.println("\n---Creatures of Type: " + creatureType + "---");
            for (Creature creature : filteredCreatures) {
                System.out.println(creature.getDetails());
            }
        }
    }

    // Helper to map number to creature type
    private String getTypeFromNumber(int type) {
        return switch (type) {
            case 1 -> "Dragon";
            case 2 -> "Unicorn";
            case 3 -> "Phoenix";
            default -> null;
        };
    }
}
