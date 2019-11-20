package study.chap05;

public class ArrayExample {

	public static void main(String[] args) {
//		int arr[4]; //x
		//자바: 배열->객체(Class)->인스턴스화 (객체를 생성):메모리를 할당받는다.
		int[] arr1 = new int [4]; //new : 객체를 생성하기 생성자를 호출
		//arr1 참조변수 (주소를 저장) 
		int [ ] arr2 =null;
	//	arr2[2]=10;
		arr1[2]=20;
		System.out.println("arr1[2]="+arr1[2]);

	}

}
