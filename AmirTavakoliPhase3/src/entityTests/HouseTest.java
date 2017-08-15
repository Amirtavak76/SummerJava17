package entityTests;

import entities.Course;
import entities.House;

public class HouseTest
{
	//Constructor Test;
	
		public boolean constructorTest()
		{
			House Test = new House("Department");
			String temp = new String("Department" + null  + null + null + null + null);
			if (temp.equals(Test.toString()))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		//Getter Test:
		
			public boolean getterTest()
			{
				House getterTest = new House("Department");
				String expected = "Department";
				String actual = getterTest.getName();
				if (actual.equals(expected))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
}
