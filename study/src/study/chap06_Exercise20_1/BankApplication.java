package study.chap06_Exercise20_1;

public class BankApplication {
		private static final int MAX_ACCOUNT = 100; //�ִ� ���¼�
		//���������� �����ϴ� �ʵ� : �迭
		//1. ���� �ʵ�� �����ϴ� ���
		static Account accountArray[];
		static int count =0;
		static BankApplication ba;
		//Ű����κ��� �����͸� �Է¹ޱ� ���Ͽ�
		static Scanner scanner = new Scanner(System.in);
		
		//2. �ν��Ͻ� �ʵ带 ����ϴ� ���
		Account accountArray2[];
		int count2 =0;
		String jigum;
		
		public static void main(String[] args){
			accountArray= new Account [MAX_ACCOUNT];
			boolean run = true;
			while(run) {		//�޴��� �Է¹޾Ƽ� ó���ϴ� �κ�
				System.out.println("----------------------------------------------------------");
				System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
				System.out.println("----------------------------------------------------------");
				System.out.print("����> ");
				
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
			System.out.println("���α׷� ����");
				
			}
		public	static void createAccount() {	/
			
		}

	}

}
