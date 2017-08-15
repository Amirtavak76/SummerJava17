import entityTests.*;

public class Main
{
	public static void main(String args[])
	{
		
		//Test of Constructor of Person 
		
		
		PersonTest testPerson = new PersonTest();
		
		if(testPerson.constructorTest())
		{
			System.out.println("The constructor of Person class is Okay");
		}
		else
		{
			System.out.println("Wrong");
		}
		
		//Test of Getter of Person
		
		if(testPerson.getterTest())
		{
			System.out.println("The getter of Person is okay");
		}
		else
		{
			System.out.println("Wrong");
		}
		
		
		//Test of Constructor of School
		
		SchoolTest testSchool = new SchoolTest();
		if(testSchool.constructorTest())
		{
			System.out.println("The constructor of School class is Okay");
		}
		else
		{
			System.out.println("Wrong");
		}
		
		//Test of Getter of School
		
		if(testSchool.getterTest())
		{
			System.out.println("The getter of School is okay");
		}
		else
		{
			System.out.println("Wrong");
		}
		
		
		//Test of Constructor of Course
		
		CourseTest testCourse = new CourseTest();
		if(testCourse.constructorTest())
		{
			System.out.println("The constructor of Course class is Okay");
		}
		else
		{
			System.out.println("Wrong");
		}
		
		//Test of Getter of Course
		
		if(testCourse.getterTest())
		{
			System.out.println("The getter of Course is okay");
		}
		else
		{
			System.out.println("Wrong");
		}
			
			
		//Test of Constructor of House
		
		HouseTest testHouse = new HouseTest();
		if(testHouse.constructorTest())
		{
			System.out.println("The constructor of House class is Okay");
		}
		else
		{
			System.out.println("Wrong");
		}
		
		//Test of Getter of House
		
		if(testHouse.getterTest())
		{
			System.out.println("The getter of House is okay");
		}
		else
		{
			System.out.println("Wrong");
		}
		
		//Test of Constructor of Professor
		
		ProfessorTest testProfessor = new ProfessorTest();
		if(testProfessor.constructorTest())
		{
			System.out.println("The constructor of Professor class is Okay");
		}
		else
		{
			System.out.println("Wrong");
		}
			
		//Test of Getter of Professor
		
		if(testCourse.getterTest())
		{
			System.out.println("The getter of Professor is okay");
		}
		else
		{
			System.out.println("Wrong");
	}
	}
}
