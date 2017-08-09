package entities;

import java.util.Date;

public class Person 
{
	private String _name;
	private String _houseName;
	private String _bloodStatus;
	private String _school;
	private Date _birthDay;
	
	//Constructors:
	
	public Person (String name)
	{
		_name = name;
		_houseName = "";
		_bloodStatus = "";
		_school = "";
		_birthDay = new Date();
	}
	
	public Person (String name, String houseName, String bloodStatus, String school, Date birthDay)
	{
		_name = name;
		_houseName = houseName;
		_bloodStatus = bloodStatus;
		_school = school;
		_birthDay = birthDay;
	}
	
	//Getters:
	
	public String getName()
	{
		return _name;
	}
	public String getHouseName()
	{
		return _houseName;
	}
	public String getBloodStatus()
	{
		return _bloodStatus;
	}
	public String getSchool()
	{
		return _school;
	}
	public Date getBirthDay()
	{
		return _birthDay;
	}
	
	//Setters:
	
	public void setName(String name)
	{
		_name = name;
	}
	public void setHouseName(String houseName)
	{
		_houseName = houseName;
	}
	public void setBloodStatus(String bloodStatus)
	{
		_bloodStatus = bloodStatus;
	}
	public void setSchool(String school)
	{
		_school = school;
	}
	public void setBirthDay(Date birthDay)
	{
		_birthDay = birthDay;
	}
}
