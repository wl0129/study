package study.chap03;

public class Arithmatic {

	public static void main(String[] args) {
		int num= 0x0011;
		int sNum=num << 2;
		int rNum=num>>2;
		int threeShift=num>>>2;//?��른쪽?���? 2비트 ?��?��
		
		System.out.printf("num=%x\n",num);
		System.out.printf("snum=%x\n",sNum);
		System.out.printf("rnum=%x\n",rNum);
		System.out.printf("threeshift=%x\n",threeShift);
		num= 0xF0000000;//�??��비트�? 1?��?���? 
	}

}
