package groupassignment;

import java.util.*;


public class StudentAuthentication extends AllTXT {
	public static final String SEPARATOR = "-";
  
    public static Student Authentication() throws Exception
    {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter username:");
    	String username=sc.next();
    	for(int i=0;i<studentlist.size();i++)
    	{
    		if(username.equalsIgnoreCase(studentlist.get(i).getUsername()))
    		{
    			
    			System.out.println("Enter password:");
    			String pass=sc.next();
    			Generate g = new Generate();
    			double passVal=g.hashing(pass);
    			if(passVal==studentlist.get(i).getPassword())
    			{
    				return studentlist.get(i);
    			}
    		}
    	}
    	System.out.println("Incorrect username or password");
    	return null;
    }
    public static boolean checkValidAccessPeriod(Student s) throws Exception {
        Calendar dateTime = Calendar.getInstance();
        Calendar accessStart = CalendarMgr.strDateTime(s.getAccessStart());
        Calendar accessEnd = CalendarMgr.strDateTime(s.getAccessEnd());
        if (accessStart.equals(dateTime) || accessStart.before(dateTime)&& accessEnd.after(dateTime))
        	return true;
        else {
        	System.out.println("You are not allowed to access MySTARS. Please check your allocated Access Period");
        	return false;
        }
    }
}