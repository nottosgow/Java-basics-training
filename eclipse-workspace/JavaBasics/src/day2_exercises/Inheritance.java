package day2_exercises;

public class Inheritance {

	public static void main(String[] args) {
		Car c = new Car();
		Bus b = new Bus();
		
		b.Route();
		c.Speed(100);
		
		c.Owner();
		b.Stops();
	}
	
}

class Vehicle {
	
	int wheels;
	
	void Route() {
		System.out.println("Vehicle is taking some route");
	}
	
	void Speed(int speed) {
		System.out.println("Vehicle going at " + speed);
	}
}

class Car extends Vehicle {
	
	Car() {
		this.wheels = 4;
	}
	
	void Owner() {
		System.out.println("Car is owned by someone. it has " + this.wheels + " wheels");
	}
}

class Bus extends Vehicle {
	
	Bus() {
		this.wheels = 18;
		System.out.println("Bus has " + this.wheels + " wheels");
	}
	
	void Stops() {
		System.out.println("Bus has a number of stops");
	}
}

class Road {
	void LoadCapacity() {
		System.out.println("The road has load capacity of 50 tonnes");
	}
}