package groupassignment;

import java.io.*;
import java.text.*;
import java.util.*;

public class Index{
	
	private String indexNum;
	private String courseCode;
	private String tutGroup;
	private int vacancy;
	private int waitingList;
	private ArrayList<String> waitingqueue;
	
	public Index() {
		this.indexNum = "";
		this.courseCode = "";
		this.tutGroup = "";
		this.vacancy = 0;
		this.waitingList = 0;
		this.waitingqueue = waitingqueue; 
	}
	
	
	
	public Index (String courseCode, String indexNum2, String tutGroup, int vacancy, int waitingList, ArrayList<String> waitingqueue){
		this.courseCode = courseCode;
		this.indexNum = indexNum2;
		this.tutGroup = tutGroup;
		this.vacancy = vacancy;
		this.waitingList = waitingList;
		this.waitingqueue = waitingqueue;
		
	}

	public String getcourseCode1()
	{
		return courseCode;
	}
	public void setcourseCode1(String courseCode)
	{
		this.courseCode = courseCode;
	}

	public String getindexNum()
	{
		return indexNum;
	}
	public void setindexNum(String indexNum)
	{
		this.indexNum = indexNum;
	}

	public String gettutGroup()
	{
		return tutGroup;
	}
	public void settutGroup(String tutGroup)
	{
		this.tutGroup = tutGroup;
	}

	public int getVacancy()
	{
		return vacancy;
	}
	public void setVacancy(int vacancy)
	{
		this.vacancy = vacancy;
	}

	public int getWaitingList()
	{
		return waitingList;
	}
	public void setWaitingList(int waitingList)
	{
		this.waitingList = waitingList;
	}

	public ArrayList<String> getWaitingQueue()
	{
		return waitingqueue;
	}
	public void setWaitingQueue(ArrayList<String> waitingqueue)
	{
		this.waitingqueue = waitingqueue;
	}

}