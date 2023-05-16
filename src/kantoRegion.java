public class kantoRegion extends Pokemon {
	private String cityFound;
	private double defenseStat;
	private double catchRate;
	
	/*
	 * Creates a default constructor using Pokemon.java's default constructor
	 * Also adds the Region specific variable as well
	 */
	public kantoRegion() {
		super("No Name", 0.0, "No type", 0);
		cityFound = "None";
		defenseStat = 0.0;
		catchRate = 0;
	}
	
	/*
	 * Calls super's 4-argument constructor
	 * Sets values for cityFound, defenseStat, and chanceFind
	 */
	public kantoRegion(String name, double weight, String type, int number, String cityFound, double defenseStat, double catchRate) {
		super(name, weight, type, number);
		this.cityFound = cityFound;
		this.defenseStat = defenseStat;
		this.catchRate = catchRate;
	}
	
	/*
	 * Returns the city the Pokemon is Found
	 * @return cityFound
	 */
	public String getCityFound(){
		return this.cityFound;
	}
	
	/*
	 * Returns the defensive stat of the Pokemon
	 * @return defenseStat
	 */
	public double getDefenseStat() {
		return this.defenseStat;
	}
	
	/*
	 * Returns the chance to find the Pokemon
	 * @return chanceFind
	 */
	public double getCatchRate() {
		return this.catchRate;
	}
	
	/*
	 * Sets cityFound to a new value
	 * @return void
	 */
	public void setCityFound (String cityFound) {
		this.cityFound = cityFound;
	}
	
	/*
	 * Sets defenseStat to a new value
	 * @return void
	 */
	public void setDefenseStat (double defenseStat) {
		this.defenseStat = defenseStat;
	}
	
	/*
	 * Sets chanceFind to a new value
	 * @return void
	 */
	public void setCatchRate(int catchRate) {
		this.catchRate = catchRate;
	}
	
	/*
	 * Overrides the toString method to present
	 * all Kanto Region Pokemon
	 */
	@Override public String toString() {		
		return "Name: " + super.getName() +
				"Weight: " + super.getWeight() +
				"Type: " + super.getType() +
				"Number: " + super.getNumber() +
				"City Found: " + this.getCityFound() +
				"Defensive Stat: " + this.getDefenseStat()+
				"Catch Rate: " + this.getCatchRate() + "%";
	}
	
//	 @Override public boolean equals(Object o) {
//	    	if (o == this) {
//	            return true;
//	        } else if (! (o instanceof kantoRegion)) {
//	            return false;
//	        } else {
//	            kantoRegion k = (kantoRegion) o;
//	            return k.getName().equals(this.getName()) && (k.getWeight()) == this.getWeight() && k.getType().equals(this.getType()) &&
//	            		k.getNumber() == (this.getNumber()) && k.getCityFound().equals(this.getCityFound()) && k.getDefenseStat() == this.getDefenseStat() 
//	            		&& k.getChanceFind() == (this.getChanceFind());
//	        }
//	    }
//	 
//	public int compareTo(kantoRegion k) {
//		if(this.equals(k)) {
//			return 0;
//		} else if(this.getName().equals(k.getName())) {
//			return this.get
//		}
//	}
}
