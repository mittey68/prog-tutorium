package zoo.v2;

public class Animal {
	private String name;
	private int price;
	private int age;
	private int maxAge;
	private boolean alive;
	private EnclosureType gehegeType;
	private FoodType foodType;
	
	public Animal(String name, int price, int maxAge, EnclosureType gehegeType, FoodType foodType) {
		this.name = name;
		this.price = price;
		this.age = 0;
		this.maxAge = maxAge;
		this.alive = true;
		this.gehegeType = gehegeType;
		this.foodType = foodType;
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
	
	public EnclosureType getGehegeType() {
		return gehegeType;
	}
	
	public FoodType getFoodType() {
		return foodType;
	}
	
	//Methods
	public void getOlder() {
		if (this.age < this.maxAge) {
			this.age++;
		}
		else {
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
	
	public int feed() {
		return this.foodType.getCost();
	}

	public void print() {
		System.out.println("Tier:");
		System.out.println("- Name: " + this.name);
		System.out.println("- Tierart: " + this.gehegeType);
		System.out.println("- Preis: " + this.price);
		System.out.println("- Aktueller Wert: " + this.getWorth());
		System.out.println("- Alter: " + this.age);
		System.out.println("- Geschätzte Lebenserwartung: " + this.maxAge);
		System.out.println("- Am Leben?: " + this.alive);
		
	}
}
