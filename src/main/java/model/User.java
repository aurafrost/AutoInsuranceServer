package model;

import java.util.List;

import javax.persistence.*;

@Entity
public class User {
	@Id
	private String email;
	@Column(name="type")
	private String type;
	@Column(name="policyNumber")
	private String policyNumber;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="address")
	private String address;
	@Column(name="phone")
	private String phone;
	private List<Claim> claims;
	public User() {
		
	}
	
	public User(String email, String type, String policyNumber, String firstName, String lastName, String address,
			String phone, List<Claim> claims) {
		super();
		this.email = email;
		this.type = type;
		this.policyNumber = policyNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.claims = claims;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Claim> getClaims() {
		return claims;
	}
	public void setClaims(List<Claim> claims) {
		this.claims = claims;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", type=" + type + ", policyNumber=" + policyNumber + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", address=" + address + ", phone=" + phone + ", claims=" + claims + "]";
	}
	
}
