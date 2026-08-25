package chap09;

public class Habitat {
	int maxPopulation;
	char animalSize, animalDiet;
	private double surfaceArea;
	public final static int SMALL_POPULATION = 6;
	public final static int MEDIUM_POPULATION = 12;
	public final static int BIG_POPULATION = 18;
	public final static char SMALL_ANIMAL = 'S';
	public final static char MEDIUM_ANIMAL = 'M';
	public final static char BIG_ANIMAL = 'B';
	public final static char HERBIVORE = 'h';
	public final static char OMNIVORE = 'o';
	public final static char CARNIVORE = 'c';
	public final static int DEFAULT_POPULATION_SIZE = Habitat.MEDIUM_POPULATION;
	public final static char DEFAULT_ANIMAL_SIZE = Habitat.SMALL_ANIMAL;
	public final static char DEFAULT_ANIMAL_DIET = Habitat.HERBIVORE;

	public Habitat() {
		maxPopulation = Habitat.DEFAULT_POPULATION_SIZE;
		animalSize = Habitat.DEFAULT_ANIMAL_SIZE;
		animalDiet = Habitat.DEFAULT_ANIMAL_DIET;
		surfaceArea = 1.0;
	}

	public Habitat(int maxPopulation, char animalSize, char animalDiet, double surfaceArea) {
		super();
		this.maxPopulation = maxPopulation;
		this.animalSize = animalSize;
		this.animalDiet = animalDiet;
		this.surfaceArea = surfaceArea;
	}

	public static Habitat provisionHabitat(String animal) {
		if (animal.equalsIgnoreCase("gray wolf")) {
			return new Habitat(9, Habitat.MEDIUM_ANIMAL, Habitat.CARNIVORE, 130000000);
		} else if (animal.equalsIgnoreCase("bison")) {
			return new Habitat(30, Habitat.BIG_ANIMAL, Habitat.HERBIVORE, 121500);
		} else if (animal.equalsIgnoreCase("grizzly bear")) {
			return new Habitat(2, Habitat.MEDIUM_ANIMAL, Habitat.OMNIVORE, 10000);
		} else {
			return new Habitat();
		}
	}

	public int getMaxPopulation() {
		return maxPopulation;
	}

	public void setMaxPopulation(int maxPopulation) {
		this.maxPopulation = maxPopulation;
	}

	public char getAnimalSize() {
		return animalSize;
	}

	public void setAnimalSize(char animalSize) {
		this.animalSize = animalSize;
	}

	public char getAnimalDiet() {
		return animalDiet;
	}

	public void setAnimalDiet(char animalDiet) {
		this.animalDiet = animalDiet;
	}

	public double getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public static int getSmallPopulation() {
		return Habitat.SMALL_POPULATION;
	}

	public static int getMediumPopulation() {
		return Habitat.MEDIUM_POPULATION;
	}

	public static int getBigPopulation() {
		return Habitat.BIG_POPULATION;
	}

	public static char getSmallAnimal() {
		return Habitat.SMALL_ANIMAL;
	}

	public static char getMediumAnimal() {
		return Habitat.MEDIUM_ANIMAL;
	}

	public static char getBigAnimal() {
		return Habitat.BIG_ANIMAL;
	}

	public static char getHerbivore() {
		return HERBIVORE;
	}

	public static char getOmnivore() {
		return OMNIVORE;
	}

	public static char getCarnivore() {
		return CARNIVORE;
	}

	public static int getDefaultPopulationSize() {
		return DEFAULT_POPULATION_SIZE;
	}

	public static char getDefaultAnimalSize() {
		return DEFAULT_ANIMAL_SIZE;
	}

	public static char getDefaultAnimalDiet() {
		return DEFAULT_ANIMAL_DIET;
	}

}
