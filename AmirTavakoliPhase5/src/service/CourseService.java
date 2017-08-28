package service;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import entities.*;


public class CourseService
{
	private String _course;
	
	// CourseService menu
	
	public void courseMenu()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the course menu\n");     
		System.out.println("What do you wanna do? Choose it with an integer.\n");
		System.out.println("1. Create a new course \n2. Search course via name \n3. Edit course information \n4. Show all courses \n5. Delete a course");
		int choise = scanner.nextInt();
		switch(choise)
		{
		case 1:
			setData();
			break;
		
		case 2:
			getCourseByName(null);
			break;
			
		case 3:
			System.out.println("Not available now");
			break;
			
		case 4:
			getData();
			break;
			
		case 5:
			System.out.println("Not available");
			break;
		default:
			System.out.println("You have entered a wrong number!!");
		}
	}
	
	// Set data to file
	
	public void setData()
	{
		Scanner scanner = new Scanner (System.in);
		String name, minGrade, professor, year, studentName;
		int numOfStudents;
		char choise;
		try
		{
			File file = new File("CourseDB.txt");
			if(!file.exists())
			{
				file.createNewFile();
				System.out.println("Creating new file...");
			}
			else
			{
				System.out.println("Updating file...");
			}
			BufferedWriter output = new BufferedWriter(new FileWriter(file));
			while(true)
			{
				System.out.println("Do you wanna add a new School to the system?");
				System.out.println("1. Press 'Y' if you want!\n2. Press 'N' if you dont!");
				choise = scanner.next().charAt(0);
				if (choise == 'y')
				{
					System.out.println("Enter the Course Name: ");
					name = scanner.next();
					output.write(name + "\n");
					
					System.out.println("Enter the Course minGrade: ");
					minGrade = scanner.next();
					output.write(minGrade + "\n");
					
					System.out.println("Enter the Course Professor Name: ");
					professor = scanner.next();
					output.write(professor + "\n");
					
					System.out.println("Enter the Course Year: ");
					year = scanner.next();
					output.write(year + "\n");
					
					System.out.println("Enter the Course Number of Students: ");
					numOfStudents = scanner.nextInt();
					output.write(numOfStudents + "\n");
					
					System.out.println("Enter the Course Student Names: ");
					for(int i = 0; i < numOfStudents; i++)
					{
						studentName = scanner.next();
						output.write(studentName + "\n");
					}
					output.write("*" + "\n");
					System.out.println("The Course was successfuly saved!!\n\n*****\n");
				}
				else if(choise == 'n')
				{
					System.out.println("Okay! try it later!");
					break;
				}
				else
				{
					System.out.println("Please input a variable choise!!");
					break;
				}
				output.close();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	// Get data from file
	
	public void getData() 
	{
		Vector<String> list = new Vector<String>();
		try
		{
			  File file = new File("CourseDB.txt");
			  if (file.exists())
			  {
				  System.out.println("***    Reading file...    ***\n\n");
				  BufferedReader input = new BufferedReader(new FileReader(file));
				  String line;
				  while ((line = input.readLine()) != null)
				  {
					  list.add(line);
				  }
				  input.close();
				  int i = 0;
				  while(i != list.size())
				  {
					  if(i == list.size())
					  {
						  break;
					  }
					  System.out.println("The course name is: " + list.elementAt(i));
					  _course = list.elementAt(i);
					  i++;
					  if(i == list.size())
					  {
						  break;
					  }
					  System.out.println("The course minGrade is: " + list.elementAt(i));
					  _course = list.elementAt(i);
					  i++;
					  if(i == list.size())
					  {
						  break;
					  }
					  System.out.println("The course professor name is: " + list.elementAt(i));
					  _course = list.elementAt(i);
					  i++;
					  if(i == list.size())
					  {
						  break;
					  }
					  System.out.println("The course year is: " + list.elementAt(i));
					  _course = list.elementAt(i);
					  i++;
					  if(i == list.size())
					  {
						  break;
					  }
					  System.out.println("The number of the students of the course is: " + list.elementAt(i));
					  _course = list.elementAt(i);
					  int student = Integer.parseInt(list.elementAt(i));
					  System.out.print("The students names are: ");
					  for(int j = i + 1; j <= i + student; j++)
					  {
							System.out.print(list.elementAt(j) + ", ");
							_course = list.elementAt(j);
					  }
					  System.out.println("\n\n****\n");
					  i += student + 2;
					  if(i == list.size())
					  {
						  break;
					  }
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
	
	// Get course by its name
	
	public void getCourseByName(String courseName)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the course you want: ");
		Vector<String> list = new Vector<String>();
		courseName = scanner.nextLine();
		try
		{
			  File file = new File("CourseDB.txt");
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
			if(courseName.equals(list.elementAt(i)))
			{
				int line = i;
				System.out.println("The course information is: ");
				System.out.println("Name: " + list.elementAt(line));
				System.out.println("MinGrade: " + list.elementAt(line + 1));
				System.out.println("Professor Name: " + list.elementAt(line + 2));
				System.out.println("Course Year: " + list.elementAt(line + 3));
				System.out.println("Number of the Students: " + list.elementAt(line + 4));
				int student = Integer.parseInt(list.elementAt(line + 4));
				System.out.print("Name of the Students: ");
				for(int j = line + 4 + 1; j <= line + 4 + student; j++)
				{
					System.out.print(list.elementAt(j) + ", ");
				}
				System.out.println("\n\n*****\n");
			}
		}
	}
}































