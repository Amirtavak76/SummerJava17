package entities;

import java.util.*;

import entities.Enum.BloodStatus;

public class Professor extends Person
{
	private String _name;
	private House _house;
	private BloodStatus _bloodStatus;
	private School _school;
	private String _birthDay;
	private Map<Integer, Course> _course;
	private String _notes;
	
	//Constructors:
	
	public Professor(String name)
	{
		super(name);
		_name = name;
		_course = null;
		_notes = null;
		_house = null;
		_bloodStatus = null;
		_school = null;
		_birthDay = null;
	}
	public Professor(Map<Integer, Course> course, String notes, String name, House house, BloodStatus bloodStatus, School school, String birthDay)
	{
		super(name, house, bloodStatus, school, birthDay);
		_course = course;
		_notes = notes;
		_name = name;
		_house = house;
		_bloodStatus = bloodStatus;
		_school = school;
		_birthDay = birthDay;
	}
	
	//Getters:
	
	public Map<Integer, Course> getCourse()
	{
		return _course;
	}
	public String getNotes()
	{
		return _notes;
	}
	
	//Setters:
	
	public void setCourse(Map<Integer, Course> course)
	{
		_course = course;
	}
	public void setNotes(String notes)
	{
		_notes = notes;
	}
	public String toString()
	{
		String temp = new String();
		temp += _name + null + null + null + null + null + null;
		return temp;
	}
}
