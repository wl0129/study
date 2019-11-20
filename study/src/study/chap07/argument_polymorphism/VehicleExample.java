package study.chap07.argument_polymorphism;

public class VehicleExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.driver(new Bus());
		driver.driver(new Taxi());
		//매개변수에 어떤 자식 객체를 넣어주냐에 따라 자식객체의 run() 

	}

}
