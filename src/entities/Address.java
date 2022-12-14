package entities;

public class Address {
	
	private String email;
	private int phone;
	
	public Address() {		
		
	}

	public Address(String email, int phone) {		
		this.email = email;
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
}
