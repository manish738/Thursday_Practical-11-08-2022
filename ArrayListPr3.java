/* 3.Program to add, retrieve & remove element from ArrayList */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListPr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> month = new ArrayList<String>();
			month.add("JAN");
			month.add("FEB");
			month.add("MAR");
			System.out.println(month);
			month.add(3,"APR");
			System.out.println(month);
			month.remove(3);
System.out.println("The element at 2nd index is: "+month.get(2));


Iterator it = month.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
		
			}
}}