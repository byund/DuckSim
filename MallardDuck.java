public class MallardDuck extends Duck {
	
	public MallardDuck() {
		flightBehavior = new CanFly();
	}
	
	public void fly() {
		flightBehavior.performFlight();
	}
	
	public void setFlightBehavior(FlightBehavior newFlightBehavior) {
		flightBehavior = newFlightBehavior;
	}
}