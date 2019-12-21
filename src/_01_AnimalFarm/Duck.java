package _01_AnimalFarm;

public class Duck extends Animal {

	Duck(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println(name + ": Quack");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name + " is eating duck food");
	}

}
