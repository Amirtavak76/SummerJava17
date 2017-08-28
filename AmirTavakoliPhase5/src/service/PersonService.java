package service;

import java.io.*;
import java.util.*;
import entities.*;

public class PersonService 
{
	private Person _allPersons;
	
	// Person Menu
	
	public void personMenu()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the person menu\n");
		System.out.println("What do you wanna do? Choose it with an integer.\n");
		System.out.println("1. Create a new person \n2. Search person via name \n3. Edit person information \n4. Show all person \n5. Delete a person");
		int choise = scanner.nextInt();
		switch(choise)
		{
		case 1:
			System.out.println("Not available");
			break;
		
		case 2:
			getPersonByName(null);
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
	
	// Set data to file
	
	public void setData()
	{
		Scanner scanner = new Scanner (System.in);
		String name, house, bloodStatus, school, birthDay;
		char choise;
		try
		{
			File file = new File("PersonDB.txt");
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
				System.out.println("Do you wanna add a new Person to the system?");
				System.out.println("1. Press 'Y' if you want!\n2. Press 'N' if you dont!");
				choise = scanner.next().charAt(0);
				if (choise == 'y')
				{
					System.out.println("Enter the Person's Name: ");
					name = scanner.next();
					output.write(name + "\n");
					
					System.out.println("Enter the Person's house name: ");
					house = scanner.next();
					output.write(house + "\n");
					
					System.out.println("Enter the Person's Blood Status: ");
					bloodStatus = scanner.next();
					output.write(bloodStatus + "\n");
					
					System.out.println("Enter the Person's School: ");
					school = scanner.next();
					output.write(school + "\n");
					
					System.out.println("Enter the Person's BirthDay: ");
					birthDay = scanner.next();
					output.write(birthDay + "\n");
					
					output.write("*" + "\n");
					System.out.println("The Student was successfuly saved!!\n\n*****\n");
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
	// Get Data from file
	
	public void getData(String data)
	{
		Vector<String> list = new Vector<String>();
		try
		{
			File file = new File("PersonDB.txt");
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
					if(i >= list.size())
					{
						break;
					}
					System.out.println("The person  name is: " + list.elementAt(i));
					i++;
					if(i >= list.size())
					{
						break;
					}
					System.out.println("The person house name is: " + list.elementAt(i));
					i++;
					if(i >= list.size())
					{
						break;
					}
					System.out.println("The person blood status is: " + list.elementAt(i));
					i++;
					if(i >= list.size())
					{
						break;
					}
					System.out.println("The person school name is: " + list.elementAt(i));
					i++;
					if(i >= list.size())
					{
						break;
					}
					System.out.println("The person birth day is: " + list.elementAt(i));
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
	
	// Get Person by name
	
	public void getPersonByName(String personName)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the house you want: ");
		Vector<String> list = new Vector<String>();
		personName = scanner.nextLine();
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
			if(personName.equals(list.elementAt(i)))
			{
				System.out.println("The Person information is: ");
				System.out.println("Name: " + list.elementAt(i));
				System.out.println("House: " + list.elementAt(i + 1));
				System.out.println("Blood Status" + list.elementAt(i + 2));
				System.out.println("School: " + list.elementAt(i + 3));
				System.out.println("BirthDay: " + list.elementAt(i + 4));
				System.out.println("\n\n*****\n");
			}
		}
	}
}
