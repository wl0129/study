package study.chap03;

public class Arithmatic {

	public static void main(String[] args) {
		int num= 0x0011;
		int sNum=num << 2;
		int rNum=num>>2;
		int threeShift=num>>>2;//?˜¤ë¥¸ìª½?œ¼ë¡? 2ë¹„íŠ¸ ?´?™
		
		System.out.printf("num=%x\n",num);
		System.out.printf("snum=%x\n",sNum);
		System.out.printf("rnum=%x\n",rNum);
		System.out.printf("threeshift=%x\n",threeShift);
		num= 0xF0000000;//ë¶??˜¸ë¹„íŠ¸ê°? 1?´?˜ê²? 
	}

}
