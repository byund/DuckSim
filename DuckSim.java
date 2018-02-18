public class DuckSim {

	private Duck[] ducks;
	private int size;
	
	public DuckSim() {
		ducks = Duck[10];
		size = 0;
	}
	
	public void createDuck(String duck) {
		if (duck == "mallard") {
			ducks[size] = new MallardDuck();
			size++;
		} else if (duck == "rubber") {
			ducks[size] = new RubberDuck();
			size++;
		} else if (duck == "decoy") {
			ducks[size] = new DecoyDuck();
			size++;
		} else {
			System.out.println("Invalid duck entry.");
		}
	}
	
	public void modifyDuck(int duckIndex) {
		if (duckIndex < 0 || duckIndex > 9) {
			System.out.println("Invalid selection. Choose from 0-9.");
			return;
		}
		selectedDuck = ducks[duckIndex];
		performActionOn(selectedDuck);
	}
	
	public void performActionOn(Duck duck) {
		// Some sort of scanner and instantiation of a string
	}
	
	
		
			
	
	public static void main(String[] args) {
		
		Duck rubber = new RubberDuck();
		Duck decoy = new DecoyDuck();
		
		System.out.print("Mallard: ");
		mallard.fly();
		System.out.print("Rubber duck: ");
		rubber.fly();
		System.out.print("Decoy duck: ");
		decoy.fly();
		
		System.out.println("Giving decoy duck a jetpack.");
		decoy.setFlightBehavior(new RocketPowered());
		System.out.print("Decoy duck w/ jetpack: ");
		decoy.fly();
		System.out.println("Clipping mallard's wings.");
		mallard.setFlightBehavior(new Flightless());
		System.out.print("Wingless mallard: ");
		mallard.fly();
	}
}
		