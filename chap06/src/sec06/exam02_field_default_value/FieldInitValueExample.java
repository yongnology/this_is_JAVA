package sec06.exam02_field_default_value;

public class FieldInitValueExample {
	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField : " + fiv.byteField);
		System.out.println("shortField : " + fiv.shortField);
		System.out.println("initField : " + fiv.initField);
		System.out.println("longField : " + fiv.longField);
		System.out.println("booleanField : " + fiv.booleanField);
		System.out.println("charField : " + fiv.charField);
		System.out.println("floatField : " + fiv.floatField);
		System.out.println("doubleField : " + fiv.doubleField);
		System.out.println("arrField : " + fiv.arrField);
		System.out.println("referenceField : " + fiv.referenceField);
	}
}
// 출력값
/*
byteField : 0
shortField : 0
initField : 0
longField : 0
booleanField : false
charField :  
//          " "
floatField : 0.0
doubleField : 0.0
arrField : null
referenceField : null
*/

// charField 는 빈문자가 들어가 있는 것이다.