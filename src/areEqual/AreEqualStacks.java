package areEqual;

import java.util.Iterator;
import java.util.Stack;

public class AreEqualStacks
{
	Stack<Object> stack = new Stack<>();

	public static boolean areEqual(Stack s, Stack s1)
	{
		Iterator it = s.iterator();
		Iterator it1 = s1.iterator();
		
		if (s.size() == s1.size())
		{
			while (it.hasNext() && it1.hasNext())
			{
				if (!it.next().equals(it1.next()))
				{
					return false;
				}
			} 
		}
		else
		{
			return false;
		}
		return true;
	}
}

class Tester
{
	public static void main(String[] args)
	{
		Stack<Object> s = new Stack<>();
		Stack<Object> s1 = new Stack<>();
		Stack<Object> s2 = new Stack<>();

		s.push(1);
		s.push(2);
		s.push(3);
		s.push("bannanas");
		s.push(2.05);
		s.push('c');

		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push("bannanas");
		s1.push(2.05);
		s1.push('c');

		System.out.println(AreEqualStacks.areEqual(s, s1));

		s2.push(1);
		s2.push(2);
		s2.push(3);
		s2.push("bannanas");
		s2.push(2.05);
		s2.push('a');

		System.out.println(AreEqualStacks.areEqual(s, s2));

	}
}