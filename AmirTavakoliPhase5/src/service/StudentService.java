package service;

import java.io.*;
import java.util.*;

public class StudentService
{
	private String _student;
	
	// Student Menu
	
	public void studentMenu()

	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the student menu\n");
		System.out.println("What do you wanna do? Choose it with an integer.\n");
		System.out.println("1. Create a new student \n"
				+ "2. Search student via name \n"
				+ "3. Show student by name \n"
				+ "4. Edit student information \n"
				+ "5. Show all student \n"
				+ "6. Delete a student\n");
		int choise = scanner.nextInt();
		switch(choise)
		{
		case 1:
			setData();
			break;
		
		case 2:
			searchStudentByName(null);
			break;
			
		case 3:
			getStudentByName(null);
			break;
			
		case 4:
			System.out.println("Not available");
			break;
			
		case 5:
			getData(null);
			break;
		default:
			System.out.println("You have entered a wrong number!!");
		}
	}
	
	// Set data to file
	
	public void setData()
	{
		Scanner scanner = new Scanner (System.in);
		String name, house, bloodStatus, school, birthDay, course;
		String numOfCourse;
		
		String schoolName, houseName, studentsName, professorsName, coursesName, location;
		String numOfHouse, numOfStudent, numOfProfessor;
		char choise;
		try
		{
			File file = new File("StudentDB.txt");
			if(!file.exists())
			{
				file.createNewFile();
				System.out.println("Creating new file...");
			}
			else
			{
				System.out.println("Updating file...");
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
					if (choise == 'y')
						{
							bw.append("Hello");
							System.out.print("Complete the information of the new Student.\n");
							System.out.print("Name: ");
							name = scanner.next();
							bw.write(name);
							bw.newLine();
							
							System.out.print("House Name: ");
							house = scanner.next();
							bw.write(house);
							bw.newLine();
							
							System.out.print("Blood Status: ");
							bloodStatus = scanner.next();
							bw.write(bloodStatus);
							bw.newLine();
							
							System.out.print("School: ");
							school = scanner.next();
							bw.write(school);
							bw.newLine();
							
							System.out.print("BirthDay: ");
							birthDay = scanner.next();
							bw.write(birthDay);
							bw.newLine();
							
							System.out.println("Number of Course: ");
							numOfCourse = scanner.next();
							bw.write(numOfCourse);
							bw.newLine();
							int numOfCourses = Integer.parseInt(numOfCourse);
							System.out.print("Enter the course names: ");
							for(int j = 0; j < numOfCourses; j++)
							{
								course = scanner.next();
								bw.write(course);
								bw.newLine();
							}
							bw.write("*");
							System.out.println("The Student was successfuly saved!!\n\n*****\n");
							break;
						}
				}
				else if (choise == 'n')
				{
					break;
				}
				else
				{
					System.out.println("Please input a variable choise!!");
					break;
				}
			}
			bw.close();
			System.out.println("Finish writing to file!");
//			while(true)
//			{
//				System.out.println("Do you wanna add a new Student to the system?");
//				System.out.println("1. Press 'Y' if you want!\n2. Press 'N' if you dont!");
//				choise = scanner.next().charAt(0);
//				if (choise == 'y')
//				{
//					bw.append("Hello");
//					System.out.print("Complete the information of the new Student.\n");
//					System.out.print("Name: ");
//					name = scanner.next();
//					bw.write(name);
//					bw.newLine();
//					
//					System.out.print("House Name: ");
//					house = scanner.next();
//					bw.write(house);
//					bw.newLine();
//					
//					System.out.print("Blood Status: ");
//					bloodStatus = scanner.next();
//					bw.write(bloodStatus);
//					bw.newLine();
//					
//					System.out.print("School: ");
//					school = scanner.next();
//					bw.write(school);
//					bw.newLine();
//					
//					System.out.print("BirthDay: ");
//					birthDay = scanner.next();
//					bw.write(birthDay);
//					bw.newLine();
//					
//					System.out.println("Number of Course: ");
//					numOfCourse = scanner.next();
//					bw.write(numOfCourse);
//					bw.newLine();
//					int numOfCourses = Integer.parseInt(numOfCourse);
//					System.out.print("Enter the course names: ");
//					for(int j = 0; j < numOfCourses; j++)
//					{
//						course = scanner.next();
//						bw.write(course);
//						bw.newLine();
//					}
//					bw.write("*");
//					System.out.println("The Student was successfuly saved!!\n\n*****\n");
//					break;
//				}
//				else if(choise == 'n')
//				{
//					System.out.println("Okay! try it later!");
//					break;
//				}
//				else
//				{
//					System.out.println("Please input a variable choise!!");
//					break;
//				}
//			}
//			output.close();
//			System.out.println("Finish writing to file");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	// Get file from data
	
	public void getData(String data)
	{
		Vector<String> list = new Vector<String>();
		try
		{
			File file = new File("StudentDB.txt");
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
					System.out.println("The student information is: ");
					System.out.println("Name: " + list.elementAt(i));
					_student = list.elementAt(i);
					i++;
					if(i >= list.size())
					{
						break;
					}
					System.out.println("House Name: " + list.elementAt(i));
					_student = list.elementAt(i);
					i++;
					if(i >= list.size())
					{
						break;
					}
					System.out.println("Blood Status: " + list.elementAt(i));
					_student = list.elementAt(i);
					i++;
					if(i >= list.size())
					{
						break;
					}
					System.out.println("School: " + list.elementAt(i));
					_student = list.elementAt(i);
					i++;
					if(i >= list.size())
					{
						break;
					}
					System.out.println("BirthDay: " + list.elementAt(i));
					_student = list.elementAt(i);
					i++;
					if(i >= list.size())
					{
						break;
					}
					System.out.println("Number of Courses: " + list.elementAt(i));
					_student = list.elementAt(i);
					int student = Integer.parseInt(list.elementAt(i));
					System.out.print("Course Names: ");
					for(int j = i + 1; j <= i + student; j++)
					{
						System.out.print(list.elementAt(j) + ", ");
					}
					System.out.println("\n\n*****\n");
					i += student + 2;
					if(i >= list.size())
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
	
	// Get Student by Name
	
	public void getStudentByName(String studentName)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the house you want: ");
		Vector<String> list = new Vector<String>();
		studentName = scanner.nextLine();
		try
		{
			File file = new File("StudentDB.txt");
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
			if(studentName.equals(list.elementAt(i)))
			{
				System.out.println("The student information is: ");
				System.out.println("Name: " + list.elementAt(i));
				System.out.println("House: " + list.elementAt(i + 1));
				System.out.println("Blood Status" + list.elementAt(i + 2));
				System.out.println("School: " + list.elementAt(i + 3));
				System.out.println("BirthDay: " + list.elementAt(i + 4));
				System.out.println("Number of Courses: " + list.elementAt(i + 5));
				int course = Integer.parseInt(list.elementAt(i + 5));
				System.out.print("Course Names :");
				for(int j = i + 6; j <= i + course + 5; j++)
				{
					System.out.print(list.elementAt(j) + ", ");
				}
				System.out.println("\n\n*****\n");
			}
		}
	}
	
	// Search Student via name
	
	public void searchStudentByName(String studentName)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the house you want: ");
		Vector<String> list = new Vector<String>();
		studentName = scanner.nextLine();
		try
		{
			File file = new File("StudentDB.txt");
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
			if(list.elementAt(i).contains(studentName))
			{
				System.out.println("The student information is: ");
				System.out.println("Name: " + list.elementAt(i));
				System.out.println("House: " + list.elementAt(i + 1));
				System.out.println("Blood Status" + list.elementAt(i + 2));
				System.out.println("School: " + list.elementAt(i + 3));
				System.out.println("BirthDay: " + list.elementAt(i + 4));
				System.out.println("Number of Courses: " + list.elementAt(i + 5));
				int course = Integer.parseInt(list.elementAt(i + 5));
				System.out.print("Course Names :");
				for(int j = i + 6; j <= i + course + 5; j++)
				{
					System.out.print(list.elementAt(j) + ", ");
				}
				System.out.println("\n\n*****\n");
			}
		}
	}
}
