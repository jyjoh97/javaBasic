//change
package ch6;

public class Car {
	
	String company = "르노삼성자동차";
	String model;
	String color;
	int maxSpeed;
	double dou;
	
	
	Car() {
		this("SM6");
	}
	
	Car(String model) {
		this(model, "검정");
	}
	
	Car(String model, String color) {
		this(model, color, 250);
		
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model=model;
		this.color=color;
		this.maxSpeed = maxSpeed;
		
	}
	
	
	public String model2(String model) {
		
		return model = model;
	}
	
	double divide(int x, int y) {
		

		return dou;
	}

}
