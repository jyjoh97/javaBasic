package sec2;
//상수 : 값이 변하지 않는 데이터 -> final static
public class Class4 {

	final static double PI = 3.1415;
	final static int KB = 1024;
	final static int MB = 1024*KB;
	final static long GB = 1024*MB;
	final static long TB = 1024*GB;
	final static int EARTH_RADIUS = 6400;
	final static double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = (double) PI * 4 * EARTH_RADIUS * EARTH_RADIUS;
	}
	
}
