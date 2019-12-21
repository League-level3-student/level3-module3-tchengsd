package _01_AnimalFarm;

public class Cow extends Animal {

	Cow(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println(name + ": Moo");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name + " is eating grass.");
	}

}
