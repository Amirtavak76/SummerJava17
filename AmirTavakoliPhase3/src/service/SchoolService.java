package service;
import java.util.*;

import entities.*;
public class SchoolService 
{
	private School _school;
	private Vector<School> _allSchools;
	
	public House SortingHat(Students _name)
	{
		House house = null;
		System.out.println("Please enter your name:");
		Scanner scanner = new Scanner (System.in);
		String name = scanner.nextLine();
		int rank1 = 0;
		System.out.println("Welcome to the enterance house test Mr." + name + "\n");
		System.out.println("Here there are some questions that you will answer them, according to your answers you will enter to the house that you have its qualities\n");
		System.out.println("1. Are you a brave Person? \n  1) Perfectly yes \n  2) Probably yes \n  3) Probably not \n  4) No I am not");
		Scanner choice = new Scanner(System.in);
		int b = choice.nextInt();
		if(b == 1)
		{
			rank1 = 76;
		}
		if(b == 2)
		{
			rank1 = 51;
		}
		if(b == 3)
		{
			rank1 = 26;
		}
		if(b == 4)
		{
			rank1 = 0;
		}
		
		System.out.println("2. What is your nerve rank?");
		System.out.println(" 1) Upper 75\n 2) 50 to 75\n 3)25 to 50\n 4) Lower 25\n");
		int rank2 = 0;
		int c = choice.nextInt();
		if(c == 1)
		{
			rank2 = 76;
		}
		if(c == 2)
		{
			rank2 = 51;
		}
		if(c == 3)
		{
			rank2 = 26;
		}
		if(c == 4)
		{
			rank2 = 0;
		}
		
		System.out.println("3. Do you have chivarly in your behavior?1");
		System.out.println(" 1) Perfectly yes \n 2) Probably yes \n 3) Probably not \n 4) No I am not");
		int rank3 = 0;
		int d = choice.nextInt();
		if(d == 1)
		{
			rank3 = 76;
		}
		if(d == 2)
		{
			rank3 = 51;
		}
		if(d == 3)
		{
			rank3 = 26;
		}
		if(d == 4)
		{
			rank3 = 0;
		}
		
		System.out.println("4. Are you an ambitious?\n");
		System.out.println(" 1) Perfectly yes \n 2) Probably yes \n 3) Probably not \n 4) No I am not");
		int rank4 = 0;
		int e = choice.nextInt();
		if(e == 1)
		{
			rank4 = 76;
		}
		if(e == 2)
		{
			rank4 = 51;
		}
		if(e == 3)
		{
			rank4 = 26;
		}
		if(e == 4)
		{
			rank4 = 0;
		}
		
		System.out.println("5. Are you a resourceful person?\n");
		System.out.println(" 1) Perfectly yes \n 2) Probably yes \n 3) Probably not \n 4) No I am not");
		int rank5 = 0;
		int f = choice.nextInt();
		if(f == 1)
		{
			rank5 = 76;
		}
		if(f == 2)
		{
			rank5 = 51;
		}
		if(f == 3)
		{
			rank5 = 26;
		}
		if(f == 4)
		{
			rank5 = 0;
		}
		
		System.out.println("6. What is the rank of your IQ\n");
		System.out.println(" 1) Upper 75\n 2) 50 to 75\n 3)25 to 50\n 4) Lower 25\n");
		int rank6 = 0;
		int g = choice.nextInt();
		if(g == 1)
		{
			rank6 = 76;
		}
		if(g == 2)
		{
			rank6 = 51;
		}
		if(g == 3)
		{
			rank6 = 26;
		}
		if(g == 4)
		{
			rank6 = 0;
		}
		System.out.println("7. Are you a knowledgable person?\n");
		System.out.println(" 1) Perfectly yes \n 2) Probably yes \n 3) Probably not \n 4) No I am not");
		int rank7 = 0;
		int h = choice.nextInt();
		if(h == 1)
		{
			rank7 = 76;
		}
		if(h == 2)
		{
			rank7 = 51;
		}
		if(h == 3)
		{
			rank7 = 26;
		}
		if(h == 4)
		{
			rank7 = 0;
		}
		
		System.out.println("8. Are you a hard work Person? \n");
		System.out.println(" 1) Perfectly yes \n 2) Probably yes \n 3) Probably not \n 4) No I am not");
		int rank8 = 0;
		int i = choice.nextInt();
		if(i == 1)
		{
			rank8 = 76;
		}
		if(i == 2)
		{
			rank8 = 51;
		}
		if(i == 3)
		{
			rank8 = 26;
		}
		if(i == 4)
		{
			rank8 = 0;
		}
		
		System.out.println("9. Do you have dedication in your behavior? \n");	
		System.out.println(" 1) Perfectly yes \n 2) Probably yes \n 3) Probably not \n 4) No I am not");
		int rank9 = 0;
		int j = choice.nextInt();
		if(j == 1)
		{
			rank9 = 76;
		}
		if(j == 2)
		{
			rank9 = 51;
		}
		if(j == 3)
		{
			rank9 = 26;
		}
		if(j == 4)
		{
			rank9 = 0;
		}
		
		System.out.println("10. Do you have patience in your behavior? \n");
		System.out.println(" 1) Perfectly yes \n 2) Probably yes \n 3) Probably not \n 4) No I am not");
		int rank10 = 0;
		int k = choice.nextInt();
		if(k == 1)
		{
			rank10 = 76;
		}
		if(k == 2)
		{
			rank10 = 51;
		}
		if(k == 3)
		{
			rank10 = 26;
		}
		if(k == 4)
		{
			rank10 = 0;
		}
		
		System.out.println("11. Do you have loyality in your behavior? \n");
		System.out.println(" 1) Perfectly yes \n 2) Probably yes \n 3) Probably not \n 4) No I am not");
		int rank11 = 0;
		int l = choice.nextInt();
		if(l == 1)
		{
			rank11 = 76;
		}
		if(l == 2)
		{
			rank11 = 51;
		}
		if(l == 3)
		{
			rank11 = 26;
		}
		if(l == 4)
		{
			rank11 = 0;
		}
		
		if ((rank1 >= 50 && rank2 >=50) || (rank1 >= 50 && rank3 >= 50) || (rank2 >= 50 && rank3 >= 50))
		{
			System.out.println("According to your qualities, the Griffindor house is the best one for you");
		}
		else if (rank4 >= 50 || rank5 >= 50)
		{
			System.out.println("According to your qualities, the Slytherin house is the best one for you");
		}
		else if (rank6 >= 50 || rank7 >= 50)
		{
			System.out.println("According to your qualities, the Revenclaw house is the best one for you");
		}
		else if((rank8 >= 50 && rank9 >= 50 && rank10 >= 50) || (rank9 >= 50 && rank10 >= 50 && rank11 >= 50) || (rank8 >= 50 && rank9 >= 50 && rank11 >= 50) || (rank8 >= 50 && rank10 >= 50 && rank10 >= 50))
		{
			System.out.println("According to your qualities, the Hupplepuff house is the best one for you");
		}
		else
		{
			System.out.println("No house found!");
		}
		return house;
	}
}
