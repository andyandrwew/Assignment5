package isPalindrome;

import java.util.*;;

public class IsPalidrome
{
	Queue<String> theQ = new LinkedList<>();
	
	public IsPalidrome(Queue<String> theQ)
	{
		this.theQ = theQ;
		this.toLowerCase();
		System.out.println(this.listOfPalidrone());
	}
	
	private void toLowerCase()
	{
		Queue<String> lowerQ = new LinkedList<String>();
		
		for(Iterator<String> it = theQ.iterator(); it.hasNext();)
		{
			lowerQ.add(it.next().toLowerCase());
		}
		
		theQ = lowerQ;
	}
	
	private List<Boolean> listOfPalidrone()
	{
		List<Boolean> list = new ArrayList<Boolean>();
		
		for(Iterator<String> it = theQ.iterator(); it.hasNext();)
		{
			String next = it.next();
			if(new StringBuilder().append(next.toLowerCase()).reverse().toString().equals(next.toLowerCase()))
			{
				list.add(true);
			}
			else
			{
				list.add(false);
			}
		}
		
	
		return list;
	}
}

class Tester
{
	public static void main(String[] args)
	{
		Queue theQ = new LinkedList<String>();
		
		theQ.add("aaaaa");
		theQ.add("aaabb");
		theQ.add("aabaa");
		theQ.add("bbaaa");
		theQ.add("bbabb");
		
		IsPalidrome palidrome = new IsPalidrome(theQ);
		
	}
}