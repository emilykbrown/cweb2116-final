package finalproject;

public class Unicorn extends Creature {
    private String hornColor; // Represents the color of the unicorn's horn

    public Unicorn(String name, String hornColor) {
        super(name, "Unicorn");
        this.hornColor = hornColor;
    }

    public String getHornColor() {
        return hornColor;
    }

    @Override
    public String getDetails() {
        return "Type: Unicorn, Name: " + name + ", Horn Color: " + hornColor;
    }
}
