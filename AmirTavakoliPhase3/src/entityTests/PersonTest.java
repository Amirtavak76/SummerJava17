package entityTests;

import entities.Person;

public class PersonTest
{
	
	//Constructor Test
	
	public boolean constructorTest()
	{
		Person consTest1 = new Person("AmirTavakoli");
		String temp = new String("Name:" + "AmirTavakoli" + "\n" + "House: " + null + "\n" + "BloodStatus: " + null + "\n" + "School: " + null + "\n" + "BirthDay: " + null);
		
		if(temp.equals(consTest1.toString()))
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
		Person getterTest = new Person("Amir");
		String expected = "Amir";
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