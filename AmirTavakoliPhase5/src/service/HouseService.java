package service;

import java.io.*;
import java.util.*;
import entities.*;

public class HouseService
{
	private Vector<String> _allHouses;
	private String _house;
	
	// House Menu
	
	public void houseMenu()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the house menu\n");
		System.out.println("What do you wanna do? Choose it with an integer.\n");
		System.out.println("1. Create a new house \n2. Search house via name \n3. Edit house information \n4. Show all house \n5. Delete a house");
		int choise = scanner.nextInt();
		switch(choise)
		{
		case 1:
			setData();
			break;
		
		case 2:
			getHouseByName(null);
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
			  File file = new File("HouseDB.txt");
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
					  System.out.println("The house name is: " + list.elementAt(i));
					  _house = list.elementAt(i);
					  i++;
					  if(i >= list.size())
					  {
						  break;
					  }
					  System.out.println("The name of the school of the house is: " + list.elementAt(i));
					  _house = list.elementAt(i);
					  i++;
					  if(i >= list.size())
					  {
						  break;
					  }
					  System.out.println("The number of the students of the house is: " + list.elementAt(i));
					  _house = list.elementAt(i);
					  int student = Integer.parseInt(list.elementAt(i));
					  System.out.print("The name of the students are: ");
					  for(int j = i + 1; j <= i + student; j++)
					  {
						  System.out.print(list.elementAt(j) + ", ");
						  _house = list.elementAt(j);
					  }
					  i += student + 1;
					  if(i >= list.size())
					  {
						  break;
					  }
					  System.out.println("\n\n*****\n");
				  }
				  _allHouses.add(_house);
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
		String name, school, studentName;
		int numOfStudents;
		char choise;
		try
		{
			File file = new File("HouseDB.txt");
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
				System.out.println("Do you wanna add a new house to the system?");
				System.out.println("1. Press 'Y' if you want!\n2. Press 'N' if you dont!");
				choise = scanner.next().charAt(0);
				if (choise == 'y')
				{
					System.out.println("Enter the house Name: ");
					name = scanner.next();
					output.append(name + "\n");
					
					System.out.println("Enter the School Name of the House: ");
					school = scanner.next();
					output.append(school + "\n");
					
					System.out.println("Enter the House Number of Students: ");
					numOfStudents = scanner.nextInt();
					output.append(numOfStudents + "\n");
					
					System.out.println("Enter the House Student Names: ");
					for(int i = 0; i < numOfStudents; i++)
					{
						studentName = scanner.next();
						output.append(studentName + "\n");
					}
					output.append("*" + "\n");
					System.out.println("The House was successfuly saved!!\n\n*****\n");
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
	// Get house with its name
	
	public void getHouseByName(String houseName)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the house you want: ");
		Vector<String> list = new Vector<String>();
		houseName = scanner.nextLine();
		try
		{
			File file = new File("HouseDB.txt");
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
			if(houseName.equals(list.elementAt(i)))
			{
				int line = i;
				System.out.println("The house information is: ");
				System.out.println("Name: " + list.elementAt(i));
				System.out.println("School: " + list.elementAt(i + 1));
				System.out.println("Number of Students: " + list.elementAt(i + 2));
				int student = Integer.parseInt(list.elementAt(i + 2));
				System.out.print("Student Names: ");
				for(int j = i + 3; j <= i + 2 + student; j++)
				{
					System.out.print(list.elementAt(j) + ", ");
				}
				System.out.println("\n\n*****\n");
			}
		}
	}
}
