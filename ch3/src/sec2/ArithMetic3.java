package sec2;

public class ArithMetic3 {
	public static void main(String[] args) {
		//NAN(Not A Number)의 검사 
		
		String indata = "NaN";
		String data1 = "500.4";
		double val1 = Double.valueOf(indata);
		double data2 = 500.4;
		data2 += val1;								//data2 = 500.4 + NAN
		System.out.println("출력결과 : = "+data2);
		
		
		data2 = 500.4;
		double val2 = Double.valueOf(data1);		//"500.4" -> 500.4
		data2 += val2;
		System.out.println("출력결과 : "+data2);
		
		
		
		
		
		
		
		
		

	}
}