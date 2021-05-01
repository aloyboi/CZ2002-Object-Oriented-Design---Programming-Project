package groupassignment;

import java.util.ArrayList;

public class RegisteredCourses {

	private String matricID;
	private String courseCode;
	private String index;
	private String status;
	
	
	public RegisteredCourses(String matric, String courseCode, String index, String status) {
		this.matricID = matric;
		this.courseCode = courseCode;
		this.index = index;
		this.status = status;
	}
	
	public String getMatricID() {
		return matricID;
	}

	public void setMatricID(String matric) {
		this.matricID = matric ;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getIndexNumber() {
		return index;
	}

	public void setIndexNumber(String index)
	{
		this.index = index;
	}
	
	public String getRegisterStatus() {
		return status;
	}
	
	public void setRegisterStatus(String status) {
		this.status = status;
	}

	
}