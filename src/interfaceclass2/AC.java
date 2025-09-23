package interfaceclass2;

public class AC implements RemoteControl {

	@Override

	public void powerOff() {

		System.out.println("Ac is on now.");
	}

	@Override

	public void powerOn() {

		System.out.println("Ac is off now.");
	}

}
