public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		flightBehavior = new Flightless();
	}
	
	public void fly() {
		flightBehavior.performFlight();
	}
	
	public void setFlightBehavior(FlightBehavior newFlightBehavior) {
		flightBehavior = newFlightBehavior;
	}
}