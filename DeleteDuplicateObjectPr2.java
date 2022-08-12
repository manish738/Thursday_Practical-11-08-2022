/*2. Program to delete duplicate object*/

import java.util.ArrayList;
import java.util.List;


public class DeleteDuplicateObjectPr2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			List<String> month = new ArrayList<>();
			month.add("JAN");
			month.add("FEB");
			month.add("MAR");
			System.out.println(month);
			month.add(3,"JAN");
			
			System.out.println("The list conting duplicate elements = "+month);
			List<String> month2 = new ArrayList<>();

			for (String show:month)
			{
				if(!month2.contains(show))
				{
					month2.add(show);
				}
			}
			System.out.println("The list  elements after remove duplicates elements = "+month2);
	}
}