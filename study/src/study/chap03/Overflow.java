package study.chap03;
//Overflow : ?��친다. ?��?��?�� ?�� ?��?�� 값보?�� ?�� 값을 ???��?��?���? ?�� 경우
public class Overflow {

	public static void main(String[] args) {
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		int sum = a + b; // ?��?�� 
		
		sum= add(a,b);
	}
	//?��?��?�� 결과�? ?��?��?�� 것을 ?��?�� ?�� ?��?��.
	//직접 ?��?���? 말고 ?��?���? ?��?��?��?�� �??��?�� ?��?���? 줄여?��.
	private static int add(int a, int b) {
		if(a == Integer.MAX_VALUE && b == Integer.MAX_VALUE) {
			
			System.out.println("결과값이 ?��칩니?��.");
			return -1; //?��?��발생?�� ?���? 처리 �??��
	}
	else 
		return a+b; //
	}
}
