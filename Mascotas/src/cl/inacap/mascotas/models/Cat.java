package cl.inacap.mascotas.models;

public class Cat extends Animal {

	public Cat(String n, String b, double w) {
		super(n, b, w);
	}

	@Override
	public String showAffection() {
		return "Tu gato de raza: " + this.getBreed() + " de nombre: " + this.getName()
				+ " , te esta mirando con hambre... ALIMENTALO!!!!";
	}

}
