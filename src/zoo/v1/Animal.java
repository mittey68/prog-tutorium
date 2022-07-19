package zoo.v1;

public class Animal {
	protected String name;
	protected int price;
	protected int age;
	protected int maxAge;
	protected boolean alive;
	
	public Animal(String name, int price, int age, int maxAge) {
		this.name = name;
		this.price = price;
		this.age = age;
		this.maxAge = maxAge;
		this.alive = true;
	}
	
	//Getters
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getAge() {
		return age;
	}

	public int getMaxAge() {
		return maxAge;
	}
	
	public boolean getAlive() {
		return alive;
	}
	
	//Methods


	public void getOlder() {
		this.age++;
		if (this.age > this.maxAge) {
			this.alive = false;
		}
	}
	public int getWorth() {
		if(this.age <= 5) {
			return this.price/2;
		}
		else {
			return this.price;
		}
	}

	public void print() {
		System.out.println("Tier:");
		System.out.println("- Name: " + this.name);
		System.out.println("- Aktueller Wert: " + this.getWorth());
		System.out.println("- Alter: " + this.age);
		System.out.println("- Geschätzte Lebenserwartung: " + this.maxAge);
	}
	
	
	
}
