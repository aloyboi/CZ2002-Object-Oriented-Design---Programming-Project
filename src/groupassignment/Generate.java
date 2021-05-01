package groupassignment;
import java.util.*;
import java.text.SimpleDateFormat;
public class Generate {

	public String generateUsername(String email)
	{
		
		String username="";
		String newEmail="";
		int k=0;
		while(k<email.length() && email.charAt(k)!='@')   // if the user enters email id as xxxxxx@gmail.com , we dont want the @gmail.com while generating username
		{
			newEmail+=email.charAt(k);
			k+=1;
		}
		int length=newEmail.length();
		int max=length;
		int min=length/2;
		
		// Step 1
		// Generate random number between length/2 to length
		int num=(int)(Math.random()*(max-min+1)+min);
		
		for(int i=0;i<num;i++)
		{
			username+=email.charAt(i);
		}
		for(int j=0;j<3;j++)
		{
			int n=(int)(Math.random()*(3-1+1)+1);
			username+=n;
		}
		username=username.toUpperCase();
		System.out.println("Username:"+username);
		return username;
	}
	private double hashval=0.0;
	public double hashing(String pwd)
	{   
		int length=pwd.length();
        for(int i=0;i<length;i++)
        {
		 char var=pwd.charAt(i);
		 hashval+=(int)var*(Math.pow(2, i));  
	}
        //System.out.println("Hash:"+hashval);
        return hashval; 
	}
	
	public double CreatePass()
	{
		String pass="";
		//To generate random values within a range use the formula Math.random()*(max-min+1)+min => values with the min inclusive and max exclusive
		// we want to generate passwords within the range of 8 and 12 characters
		// Since max is not inclusive in the range, i have used 33 so we can have the range between 8 and 32
		int length=(int)(Math.random()*(13-8+1)+8);
		System.out.println("Length="+length);
		for(int i=0;i<length;i++)
		{
			int cnum=(int)(Math.random()*(123-48+1)+48);// ive limited the characters to the characters with the ascii value between 32 and 122
			// we are essentially generating each character now
			char ch=(char)cnum;
			pass+=ch;
			//System.out.println(ch);
		}
		System.out.println("Password:"+pass);
		hashval=hashing(pass);
		return hashval;
	}
}

