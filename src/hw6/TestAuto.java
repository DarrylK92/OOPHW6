/*
	This program creates 3 different models of vehicles and exeuctes each of their methods.
	
	Author: Darryl Karney
	Course: CPSC24500
 */

package hw6;

public class TestAuto {

	public static void main(String[] args) {
		//Create and test model 1
		Model1 m1 = new Model1();
		System.out.println(m1);
		m1.Auto();
		m1.PowerSteering();
		
		//Create and test model 2
		Model2 m2 = new Model2();
		System.out.println(m2);
		m2.Auto();
		m2.AntiLockBrakes();
		m2.CruiseControl();
		
		//Create and test model 3
		Model3 m3 = new Model3();
		System.out.println(m3);
		m3.Auto();
		m3.CruiseControl();
	}

}
