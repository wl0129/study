package study.chap09.nested_class;

public class OuterClass {
	//멤버: 필드, 생성자, 메소드
	int num;
	ComThread thread1 = new ComThread();
	
	
	//생성자
	public OuterClass() {
		
	}
	
	public void method3(String url) {
		ComThread thread = new ComThread();
		method(thread);
		
	}
	//메소드
	public void method(ComThread thread) {
		thread.start(); //스레드를 구동 -> run()가 실행됨 
	}
	public void method2() {
		ComThread thread = new ComThread();
		thread.start();
	}
	//인스턴스 멤버 클래스 	: 중첩클래스 
	public class ComThread extends Thread{
		//스레드 실행되는 부분
		@Override
		public void run() {
			//실행부분
		for(int i= 0; i<10; i++) {
			
			while(true) {
				System.out.println("count: "+i++);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		}
	}

}
	//정적 멤버 클래스 
	public static class ServerThread extends Thread{
		@Override
		public void run() {
			for(int i = 0;i<5;i++) {
				System.out.println("서버와 통신 중 : "+ i);
				Thread.sleep(500);
			}
		}
	}
