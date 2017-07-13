package sameArithmeticPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SameAritheticPattern
{
	static String expression1;
	String expression2;
	
	
	public static boolean getPattern(String expression1, String expression2)
	{
		String betweenBrackets = "";
		String outsideOfBrackets = "";
		
		String thePattern = "";
		String thePattern1 = "";
		
		if (expression1.contains("(") && expression1.contains(")"))
		{
			for(int i = expression1.indexOf('('); i <= expression1.indexOf(')'); i++)
			{
				betweenBrackets += expression1.charAt(i);
			}
			
			outsideOfBrackets = expression1.replace(betweenBrackets, "#");
			outsideOfBrackets.trim();

			for (int j = 0; j < outsideOfBrackets.length(); j++)
			{
				switch(outsideOfBrackets.charAt(j))
				{
					case '+':
						thePattern += outsideOfBrackets.charAt(j);
						break;
					
					case '-':
						thePattern += outsideOfBrackets.charAt(j);
						break;
						
					case '/':
						thePattern += outsideOfBrackets.charAt(j);
						break;
						
					case '*':
						thePattern += outsideOfBrackets.charAt(j);
						break;
				}
			}
			
			//System.out.println(thePattern);
		}
		
		else
		{
			for (int j = 0; j < expression1.length(); j++)
			{
				switch(outsideOfBrackets.charAt(j))
				{
					case '+':
						thePattern += outsideOfBrackets.charAt(j);
						break;
					
					case '-':
						thePattern += outsideOfBrackets.charAt(j);
						break;
						
					case '/':
						thePattern += outsideOfBrackets.charAt(j);
						break;
						
					case '*':
						thePattern += outsideOfBrackets.charAt(j);
						break;
				}
			}
		}
		
		if (expression2.contains("(") && expression2.contains(")"))
		{
			for(int i = expression2.indexOf('('); i <= expression2.indexOf(')'); i++)
			{
				betweenBrackets += expression2.charAt(i);
			}
			
			outsideOfBrackets = expression2.replace(betweenBrackets, "#");
			outsideOfBrackets.trim();

			for (int j = 0; j < outsideOfBrackets.length(); j++)
			{
				switch(outsideOfBrackets.charAt(j))
				{
					case '+':
						thePattern1 += outsideOfBrackets.charAt(j);
						break;
					
					case '-':
						thePattern1 += outsideOfBrackets.charAt(j);
						break;
						
					case '/':
						thePattern1 += outsideOfBrackets.charAt(j);
						break;
						
					case '*':
						thePattern1 += outsideOfBrackets.charAt(j);
						break;
				}
			}
			
			//System.out.println(thePattern);
		}
		
		else
		{
			for (int j = 0; j < expression2.length(); j++)
			{
				switch(outsideOfBrackets.charAt(j))
				{
					case '+':
						thePattern1 += outsideOfBrackets.charAt(j);
						break;
					
					case '-':
						thePattern1 += outsideOfBrackets.charAt(j);
						break;
						
					case '/':
						thePattern1 += outsideOfBrackets.charAt(j);
						break;
						
					case '*':
						thePattern1 += outsideOfBrackets.charAt(j);
						break;
				}
			}
		}
		
		if (thePattern.equals(thePattern1))
		{
			return true;
		}
		
		return false;
	}
	
}

class Tester
{
	public static void main(String[] args)
	{
		String expression1 = "25 + (3 – 6) * 8";
		String expression2 = "7 + 8 * 2";
		String expression3 = "5 + {(13 + 7) / 8 - 2 * 9";
		
		System.out.println(SameAritheticPattern.getPattern(expression1, expression2));
		System.out.println(SameAritheticPattern.getPattern(expression1, expression3));
	}
}
