package groupassignment;

import java.util.Calendar;

public class Lesson{
	private String courseCode;
    private String indexNum;
    private String lessonDay;
    private Calendar lessonStartTime;
    private Calendar lessonEndTime;
    private String lessonType;
    private String lessonLoc;

    public Lesson (String courseCode, String indexNum, String lessonDay, Calendar lessonStartTime, Calendar lessonEndTime, String lessonType, String lessonLoc){
    	this.courseCode = courseCode;
    	this.indexNum = indexNum;
        this.lessonDay = lessonDay;
        this.lessonStartTime = lessonStartTime;
        this.lessonEndTime = lessonEndTime;
        this.lessonType = lessonType;
        this.lessonLoc = lessonLoc;
    }

    public String getcourseCode1()
	{
		return courseCode;
	}
	public void setcourseCode1(String courseCode)
	{
		this.courseCode = courseCode;
	}
    
    public String getIndexNum(){
        return indexNum;
    }

    public void setIndexNum(String indexNum){
        this.indexNum = indexNum;
    }

    public String getLessonDay(){
        return lessonDay;
    }

    public void setLessonDay(String lessonDay){
        this.lessonDay = lessonDay;
    }

    public Calendar getLessonStartTime(){
        return lessonStartTime;
    }
    public String getLessonStartTimeStr(){
        return CalendarMgr.timeStr(lessonStartTime);
    }

    public void setLessonStartTime(Calendar lessonStartTime){
        this.lessonStartTime = lessonStartTime;
    }
    
    public Calendar getLessonEndTime(){
        return lessonEndTime;
    }
    public String getLessonEndTimeStr(){
        return CalendarMgr.timeStr(lessonEndTime);
    }

    public void setLessonEndTime(Calendar lessonEndTime){
        this.lessonEndTime = lessonEndTime;
    }

    public String getLessonType(){
        return lessonType;
    }

    public void setLessonType(String lessonType){
        this.lessonType = lessonType;
    }

    public String getLessonLoc(){
        return lessonLoc;
    }

    public void setLessonLoc(String lessonLoc){
        this.lessonLoc = lessonLoc;
    }

}