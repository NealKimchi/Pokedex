/**
 * Pokemon.java
 * CIS 36B, Course Project
 */

public abstract class Pokemon implements Comparable<Pokemon> {
	private String name;
	private double weight;
	private String type;
	private int number;
	
	public Pokemon() {
		this("Name Unknown", 0.0, "Type Unknown", 0);
	}
	
	public Pokemon(String name, double weight, String type, int number) {
		this.name = name;
		this.weight = weight;
		this.type = type;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String getType() {
		return type;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override public String toString() {
		StringBuilder j = new StringBuilder();
		j.append("Name: ");
		j.append(name);
		j.append("\nWeight: ");
		j.append(weight);
		j.append("\nType: ");
		j.append(type);
		j.append("\nNumber: ");
		j.append(number);
		return j + "\n";

	}
}
