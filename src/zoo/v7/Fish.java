package zoo.v7;

public class Fish extends Animal {
	private boolean venomous;

	public Fish(String name, int price, boolean venomous) {
		super(name, GehegeType.WATER, price, 0, 5, FoodType.FISHFOOD);
		this.venomous = venomous;
	}

	public int getWorth() {
		if(this.venomous) {
			return price*3;
		}
		return price;
	}

	public void print() {
		System.out.println("Fisch:");
		System.out.println("- Name: " + this.name);
		System.out.println("- Giftig? " + this.venomous);
		System.out.println("- Tierart: " + this.type);
		System.out.println("- Aktueller Wert: " + this.getWorth());
		System.out.println("- Alter: " + this.age);
		System.out.println("- Geschätzte Lebenserwartung: " + this.maxAge);
	}
	
	

}
