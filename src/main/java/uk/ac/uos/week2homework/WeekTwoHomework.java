package uk.ac.uos.week2homework;

public class WeekTwoHomework {
	
	 public static void main(String[] str) {
	
	 }
	 
	public String camelCase(String str)
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
		String letterFormat = foreName + " " + middleName.charAt(0) + " " + surName;
			
		WeekTwoHomework converter = new WeekTwoHomework();
			
		String str = converter.camelCase(letterFormat);
		return str;
	}
}