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


public class ProfessorService
{
	private String _professor;
	
	// Professor Menu
	
	public void professorMenu()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the professor menu\n");
		System.out.println("What do you wanna do? Choose it with an integer.\n");
		System.out.println("1. Create a new professor \n"
				+ "2. Search professor via name \n"
				+ "3. Show professor via name \n"
				+ "4. Edit professor information \n"
				+ "5. Show all professor \n"
				+ "6. Delete a professor\n");
		int choise = scanner.nextInt();
		switch(choise)
		{
		case 1:
			setData();
			break;
		
		case 2:
			searchProfessorByName(null);
			break;
			
		case 3:
			getProfessorByName(null);
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
			File file = new File("ProfessorDB.txt");
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
					System.out.println("The professor name is: " + list.elementAt(i));
					_professor = list.elementAt(i);
					i++;
					if(i >= list.size())
					{
						break;
					}
					System.out.println("The professor house name is: " + list.elementAt(i));
					_professor = list.elementAt(i);
					i++;
					if(i >= list.size())
					{
						break;
					}
					System.out.println("The professor blood status is: " + list.elementAt(i));
					_professor = list.elementAt(i);
					i++;
					if(i >= list.size())
					{
						break;
					}
					System.out.println("The professor school name is: " + list.elementAt(i));
					_professor = list.elementAt(i);
					i++;
					if(i >= list.size())
					{
						break;
					}
					System.out.println("The professor birth day is: " + list.elementAt(i));
					_professor = list.elementAt(i);
					i++;
					if(i >= list.size())
					{
						break;
					}
					System.out.println("The professor course name is: " + list.elementAt(i));
					_professor = list.elementAt(i);
					i++;
					if(i >= list.size())
					{
						break;
					}
					System.out.println("The professor year is: " + list.elementAt(i));
					_professor = list.elementAt(i);
					i++;
					if(i >= list.size())
					{
						break;
					}
					System.out.println("The professor notes are: " + list.elementAt(i));
					_professor = list.elementAt(i);
					i++;
					if(i == list.size())
					{
						break;
					}
					System.out.println("\n\n*****\n");
					i += 2;
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
	
	// Set data to file
	
	public void setData()
	{
		Scanner scanner = new Scanner (System.in);
		String name, house, bloodStatus, school, birthDay, course, year, notes;
		char choise;
		try
		{
			File file = new File("ProfessorDB.txt");
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
				System.out.println("Do you wanna add a new Professor to the system?");
				System.out.println("1. Press 'Y' if you want!\n2. Press 'N' if you dont!");
				choise = scanner.next().charAt(0);
				if (choise == 'y')
				{
					System.out.print("Complete the information of the new School.\n");
					System.out.println("Name: ");
					name = scanner.next();
					bw.write(name);
					bw.newLine();
					
					System.out.println("House Name: ");
					house = scanner.next();
					bw.write(house);
					bw.newLine();
					
					System.out.println("Blood Status: ");
					bloodStatus = scanner.next();
					bw.write(bloodStatus);
					bw.newLine();
					
					System.out.println("School: ");
					school = scanner.next();
					bw.write(school);
					bw.newLine();
					
					System.out.println("BirthDay: ");
					birthDay = scanner.next();
					bw.write(birthDay);
					bw.newLine();
					
					System.out.println("Course: ");
					course = scanner.next();
					bw.write(course);
					bw.newLine();
					
					System.out.println("year: ");
					year = scanner.next();
					bw.write(year);
					bw.newLine();
					
					System.out.println("Notes: ");
					notes = scanner.next();
					bw.write(notes);
					bw.newLine();
					bw.write("*");
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
	
	// Get professor by name
	
	public void getProfessorByName(String professorName)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the house you want: ");
		Vector<String> list = new Vector<String>();
		professorName = scanner.nextLine();
		try
		{
			File file = new File("ProfessorDB.txt");
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
			if(professorName.equals(list.elementAt(i)))
			{
				System.out.println("The professor information is: ");
				System.out.println("Name: " + list.elementAt(i));
				System.out.println("House: " + list.elementAt(i + 1));
				System.out.println("Blood Status: " + list.elementAt(i + 2));
				System.out.println("School: " + list.elementAt(i + 3));
				System.out.println("BirthDay: " + list.elementAt(i + 4));
				System.out.println("Course: " + list.elementAt(i + 5));
				System.out.println("Year: " + list.elementAt(i + 6));
				System.out.println("Notes: " + list.elementAt(i + 7));
				System.out.println("\n\n*****\n");
			}
		}
	}

	// Search professor via name
	
	public void searchProfessorByName(String professorName)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the house you want: ");
		Vector<String> list = new Vector<String>();
		professorName = scanner.nextLine();
		try
		{
			File file = new File("ProfessorDB.txt");
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
			if(list.elementAt(i).contains(professorName))
			{
				System.out.println("The professor information is: ");
				System.out.println("Name: " + list.elementAt(i));
				System.out.println("House: " + list.elementAt(i + 1));
				System.out.println("Blood Status: " + list.elementAt(i + 2));
				System.out.println("School: " + list.elementAt(i + 3));
				System.out.println("BirthDay: " + list.elementAt(i + 4));
				System.out.println("Course: " + list.elementAt(i + 5));
				System.out.println("Year: " + list.elementAt(i + 6));
				System.out.println("Notes: " + list.elementAt(i + 7));
				System.out.println("\n\n*****\n");
			}
		}
	}
}