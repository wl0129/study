/*
		 * ?��?��?�� ???��
		 * ?��?��
		 *  char:  2byte (�??��?���? �??��?���? ?��?�� unicode�? �??��)
		 *  		0~2?�� 16?�� -1 까�? (?��?��?�� ?��?��.)
		 *  c?��?��?�� char?�� ?��바에?��?�� byte?? 같다.
		 *  long  8 byte -> c ?��?��?�� long long ?�� ???��
		 *  ?��?��  c ?��?��?? ?��?��  (float , double)
		 *  ?���? �? (true) �? 거짓 (flase) ?�� ???�� -> 1byte
		 *  unsigned ?��?��?�� ???��?? ?��?��. 
		 */
package study.chap03;

public class Primitive {//?��?��?�� ?��름�? ??문자�? ?��?��

	public static void main(String[] args) {// 메소?�� ?��름�? ?��문자�? ?��?��
		byte b1= 0x23;
		char c1= '?��';
		short s1=432;
		int num= 30;   // defaultrk int 
		long ll= 234L; // long?��?�� ?��?��?���? ?��?�� L?�� 추�? 기술 
		float f1=0.43f; //float ?��?��?�� 리터?��?�� f�? 붙여�??��. 
		double d1=0.54; // default �? double 
		boolean flag = true; //?��리형 
		System.out.println("b1 ="+b1);
		System.out.println("c1="+c1);
		System.out.println("s1="+s1);
		System.out.println("num="+num);
		System.out.println("ll="+11);
		System.out.println("f1="+f1);
		System.out.println("d1="+d1);
		System.out.println("flag="+flag);
		
	}

}
