import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	ArrayList<Animal>farm = new ArrayList<Animal>();
	Pig pig = new Pig();
	Cow cow = new Cow();
	Cow sven = new Cow();
	Cow Joergen = new Cow();
	Sheep sheep = new Sheep();
	Chicken chicken = new Chicken();
	farm.add(pig);
	farm.add(cow);
	farm.add(sheep);
	farm.add(chicken);
	farm.add(sven);
	farm.add(Joergen);
	for(int i =0; i<farm.size();i++) {
		farm.get(i).makeNoise();
	}
}
}
