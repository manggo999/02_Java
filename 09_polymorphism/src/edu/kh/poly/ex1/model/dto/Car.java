package edu.kh.poly.ex1.model.dto;

public class Car { /*extends Object*/
	
	// 속성
	private String engine; // 엔진
	private String fuel; // 연료
	private int wheel; // 바퀴개수
	
	
	// 기능(생성자 + 메서드)
	public Car() {}

    // 매개변수 생성자
	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}


	public String getEngine() {
		return engine;
	}


	public void setEngine(String engine) {
		this.engine = engine;
	}


	public String getFuel() {
		return fuel;
	}


	public void setFuel(String fuel) {
		this.fuel = fuel;
	}


	public int getWheel() {
		return wheel;
	}


	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	// Object가 제공하고 있는 메서드를 오버라이딩해서 사용할 수 있다!?
	// Object.toString() 오버라이딩( == 재정의)
	@Override // 오버라이딩 했다는 걸 컴파일러에게 알려주는 @Override 어노테이션
	public String toString() {
		return engine + " / " + fuel + " / " + "wheel";
	}
	

}
