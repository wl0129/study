package study.chap04;

public class NestedBreak {

	public static void main(String[] args) {
	Loop: for(int i =2; i <10 ; i++){
		for(int j = 1; j<10; j++) {
			if(j>5 && j> 5)
				break Loop;
			System.out.println(i+ "*"+j+"="+i*j);
		}
	}
	}

}
