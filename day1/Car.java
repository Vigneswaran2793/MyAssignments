package week1.day1;

public class Car {
	
	public void applyBrake() {
		
		System.out.println("Applied Brake");

	}
	
	public void soundHorn() {
		
		System.out.println("Sound Horn");	
	}

	public static void main(String[] args) {
		
		Car myCar=new Car();
		myCar.applyBrake();
		myCar.soundHorn();
		
	}
}
