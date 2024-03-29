package sec10.exam04_singleton;

public class SingletonExample {
	public static void main(String[] args) {
		/* 컴파일 에러
		Singleton obj1 = new Singleton();
		*/
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
				
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}

// 출력값
/*
같은 Singleton 객체입니다.
*/
