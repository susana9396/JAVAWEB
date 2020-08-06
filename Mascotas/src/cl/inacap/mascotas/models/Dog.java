package cl.inacap.mascotas.models;

public class Dog extends Animal {

	public Dog(String n, String b, double w) {
		super(n,b,w);
	}
	@Override
	public String showAffection() {
		if(this.getWeight() < 30) {
			return this.getName() + " Salto a tu regazo";
		}else {
			return this.getName() + " Se acurrucuco a tu lado";
		}
		
	}

}
