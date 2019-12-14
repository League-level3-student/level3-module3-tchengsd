package _01_AnimalFarm;

public abstract class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	public abstract void makeNoise();
	public abstract void eat();
}
