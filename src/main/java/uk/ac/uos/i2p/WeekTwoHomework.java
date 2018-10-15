package uk.ac.uos.i2p;

public class WeekTwoHomework {
	
	 public static void main(String[] args) {
		 
	 }

	String camelCase(String str)
	{
		StringBuilder builder = new StringBuilder(str);
		boolean isLastSpace = true;
		
		for(int i = 0; i < builder.length(); i++)
		{
			char ch = builder.charAt(i);
			
			if(isLastSpace && ch >= 'a' && ch <='z')
			{
				builder.setCharAt(i, (char)(ch + ('A' - 'a') ));
				isLastSpace = false;
			}
			else if (ch != ' ')
				isLastSpace = false;
			else
				isLastSpace = true;
		}
	
		return builder.toString();
	}
		
	public String fullName(String foreName, String middleName, String surName) {
		String letterFormat = foreName + " " + middleName + " " + surName;
			
		WeekTwoHomework converter = new WeekTwoHomework();
			
		String str = converter.camelCase(letterFormat);
		return str;
	}
}