package hw6;

public class Model3 extends Auto implements CruiseControl {

	//CruiseControl method from CruiseControl class
	public void CruiseControl() {
		System.out.println("Cruise Control Method Implemented");
	}

	//Auto method from Auto class
	public void Auto() {
		System.out.println("Auto Method Implemented");
	}

	//Override the toString method to display info on class
	@Override
	public String toString() {
		return "\n*************************" +
				"\nModel 3";
	}
}
