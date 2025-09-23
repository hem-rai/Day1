package interfaceclass2;

public class TV implements RemoteControl {

	@Override

	public void powerOff() {

		System.out.println("Tv is on now.");
	}

	@Override

	public void powerOn() {

		System.out.println("Tv is off now.");
	}

}
