package hw6;

public class Model2 extends Auto implements AntiLockBrakes, CruiseControl{

	//CruiseControl method from CruiseControl class
	public void CruiseControl() {
		System.out.println("Cruise Control Method Implemented");
	}

	//AntiLockBrakes method from AntiLockBrakes class
	public void AntiLockBrakes() {
		System.out.println("Anti-Lock Brakes Method Implemented");
	}

	//Auto method from Auto class
	public void Auto() {
		System.out.println("Auto Method Implemented");
	}

	//Override the toString method to display info on class
	@Override
	public String toString() {
		return "\n*************************" +
				"\nModel 2";
	}
}
