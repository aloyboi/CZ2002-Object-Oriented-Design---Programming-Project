package groupassignment;
import java.util.*;
public class Course{
    private String courseCode; //course code for each module
    private String courseName; //course name for each module
    private int AU; //AU for each module
    private String school; //school that offers the module
    private String courseType; //list of indexes for the course students can register for
    private Calendar examDate;

    public Course (String courseCode, String courseName, int AU, String school, String courseType, Calendar examDate){
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.AU=AU;
        this.school=school;
        this.examDate=examDate; 
        this.courseType=courseType;
    }

    public String getcourseCode1(){
        return courseCode;
    }

    public void setcourseCode1(String courseCode){
        this.courseCode=courseCode;
    }

    public String getcourseName1(){
        return courseName;
    }

    public void setcourseName1(String courseName){
        this.courseName=courseName;
    }

    public int getAU(){
        return AU;
    }

    public void setAU(int au){
        AU = au;
    }

    public String getschool1(){
        return school;
    }

    public void setschool1(String school){
        this.school=school;
    }

    public String getcourseType1() {
		return courseType;
	}
	
	public void setcourseType1(String courseType) {
		this.courseType = courseType;
	}
	
	public String getExamDate(){
		return CalendarMgr.dateTimeStr(examDate);
    }
	public Calendar getExamDateCal(){
		return examDate;
	}
	
	public void setExamDate(Calendar examDate){
		this.examDate = examDate;
    }
    
}

