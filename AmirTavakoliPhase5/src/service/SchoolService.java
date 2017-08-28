package service;
import java.io.*;
import java.util.*;

import entities.*;
public class SchoolService 
{
	private String _school;
	private Vector<String> _allSchools;
	
	//School Service Menu
	
	public void schoolMenu()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the school menu\n");
		System.out.println("What do you wanna do?"
				+ "  Choose it with an integer.\n");
		System.out.println("1. Create a new school \n"
				+ "2. Search school via name \n"
				+ "3. Show school by name \n"
				+ "4. Show all schools \n"
				+ "5. Edit school information \n"
				+ "6. Delete a school"
				+ "7. Search school by name \n");
		int choise = scanner.nextInt();
		switch(choise)
		{
		case 1:
			setData();
			break;
		
		case 2:
			searchSchoolByName(null);
			break;
			
		case 3:
			showSchoolByName(null);
			break;
			
		case 4:
			getData(null);
			break;
			
		case 5:
			System.out.println("Not available");
			break;
		default:
			System.out.println("You have entered a wrong number!!");
		}
	}

	// Get data from file
	
	public void getData(String data)
	{
		Vector<String> list = new Vector<String>();
		try
		{
			  File file = new File("SchoolDB.txt");
			  if (file.exists())
			  {
				  System.out.println("***    Reading file...    ***\n\n");
				  BufferedReader input = new BufferedReader(new FileReader(file));
				  String line;
				  while ((line = input.readLine()) != null)
				  {
					  list.add(line);
				  }
				  int i = 0;
				  while (i != list.size())
				  {
					  System.out.print("The School Name is: ");
					  System.out.println(list.elementAt(i));
					  _school = list.elementAt(i);
					  i++;
					  System.out.print("The number of the houses that the school has: ");
					  System.out.println(list.elementAt(i));
					  _school = list.elementAt(i);
					  int house = Integer.parseInt(list.elementAt(i));
					  System.out.print("The house names are: ");
					  for(int j = i + 1; j <= i + house; j++)
					  {
						  System.out.print(list.elementAt(j) + ", ");
						  _school = list.elementAt(i);
					  }
					  i += house + 1;
					  System.out.print("\nThe number of the students that the school has: ");
					  System.out.println(list.elementAt(i));
					  _school = list.elementAt(i);
					  int student = Integer.parseInt(list.elementAt(i));
					  System.out.print("The student names are: ");
					  for(int j = i + 1; j <= i + student; j++)
					  {
						  System.out.print(list.elementAt(j) + ", ");
						  _school = list.elementAt(i);
					  }
					  i += student + 1;
					  System.out.print("\nThe number of the professors that the school has: ");
					  System.out.println(list.elementAt(i));
					  _school = list.elementAt(i);
					  int professor = Integer.parseInt(list.elementAt(i));
					  System.out.print("The professor names are: ");
					  for(int j = i + 1; j <= i + professor; j++)
					  {
						  System.out.print(list.elementAt(j) + ", ");
						  _school = list.elementAt(i);
					  }
					  i += professor + 1;
					  System.out.print("\nThe number of the courses that the school has: ");
					  System.out.println(list.elementAt(i));
					  _school = list.elementAt(i);
					  int course = Integer.parseInt(list.elementAt(i));
					  System.out.print("The course names are: ");
					  for(int j = i + 1; j <= i + course; j++)
					  {
						  System.out.print(list.elementAt(j) + ", ");
						  _school = list.elementAt(i);
					  }
					  i += course + 1;
					  System.out.print("\nThe location of the school is: ");
					  System.out.println(list.elementAt(i));
					  _school = list.elementAt(i);
					  System.out.print("\n\n*****\n\n");
					  i += 2;
				  }
			  }
			  else
			  {
				  System.out.println(file.getAbsolutePath() + " not exist");
			  }
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	// Set Data to the file 
	
	public void setData()
	{
		Scanner scanner = new Scanner (System.in);
		String schoolName, houseName, studentsName, professorsName, coursesName, location;
		String numOfHouse, numOfStudent, numOfProfessor, numOfCourse;
		char choise;
		try
		{
			File file = new File("SchoolDB.txt");
			if(!file.exists())
			{
				file.createNewFile();
				System.out.println("Creating new file...\n");
			}
			else
			{
				System.out.println("Updating file...\n");
			}
			FileWriter output = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(output);
			while(true)
			{
				System.out.println("Do you wanna add a new School to the system?\n");
				System.out.println("1. Press 'Y' if you want!\n2. Press 'N' if you dont!\n");
				choise = scanner.next().charAt(0);
				if(choise == 'y')
				{
					System.out.print("Complete the information of the new School.\n");
					System.out.print("Name: ");
					schoolName = scanner.next();
					bw.write(schoolName);
					bw.newLine();
					System.out.print("Number of Houses: ");
					numOfHouse = scanner.next();
					bw.write(numOfHouse);
					int numOfHouses = Integer.parseInt(numOfHouse);
					bw.newLine();
					for (int i = 0; i < numOfHouses; i++)
					{
						System.out.print("House Name: ");
						houseName = scanner.next();
						bw.write(houseName );
						bw.newLine();
					}
					System.out.print("Number of Students: ");
					numOfStudent = scanner.next();
					bw.write(numOfStudent);
					bw.newLine();
					int numOfStudents = Integer.parseInt(numOfStudent);
					for (int i = 0; i < numOfStudents; i++)
					{
						System.out.print("Students Name: ");
						studentsName = scanner.next();
						bw.write(studentsName);
						bw.newLine();
					}
					System.out.print("Number of Professors: ");
					numOfProfessor = scanner.next();
					bw.write(numOfProfessor);
					bw.newLine();
					int numOfProfessors = Integer.parseInt(numOfProfessor);
					for (int i = 0; i < numOfProfessors; i++)
					{
						System.out.print("Professor Names: ");
						professorsName = scanner.next();
						bw.write(professorsName);
						bw.newLine();
					}
					System.out.print("Number of Courses: ");
					numOfCourse = scanner.next();
					bw.write(numOfCourse);
					bw.newLine();
					int numOfCourses = Integer.parseInt(numOfCourse);
					for (int i = 0; i < numOfCourses; i++)
					{
						System.out.print("Course Names: ");
						coursesName = scanner.next();
						bw.write(coursesName);
						bw.newLine();
					}
					System.out.print("Location: ");
					location = scanner.next();
					bw.write(location);
					bw.newLine();
					bw.write("*");
					bw.newLine();
					System.out.println("\n\n*****\n\nThe school saved successfuly!\n\n");
					break;
				}
				else if (choise == 'n')
				{
					break;
				}
				else
				{
					System.out.println("Please input a variable choise!!");
				}
			}
			bw.close();
			System.out.println("Finish writing to file!");
		}
		catch(IOException e)
		{
		    System.out.println("COULD NOT LOG!!");
		}
	}

	// Search school by its name
	
	public void searchSchoolByName(String schoolName)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the school you want: ");
		Vector<String> list = new Vector<String>();
		int house = 0, student = 0, professor = 0, course = 0;
		schoolName = scanner.nextLine();
		try
		{
			  File file = new File("SchoolDB.txt");
			  if (file.exists())
			  {
				  System.out.println("***    Reading file...    ***\n\n");
				  BufferedReader input = new BufferedReader(new FileReader(file));
				  String line;
				  while ((line = input.readLine()) != null)
				  {
					  list.add(line);
				  }
			  }
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		boolean con = false;
		for(int i = 0; i < list.size(); i++)
		{
			if (list.elementAt(i).contains(schoolName))
			{
				int line = i;
				System.out.println("The school information you have searched is: ");
				System.out.println("Name: " + list.elementAt(line));
				System.out.println("Number of Houses: " + list.elementAt(i + 1));
				house = Integer.parseInt(list.elementAt(i + 1)); 
				System.out.print("House Names: ");
				for (int j = i + 2; j <= i + house + 1; j++)
				{
					System.out.print(list.elementAt(j) + ", ");
				}
				System.out.println("\nNumber of Students: " + list.elementAt(i + 2 + house));
				student = Integer.parseInt(list.elementAt(i + 2 + house));
				System.out.print("Student Namese: ");
				for (int j = i + 3 + house; j < i + house + student + 3; j++)
				{
					System.out.print(list.elementAt(j) + ", ");
				}
				System.out.println("\nNumber of Professors: " + list.elementAt(i + 3 + house + student));
				professor = Integer.parseInt(list.elementAt(i + 3 + house + student));
				System.out.print("professor Names: ");
				for (int j = i + 4 + house + student; j < i + house + student + professor + 4; j++)
				{
					System.out.print(list.elementAt(j) + ", ");
				}
				System.out.println("\nNumber of Courses: " + list.elementAt(i + 4 + house + student + professor));
				course = Integer.parseInt(list.elementAt(i + 4 + house + student + professor));
				System.out.print("Course Names: ");
				for (int j = i + 5 + house + student + professor; j < i + house + student + professor + course + 5; j++)
				{
					System.out.print(list.elementAt(j) + ", ");
				}
				System.out.println("\nLocation: " + list.elementAt(i + 5 + house + student + professor + course));
				System.out.println("\n\n*****\n");
			}
			else
			{
				System.out.println("There is no school with this name in the system!!\n\n*****\n");
				break;
			}
		}
	}
	
	// Sorting to House
	
	public House SortingHat(Student _name)
	{
		House house = null;
		System.out.println("Please enter your name:");
		Scanner scanner = new Scanner (System.in);
		String name = scanner.nextLine();
		System.out.println("Welcome to the enterance house test Mr." + name + "\n");
		System.out.println("Here there are some questions that you will answer them, according to your answers you will enter to the house that you have its qualities\n");
		System.out.println("Please answer the questions with number 1 to 4\n");
		System.out.println("1. Are you a brave Person? \n  1) Perfectly yes \n  2) Probably yes \n  3) Probably not \n  4) No I am not");
		Scanner choice = new Scanner(System.in);
		int b = choice.nextInt();
		int house1 = 0;
		if(b == 1)
		{
			house1 += 8;
		}
		if(b == 2)
		{
			house1 += 6;
		}
		if(b == 3)
		{
			house1 += 4;
		}
		if(b == 4)
		{
			house1 += 2;
		}
		else
		{
			System.out.println("You entered a wrong number!!");
		}
		System.out.println("2. What is your nerve rank?");
		System.out.println(" 1) Upper 75\n 2) 50 to 75\n 3)25 to 50\n 4) Lower 25\n");
		int c = choice.nextInt();
		if(c == 1)
		{
			house1 += 8;
		}
		if(c == 2)
		{
			house1 += 6;
		}
		if(c == 3)
		{
			house1 += 4;
		}
		if(c == 4)
		{
			house1 += 2;
		}
		else
		{
			System.out.println("You entered a wrong number!!");
		}
		
		System.out.println("3. Do you have chivarly in your behavior?1");
		System.out.println(" 1) Perfectly yes \n 2) Probably yes \n 3) Probably not \n 4) No I am not");
		int d = choice.nextInt();
		if(d == 1)
		{
			house1 += 8;
		}
		if(d == 2)
		{
			house1 += 6;
		}
		if(d == 3)
		{
			house1 += 4;
		}
		if(d == 4)
		{
			house1 += 2;
		}
		else
		{
			System.out.println("You entered a wrong number!!");
		}
		
		System.out.println("4. Are you an ambitious?\n");
		System.out.println(" 1) Perfectly yes \n 2) Probably yes \n 3) Probably not \n 4) No I am not");
		int house2 = 0;
		int e = choice.nextInt();
		if(e == 1)
		{
			house2 += 12;
		}
		if(e == 2)
		{
			house2 += 9;
		}
		if(e == 3)
		{
			house2 += 6;
		}
		if(e == 4)
		{
			house2 += 3;
		}
		else
		{
			System.out.println("You entered a wrong number!!");
		}
		
		System.out.println("5. Are you a resourceful person?\n");
		System.out.println(" 1) Perfectly yes \n 2) Probably yes \n 3) Probably not \n 4) No I am not");
		int f = choice.nextInt();
		if(f == 1)
		{
			house2 += 12;
		}
		if(f == 2)
		{
			house2 += 9;
		}
		if(f == 3)
		{
			house2 += 6;
		}
		if(f == 4)
		{
			house2 += 3;
		}
		else
		{
			System.out.println("You entered a wrong number!!");
		}
		
		System.out.println("6. What is the rank of your IQ\n");
		System.out.println(" 1) Upper 75\n 2) 50 to 75\n 3)25 to 50\n 4) Lower 25\n");
		int house3 = 0;
		int g = choice.nextInt();
		if(g == 1)
		{
			house3 += 12;
		}
		if(g == 2)
		{
			house3 += 9;
		}
		if(g == 3)
		{
			house3 += 6;
		}
		if(g == 4)
		{
			house3 += 3;
		}
		else
		{
			System.out.println("You entered a wrong number!!");
		}
		
		System.out.println("7. Are you a knowledgable person?\n");
		System.out.println(" 1) Perfectly yes \n 2) Probably yes \n 3) Probably not \n 4) No I am not");
		int h = choice.nextInt();
		if(h == 1)
		{
			house3 += 12;
		}
		if(h == 2)
		{
			house3 += 9;
		}
		if(h == 3)
		{
			house3 += 6;
		}
		if(h == 4)
		{
			house3 += 3;
		}
		else
		{
			System.out.println("You entered a wrong number!!");
		}
		
		System.out.println("8. Are you a hard work Person? \n");
		System.out.println(" 1) Perfectly yes \n 2) Probably yes \n 3) Probably not \n 4) No I am not");
		int house4 = 0;
		int i = choice.nextInt();
		if(i == 1)
		{
			house4 += 6;
		}
		if(i == 2)
		{
			house4 += 4;
		}
		if(i == 3)
		{
			house4 += 2;
		}
		if(i == 4)
		{
			house4 += 0;
		}
		else
		{
			System.out.println("You entered a wrong number!!");
		}
		
		System.out.println("9. Do you have dedication in your behavior? \n");	
		System.out.println(" 1) Perfectly yes \n 2) Probably yes \n 3) Probably not \n 4) No I am not");
		int j = choice.nextInt();
		if(j == 1)
		{
			house4 += 6;
		}
		if(j == 2)
		{
			house4 += 4;
		}
		if(j == 3)
		{
			house4 += 2;
		}
		if(j == 4)
		{
			house4 += 0;
		}
		else
		{
			System.out.println("You entered a wrong number!!");
		}
		
		System.out.println("10. Do you have patience in your behavior? \n");
		System.out.println(" 1) Perfectly yes \n 2) Probably yes \n 3) Probably not \n 4) No I am not");
		int k = choice.nextInt();
		if(k == 1)
		{
			house4 += 6;
		}
		if(k == 2)
		{
			house4 += 4;
		}
		if(k == 3)
		{
			house4 += 2;
		}
		if(k == 4)
		{
			house4 += 0;
		}
		else
		{
			System.out.println("You entered a wrong number!!");
		}
		
		System.out.println("11. Do you have loyality in your behavior? \n");
		System.out.println(" 1) Perfectly yes \n 2) Probably yes \n 3) Probably not \n 4) No I am not");
		int l = choice.nextInt();
		if(l == 1)
		{
			house4 += 6;
		}
		if(l == 2)
		{
			house4 += 4;
		}
		if(l == 3)
		{
			house4 += 2;
		}
		if(l == 4)
		{
			house4 += 0;
		}
		else
		{
			System.out.println("You entered a wrong number!!");
		}
		
		
		if(house1 > house2 && house1 > house3 && house1 > house4)
		{
			System.out.println("According to your qualities, the Griffindor house is the best one for you");
		}
		else if (house2 > house1 && house2 > house3 && house2 > house4)
		{
			System.out.println("According to your qualities, the Slytherin house is the best one for you");
		}
		else if (house3 > house2 && house3 > house1 && house3 > house4)
		{
			System.out.println("According to your qualities, the Revenclaw house is the best one for you");
		}
		else if(house4 > house2 && house4 > house3 && house4 > house1)
		{
			System.out.println("According to your qualities, the Hupplepuff house is the best one for you");
		}
		else
		{
			System.out.println("No house found! Try again");
		}
		return house;
	}
	
	// Edit school information
	
	public void deleteSchool(String schoolName)
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the school you want: ");
		Vector<String> list = new Vector<String>();
		int house = 0, student = 0, professor = 0, course = 0;
		schoolName = scanner.nextLine();
		try
		{
			  File file = new File("SchoolDB.txt");
			  if (file.exists())
			  {
				  System.out.println("***    Reading file...    ***\n\n");
				  BufferedReader input = new BufferedReader(new FileReader(file));
				  String line;
				  while ((line = input.readLine()) != null)
				  {
					  list.add(line);
				  }
			  }
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		for(int i = 0; i < list.size(); i++)
		{
			if (schoolName.equals(list.elementAt(i)))
			{
				
			}
		}
	}
	
	// Show School By name
	
	public void showSchoolByName(String schoolName)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the school you want: ");
		Vector<String> list = new Vector<String>();
		int house = 0, student = 0, professor = 0, course = 0;
		schoolName = scanner.nextLine();
		try
		{
			  File file = new File("SchoolDB.txt");
			  if (file.exists())
			  {
				  System.out.println("***    Reading file...    ***\n\n");
				  BufferedReader input = new BufferedReader(new FileReader(file));
				  String line;
				  while ((line = input.readLine()) != null)
				  {
					  list.add(line);
				  }
			  }
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		for(int i = 0; i < list.size(); i++)
		{
			if (schoolName.equals(list.elementAt(i)))
			{
				int line = i;
				System.out.println("The school information you have searched is: ");
				System.out.println("Name: " + list.elementAt(line));
				System.out.println("Number of Houses: " + list.elementAt(i + 1));
				house = Integer.parseInt(list.elementAt(i + 1)); 
				System.out.print("House Names: ");
				for (int j = i + 2; j <= i + house + 1; j++)
				{
					System.out.print(list.elementAt(j) + ", ");
				}
				System.out.println("\nNumber of Students: " + list.elementAt(i + 2 + house));
				student = Integer.parseInt(list.elementAt(i + 2 + house));
				System.out.print("Student Namese: ");
				for (int j = i + 3 + house; j < i + house + student + 3; j++)
				{
					System.out.print(list.elementAt(j) + ", ");
				}
				System.out.println("\nNumber of Professors: " + list.elementAt(i + 3 + house + student));
				professor = Integer.parseInt(list.elementAt(i + 3 + house + student));
				System.out.print("professor Names: ");
				for (int j = i + 4 + house + student; j < i + house + student + professor + 4; j++)
				{
					System.out.print(list.elementAt(j) + ", ");
				}
				System.out.println("\nNumber of Courses: " + list.elementAt(i + 4 + house + student + professor));
				course = Integer.parseInt(list.elementAt(i + 4 + house + student + professor));
				System.out.print("Course Names: ");
				for (int j = i + 5 + house + student + professor; j < i + house + student + professor + course + 5; j++)
				{
					System.out.print(list.elementAt(j) + ", ");
				}
				System.out.println("\nLocation: " + list.elementAt(i + 5 + house + student + professor + course));
				System.out.println("\n\n*****\n");
				break;
			}
			else
			{
				System.out.println("There is no school with this name in the system!!\n\n*****\n");
				break;
			}
		}
	}
}
