package ch6;

public class CarEx {

	public static void main(String[] args) {
		
		Car carex = new Car();
		System.out.println(carex.company);
		System.out.println(carex.model);
		System.out.println(carex.color);
		System.out.println(carex.maxSpeed);		
		System.out.println();
		
		Car carex1 = new Car("Sm5");
		System.out.println(carex1.company);
		System.out.println(carex1.model);
		System.out.println(carex1.color);
		System.out.println(carex1.maxSpeed);
		System.out.println();
		
			
		Car carex2 = new Car("Sm5", "검정");
		System.out.println(carex2.company);
		System.out.println(carex2.model);
		System.out.println(carex2.color);
		System.out.println(carex2.maxSpeed);
		System.out.println();
		
		
		Car carex3 = new Car("Sm5", "검정", 250);
		System.out.println(carex3.company);
		System.out.println(carex3.model);
		System.out.println(carex3.color);
		System.out.println(carex3.maxSpeed);
		System.out.println(carex3.model2("Qm6"));
		System.out.println("\n");
		
		System.out.println(carex2.model2("Porcwer"));
		System.out.println("\n");
		
		carex3.divide(10, 20);
		System.out.println(carex3.divide(10, 20));
		System.out.println();
		
		double result = carex3.divide(10,20);
		System.out.println(carex3.divide(10, 20));
		
	}

}
