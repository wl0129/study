package study.chap04;

public class Exercise03 {

	public static void main(String[] args) {
		int i = 1;
		int sum=0;
		for(i=1;i<=100;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println("3�� ����� ��="+sum);
	}

}
