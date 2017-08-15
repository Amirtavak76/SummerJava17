package entityTests;

import entities.House;
import entities.School;

public class SchoolTest
{
	
	//Constructor Test;
	
	public boolean constructorTest()
	{
		School Test = new School("Beheshti");
		String temp = new String("Beheshti" + 0 + false + null + null + null + null + null);
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
		School getterTest = new School("Beheshti");
		String expected = "Beheshti";
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
