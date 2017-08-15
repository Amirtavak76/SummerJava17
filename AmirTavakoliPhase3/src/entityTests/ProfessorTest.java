package entityTests;

import entities.House;
import entities.Professor;
import entities.School;

public class ProfessorTest 
{
	//Constructor Test;
	
	public boolean constructorTest()
	{
		Professor Test = new Professor("Pourvatan");
		String temp = new String("Pourvatan" + null  + null + null + null + null + null);
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
			Professor getterTest = new Professor("Beheshti");
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
