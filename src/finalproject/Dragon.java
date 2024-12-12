package finalproject;

public class Dragon extends Creature {
    private int firePower; // Represents the power of the dragon's fire

    public Dragon(String name, int firePower) {
        super(name);
        this.firePower = firePower;
    }

    public int getFirePower() {
        return firePower;
    }

    @Override
    public String getDetails() {
        return "Type: Dragon, Name: " + name + ", Fire Power: " + firePower;
    }

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		
	}
}
