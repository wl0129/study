package study.chap03;
//Overflow : ?μΉλ€. ???  ? ?? κ°λ³΄?€ ?° κ°μ ???₯?? €κ³? ?  κ²½μ°
public class Overflow {

	public static void main(String[] args) {
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		int sum = a + b; // ?? 
		
		sum= add(a,b);
	}
	//??±? κ²°κ³Όκ°? ??€? κ²μ ?Ό?  ? ??.
	//μ§μ  ??μ§? λ§κ³  ?¨?λ₯? ?¬?©?΄? κ°??₯? ??¬λ₯? μ€μ¬?Ό.
	private static int add(int a, int b) {
		if(a == Integer.MAX_VALUE && b == Integer.MAX_VALUE) {
			
			System.out.println("κ²°κ³Όκ°μ΄ ?μΉ©λ?€.");
			return -1; //??¬λ°μ? ?€λ₯? μ²λ¦¬ κ°??₯
	}
	else 
		return a+b; //
	}
}
