
public class JohtoRegion extends Pokemon{ 
	
	private boolean canFollow;
	private double chanceShiny;
	private String breeder;
	
	/**
     * Default constructor for JohtoRegion.
     * Calls the ******** argument constructor
     * Sets canFollow default to false
     * Sets chanceShiny default to 0
     * Sets breeder to "Unknown Breeder"
     */	
	
	public JohtoRegion() {
		super();
		canFollow = false;
		chanceShiny = 0;
		breeder = "Unknown Breeder";
	
	}
	
	
	public JohtoRegion(String name, double weight, String type, int number, boolean canFollow, double chanceShiny, String breeder) {
		super(name, weight, type, number);
		this.canFollow = canFollow;
		this.chanceShiny = chanceShiny;
		this.breeder = breeder;
	}
	
	public boolean getCanFollow() {
		return canFollow;
	}
	
	public double getChanceShiny() {
		return chanceShiny;
	}
	
	public String getBreeder() {
		return breeder;
	}
	
	public void setCanFollow(boolean canFollow) {
		this.canFollow = canFollow;
	}
	
	public void setChanceShiny(double chanceShiny) {
		this.chanceShiny = chanceShiny;
	}
	
	public void setBreeder(String breeder) {
		this.breeder = breeder;
	}
	
	@Override
	public String toString() {
		return "Can follow: " + canFollow 
				+ "\nChance Shiny: " + chanceShiny + "%" 
				+ "\nBreeder: " + breeder;
	}

	
}
