package finalproject;

public class Phoenix extends Creature {
    private int lifeCycles; // Represents the number of life cycles the phoenix has gone through

    public Phoenix(String name, int lifeCycles) {
        super(name, "Phoenix");
        this.lifeCycles = lifeCycles;
    }

    public int getLifeCycles() {
        return lifeCycles;
    }

    @Override
    public String getDetails() {
        return "Type: Phoenix, Name: " + name + ", Life Cycles: " + lifeCycles;
    }
}
