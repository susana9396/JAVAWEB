package cl.inacap.maestroobj1.run;

import cl.inacap.maestroobj1.model.Human;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human Wizard1= new Human();
		Human Ninja1= new Human();
		Human Wizard2= new Human();
		Human Ninja2= new Human();
		Human Samurai2= new Human();

		System.out.println("Ataque de Wizard1 a Samurai2");
		System.out.println("Nuevos Puntos Strenght Samurai2");
		Wizard1.attack(Samurai2);

		System.out.println("Ataque de Wizard2 a Ninja1");
		System.out.println("Nuevos Puntos Strenght Ninja1");
		Wizard2.attack(Ninja1);

		System.out.println("Ataque de Ninja2 a Samurai2");
		System.out.println("Nuevos Puntos Strenght Samurai2");
		Ninja2.attack(Samurai2);


	}

}
