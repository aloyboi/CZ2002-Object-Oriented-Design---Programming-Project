package groupassignment;

import java.io.Serializable;
import java.util.*;

public class User implements Serializable {
	
	private String name;
	private String username;
	private double password;
	private char gender;
	private String nationality;
	private String email;

	public User() {
		this.name="";
		this.username="";
		this.password=0;
		this.gender='a';
		this.nationality="";
		this.email="";
		
	}
	
	public User(String name, String username, double password, char gender, String nationality, String email) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.nationality = nationality;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public double getPassword() {
		return password;
	}

	public void setPassword(double password) {
		this.password = password;
	}


	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}