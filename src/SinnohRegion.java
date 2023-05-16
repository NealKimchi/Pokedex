/**
 * SinnohRegion.java
 * CIS 36B, Course Project
 */

public class SinnohRegion extends Pokemon {
	
	private boolean isLegendary;
	private double combatPower;
	private int luck;
	
	public SinnohRegion() {
		super();
		isLegendary = false;
		combatPower = 0.0;
		luck = 0;
	}
	
	public SinnohRegion(String name, double weight, String type, int number, boolean isLegendary, double combatPower, int luck) {
		super(name, weight, type, number);
		this.isLegendary = isLegendary;
		this.combatPower = combatPower;
		this.luck = luck;
	}
	
	public boolean getLegendary() {
		return isLegendary;
	}
	
	public double getCP() {
		return combatPower;
	}
	
	public int getLuck() {
		return luck;
	}
	
	public void setLegendary(boolean isLegendary) {
		this.isLegendary = isLegendary;
	}
	
	public void setCP(double combatPower) {
		this.combatPower = combatPower;
	}
	
	public void setLuck(int luck) {
		this.luck = luck;
	}
	
	@Override public String toString() {
		return super.toString() + "\nLegendary?: " + isLegendary + "\nCombat Power: " + combatPower + "Luck(1-10): " + luck;
		
	}
	

}
