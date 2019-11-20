package study.chap06_Exercise20_1;

public class Account {
	private String ano;  	//�ٸ� Ŭ�������� ������ ������� �ʰ� : private ���
	private String owner;	// ��������, �ʵ������ ���� ����
	private int balance;
	
	//������ 
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//Getter and Setter : �ʵ尡 private�̹Ƿ� ���� ������ ��ư� , Getter and Setter�� ����ؼ�  �����ϵ��� ����� �����Ѵ�. 
	//��������.getAno()
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}
	//BankApplication���� �Ա�(�Աݾ�),��� (��ݾ�)
	public void setBalance(int balance) { 	//���� ���� ������� �ʵ��� ���� 
		this.balance = balance;
	}
	//�ʿ信 ���� �����Ѵ�. 
	public void addBalance(int deposit) {	//�Աݾ�
		balance += deposit; //���� ���� �����ڸ� ����Ͽ� ����
	}
	
	public int subtractBalance(int withdraw) {	//��ݾ�
		if(balance > withdraw) {
			balance -= withdraw;
			return 0;				//����� �����ϸ� 0�� ��ȯ
		}
		else{ 						//�ܰ��� �� ���� ����� �Ϸ��� �Ѵ�.
			return -1; 				//�ܰ� ����
		}
	}
}
