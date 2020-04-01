package exam;


public class Exam 
{
	public static String getGreeting(String name)
	{
		return ("Hello " + name);
	}
	public static String getGoodBye(String name)
	{
		return ("Goodbye " + name);
	}

	public static String getNameLength(String name)
	{ 
		return("Name Length = " + String.valueOf(name.length()));
	}
	
	public static String getNameLast(String name)
	{
		String tmp = "Name Length = " + String.valueOf(name.length());
		return(tmp.substring(tmp.length()-1));
	}

	public static void main(String [] args)
	{
		System.out.println(getGreeting("Jeff"));
		System.out.println(getNameLength("Jeff"));
	}
}
