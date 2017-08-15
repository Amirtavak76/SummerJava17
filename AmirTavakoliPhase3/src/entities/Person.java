package entities;

import entities.Enum.BloodStatus;

public class Person
{
	private String _name;
	private House _house;
	private BloodStatus _bloodStatus;
	private School _school;
	private String _birthDay;
	
	//Constructors:
	
	public Person (String name)
	{
		_name = name;
		_house = null;
		_bloodStatus = null;
		_school = null;
		_birthDay = null;
	}
		
	public Person (String name, House house, BloodStatus bloodStatus, School school, String birthDay)
	{
		_name = name;
		_house = house;
		_bloodStatus = bloodStatus;
		_school = school;
		_birthDay = birthDay;
	}
	
	//Getters:
	
	public String getName()
	{
		return _name;
	}
	public House getHouseName()
	{
		return _house;
	}
	public BloodStatus getBloodStatus()
	{
		return _bloodStatus;
	}
	public School getSchool()
	{
		return _school;
	}
	public String getBirthDay()
	{
		return _birthDay;
	}
	
	//Setters:
	
	public void setName(String name)
	{		
		_name = name;
	}
	public void setHouseName(House houseName)
	{
		_house = houseName;
	}
	public void setBloodStatus(BloodStatus bloodStatus)
	{
		_bloodStatus = bloodStatus;
	}
	public void setSchool(School school)
	{
		_school = school;
	}
	public void setBirthDay(String birthDay)
	{	
		_birthDay = birthDay;
	}
	
	public String toString()
	{
		String temp = new String();
		temp += "Name:" + _name + "\n" + "House: " + _house + "\n" + "BloodStatus: " + _bloodStatus + "\n" + "School: " + _school + "\n" + "BirthDay: " + _birthDay;
		return temp;
	}
	
}
