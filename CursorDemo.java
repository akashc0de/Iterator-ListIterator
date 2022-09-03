package colllectionLearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CursorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("akash");
		a.add("java");
		a.add("developer");
		a.add(5);
		Laptop aa= new Laptop("dell",123,345,true);
		a.add(aa);
		//a.add(a);
		
		Iterator i=a.iterator();
		
		while(i.hasNext()) {
			if(i.next().equals(5)) {
				//i.remove();
			}
		}
		System.out.println("After remove "+ a);
		
		
		
		ListIterator li= a.listIterator();
		
		// Bidire tional cursor
		  // can move forward and backwords
		
		while(li.hasNext()) {
			if(li.next().equals(5)) {
				li.set(100);
			}
		}
		
		System.out.println(a);
		
		
		
		
	}

}
