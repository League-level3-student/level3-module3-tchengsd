package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		farm.add(new Chicken("Chicken"));
		farm.add(new Cow("Cow"));
		farm.add(new Duck("Duck"));
		farm.add(new Horse("Horse"));
		farm.add(new Chicken("Chicken 2.0"));
		farm.add(new Duck("Duck 2.0"));
		for(int i = 0; i < 6; i++) {
			farm.get(i).makeNoise();
			farm.get(i).eat();
		}
	}
}
