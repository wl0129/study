package study.chap03;
//?���? ?���? ?��?��?�� : A && B , A || B, !A , A & B, A | B
//c?��?�� : !, &&, ||

public class Logical {

	public static void main(String[] args) {
	int num = 10 ;
	int var1= 20;
	int a;
	int b=10;
	//A && B
	//A�? false?���? B�? true ?���? false?���? ?��?��?��?���? ?��?��?��?�� 
	boolean flag = ((a=num)>11) && ((b=var1)<20);
	System.out.println("flag="+flag+",a="+a+",b="+b);
	
	//?��바에?�� 추�??�� 기능 : A�? false ?��?��?��?�� B�? true ?���? false?���? ?��?��
	flag = ((a=num)>11) & ((b= var1)<20);
	System.out.println("flag="+flag+",a="+a+",b="+b);
	
	}

}
