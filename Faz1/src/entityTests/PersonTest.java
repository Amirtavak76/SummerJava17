package entityTests;
import entities.Person;

public class PersonTest 
{
	public boolean PersonTest()
	{
		Person Test = new Person("a");
		
		String temp = new String();
		//_personName + '\n' + _personHouseName + '\n' + _personSchool + '\n' +_personBloodStatus + '\n' ;
		temp = "a" + '\n' + "" + '\n' + "" + '\n' + "" + '\n';
		if(temp.equals(Test.toString()))
		{
			return true;
		}
		return false;
	}
}