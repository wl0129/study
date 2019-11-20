package study.chap06_Exercise20_1;

public class BankApplication {
		private static final int MAX_ACCOUNT = 100; //최대 계좌수
		//계좌정보를 저장하는 필드 : 배열
		//1. 정적 필드로 선언하는 방법
		static Account accountArray[];
		static int count =0;
		static BankApplication ba;
		//키보드로부터 데이터를 입력받기 위하여
		static Scanner scanner = new Scanner(System.in);
		
		//2. 인스턴스 필드를 사용하는 방법
		Account accountArray2[];
		int count2 =0;
		String jigum;
		
		public static void main(String[] args){
			accountArray= new Account [MAX_ACCOUNT];
			boolean run = true;
			while(run) {		//메뉴를 입력받아서 처리하는 부분
				System.out.println("----------------------------------------------------------");
				System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
				System.out.println("----------------------------------------------------------");
				System.out.print("선택> ");
				
				int selectNo = scanner.nextInt();
				
				if(selectNo == 1) {
					createAccount();
				} else if(selectNo == 2) {
					accountList();
				} else if(selectNo == 3) {
					deposit();
				} else if(selectNo == 4) {
					withdraw();
				} else if(selectNo == 5) {
					run = false;
				} else if(selctNo == 6) {
					retrieveAccount();	
				}
			System.out.println("프로그램 종료");
				
			}
		public	static void createAccount() {	/
			
		}

	}

}
