import java.util.*;

import entities.*;
import service.*;
public class Main
{
	public static void main(String args[])
	{
		while(true)
		{
			SchoolService schoolService = new SchoolService();
			CourseService courseService = new CourseService();
			HouseService houseService = new HouseService();
			ProfessorService professorService = new ProfessorService();
			StudentService studentService = new StudentService();
			PersonService personService = new PersonService();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome to the Harry Potter online wizard\n\n");
			System.out.println("Here is the main menu and you can choose the operation you want\n");
			System.out.println("Choose whatever you want with an integer!!");
			System.out.println("1. School Menu \n2. Course Menu \n3. House Menu \n4. Professor Menu \n5. Student Menu \n6. Person Menu");
			int choise = scanner.nextInt();
			switch(choise)
			{
			case 1:
			schoolService.schoolMenu();
				break;
				
			case 2:
				courseService.courseMenu();
				break;
				
			case 3:
				houseService.houseMenu();
				break;
				
			case 4:
				professorService.professorMenu();
				break;
				
			case 5:
				studentService.studentMenu();
				break;
			case 6:
				personService.personMenu();
				break;
			default:
				System.out.println("You have entered a wrong number!!");
			}
		}
	}
}
