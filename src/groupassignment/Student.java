package groupassignment;

import java.text.ParseException;
import java.util.*;

public class Student {
	
	private String name;
	private String username;
	private double password;
	private char gender;
	private String nationality;
	private String email;
	private String matricID; //matric no.
	private Calendar accessStart;
	private Calendar accessEnd;
	
	public Student() {
	}
	
	public Student(String name, String username, double password, char gender, String nationality,String email, String matricID, Calendar accessStart, Calendar accessEnd) 
	{
		this.matricID = matricID; 
		this.username = username;
		this.name = name;
		this.gender = gender;
		this.nationality=nationality;
		this.email = email;
		this.password = password;
		this.accessStart = accessStart;
		this.accessEnd = accessEnd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMatricNumber() {
		return matricID;
	}

	public void setMatricNumber(String matricID) {
		this.matricID = matricID;
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
	
	public double getPassword() {
		return password;
	}
	
	public void setPassword(double password) {
		this.password = password;
	}
	
	public String getAccessStart() {
		return CalendarMgr.dateTimeStr(accessStart);
	}
	
	public Calendar getAccessStartCal() {
		return accessStart;
	}
	
	public void setAccessStart(Calendar accessStart) {
		this.accessStart = accessStart;
	}
	
	public String getAccessEnd() {
		return CalendarMgr.dateTimeStr(accessEnd);
	}
	
	public Calendar getAccessEndCal() {
		return accessEnd;
	}
	
	public void setAccessEnd(Calendar accessEnd) {
		this.accessEnd = accessEnd;
	}
}
