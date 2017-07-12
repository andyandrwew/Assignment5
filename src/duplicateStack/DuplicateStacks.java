package duplicateStack;

import java.util.Iterator;
import java.util.Stack;

public class DuplicateStacks
{
	public static Stack<Object> duplicate(Stack<Object> s)
	{
		Stack<Object> returnStack = new Stack<>();
		Iterator<Object> it = s.iterator();
		
		returnStack.addAll(s);
		
		return returnStack;
	}
}

class Tester
{
	public static void main(String[] args)
	{
		Stack<Object> s = new Stack<>();
		
		s.push(1);
		s.push(2.5);
		s.push("bananas");
		s.push(456786545);
		s.push('c');
		
		System.out.println(DuplicateStacks.duplicate(s) + "\n\n" + s);

	}
}
