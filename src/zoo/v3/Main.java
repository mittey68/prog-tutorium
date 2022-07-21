package zoo.v3;

import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		// Pferde erstellen
		Horse horse1 = new Horse("Gisela", 1000, "Schimmel");
		Horse horse2 = new Horse("Peter", 4600, "Schimmel");
		Horse horse3 = new Horse("Horst", 300, "Schimmel");
		// Vögel erstellen
		Bird bird1 = new Bird("Fritz", 60, Color.YELLOW);
		Bird bird2 = new Bird("Quirin", 30, Color.GREEN);
		Bird bird3 = new Bird("Felix", 40, Color.BLUE);
		// Fische erstellen
		Fish fish1 = new Fish("Uwe", 50, true);
		Fish fish2 = new Fish("Nathan", 30, false);
		Fish fish3 = new Fish("Nemo", 25, false);
		
		// Gehege erstellen
		Enclosure gehege1 = new LandEnclosure("Pferdekoppel", 200, 300, true);
		Enclosure gehege2 = new AirEnclosure("Vogelvoliere", 150, 200, 100);
		Enclosure gehege3 = new WaterEnclosure("Aquarium", 400, 300, 120);
		Enclosure vielZuKleinesGehege = new LandEnclosure(" Viel zu kleines Gehege", 1, 1, false);
		
		// Fehler testen
		vielZuKleinesGehege.addAninmal(horse1);
		gehege2.addAninmal(horse1);
		
		// Tiere zum Gehege hinzufügen
		gehege1.addAninmal(horse1);
		gehege1.addAninmal(horse2);
		gehege1.addAninmal(horse3);
		
		gehege2.addAninmal(bird1);
		gehege2.addAninmal(bird2);
		gehege2.addAninmal(bird3);
		
		gehege3.addAninmal(fish1);
		gehege3.addAninmal(fish2);
		gehege3.addAninmal(fish3);
		
		// Gehege ausgeben
		gehege1.print();
		gehege2.print();
		gehege3.print();
		
		// Tiere altern lassen
		gehege1.ageAnimals();
		gehege1.ageAnimals();
		gehege1.ageAnimals();
		gehege1.ageAnimals();
		gehege1.ageAnimals();
		gehege1.ageAnimals();
		
		gehege2.ageAnimals();
		gehege2.ageAnimals();
		gehege2.ageAnimals();
		
		gehege3.ageAnimals();
		gehege3.ageAnimals();
		gehege3.ageAnimals();
		gehege3.ageAnimals();
		gehege3.ageAnimals();
		gehege3.ageAnimals();
		gehege3.ageAnimals();
		
		// Gehege ausgeben
		gehege1.print();
		gehege2.print();
		gehege3.print();
	}

}
