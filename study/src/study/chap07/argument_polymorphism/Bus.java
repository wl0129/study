package study.chap07.argument_polymorphism;

public class Bus extends Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
