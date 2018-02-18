public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flightBehavior = new Flightless();
	}
	
	public void fly() {
		flightBehavior.performFlight();
	}
	
	public void setFlightBehavior(FlightBehavior newFlightBehavior) {
		flightBehavior = newFlightBehavior;
	}
}
