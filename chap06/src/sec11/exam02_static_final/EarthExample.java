package sec11.exam02_static_final;

public class EarthExample {
	public static void main(String[] args) {
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS+"km");
		System.out.println("지구의 표면적 : " + Earth.EARTH_SURFACE_AREA + "km^2");
	}
}

// 출력값
/*
지구의 반지름 : 6400.0km
지구의 표면적 : 5.147185403641517E8km^2
*/
