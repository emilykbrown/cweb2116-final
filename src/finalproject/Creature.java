package finalproject;

public abstract class Creature {
    private String name;

    // Constructor
    public Creature(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayInfo();

	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}
}