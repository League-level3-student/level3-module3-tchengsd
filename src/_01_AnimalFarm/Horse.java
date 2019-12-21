package _01_AnimalFarm;

public class Horse extends Animal {
	Horse(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println(name + ": Neigh");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name + " is eating horse food.");
	}

}
