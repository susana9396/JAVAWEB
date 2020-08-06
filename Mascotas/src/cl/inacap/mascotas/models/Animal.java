package cl.inacap.mascotas.models;

public abstract class Animal implements Pet{
	String name;
	String breed;
	double weight;
	
	public Animal() {
		
	}
	
	public Animal(String n, String b, double w) {
		name = n;
		breed = b;
		weight = w;
	}
	
	
	// Gretters y Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
