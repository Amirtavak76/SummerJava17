package entityTests;

import entities.Professor;
import entities.Students;

public class StudentsTest
{
	//Constructor Test;
	
	public boolean constructorTest()
	{
		Students Test = new Students(null, null, null, null, null, null, null);
		String temp = new String();
		temp +=  null;
		if (temp.equals(Test.toString()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
