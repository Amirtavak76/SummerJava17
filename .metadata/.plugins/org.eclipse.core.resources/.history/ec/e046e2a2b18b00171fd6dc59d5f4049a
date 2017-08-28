package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
		System.out.println("1. Create a new professor \n2. Search professor via name \n3. Edit professor information \n4. Show all professor \n5. Delete a professor");
		int choise = scanner.nextInt();
		switch(choise)
		{
		case 1:
			System.out.println("Not available");
			break;
		
		case 2:
			getProfessorByName(null);
			break;
			
		case 3:
			System.out.println("Not available now");
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
}