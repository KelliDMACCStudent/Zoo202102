package model;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Jan 27, 2021
 */
public class Sheep extends Cat{
	
 private double weight;
	public Sheep() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sheep(String name, String color, int age, double weight) {
		super(name, color, age);
		// TODO Auto-generated constructor stub
		this.weight = weight;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Sheep [weight=" + weight + ", getName()=" + getName() + ", getColor()=" + getColor() + ", getAge()="
				+ getAge() + ", toString()=";
	}
	
	public String speak() {
		// TODO Auto-generated method stub
		return "baa!";
	}


}
