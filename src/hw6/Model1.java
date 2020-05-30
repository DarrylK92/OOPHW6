package hw6;

public class Model1 extends Auto implements PowerSteering {

	//PowerSteering method from PowerSteering class
	public void PowerSteering() {
		System.out.println("Power Steering Method Implemented");
	}

	//Auto method from Auto class
	public void Auto() {
		System.out.println("Auto Method Implemented");
	}

	//Override the toString method to display info on class
	@Override
	public String toString() {
		return "\n*************************" +
				"\nModel 1";
	}
}
