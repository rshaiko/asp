package model;

public class User {

	public String firstName;
	public String lastName;
	public int ID;
	public String username;
	public String password;
	public String email;
	public String city;
	
	public String getFullName() {
		String fullName = this.firstName+" "+ this.lastName;
		return fullName;
	}
	
	
}
