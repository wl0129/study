package study.chap06igeter;

public class Member {
	private String id;
	private String name;
	private String pw;
	private String phone;
	private String email;
	private boolean gender;
	public boolean isGender() {
		return gender;
	}

	
}
	public void setGender(boolean gender) {
	this.gender = gender;
	}

	default 
	//»ý¼ºÀÚ
	public Member(String id, String name, String pw, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.phone = phone;
		this.email = email;

		
		
	//Getter, Setter
	
}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
