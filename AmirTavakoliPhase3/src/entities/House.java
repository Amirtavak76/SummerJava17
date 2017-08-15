package entities;

import java.util.*;

public class House 
{
	private String _name;
	private School _school;
	private Vector<Students> _students;
	private Professor _headTeacher;
	private ArrayList<String> _qualities;
	private Map<Integer, Students> _prefect;
	
	//Constructors:
	
	public House(String name)
	{
		_name = name;
		_school = null;
		_students = null;
		_headTeacher = null;
		_qualities = null;
		_prefect = null;
	}
	
	public House(String name, School school, Vector<Students> students, Professor headTeacher, ArrayList<String> qualities, Map<Integer, Students> prefect)
	{
		_name = name;
		_school = school;
		_students = students;
		_headTeacher = headTeacher;
		_qualities = qualities;
		_prefect = prefect;
	}
	
	//Getters:
	
	public String getName()
	{
		return _name;
	}
	public School getSchool()
	{
		return _school;
	}
	public Vector<Students> getStudents()
	{
		return _students;
	}
	public Professor getHeadTeacher()
	{
		return _headTeacher;
	}
	public ArrayList<String> getQualities()
	{
		return _qualities;
	}
	public Map<Integer, Students> getPrefect()
	{
		return _prefect;
	}
	
	//Setters;
	
	
	public void setName(String name)
	{
		_name = name;
	}
	public void setSchool(School school)
	{
		_school = school;
	}
	public void setStudents(Vector<Students> students)
	{
		_students = students;
	}
	public void setHeadTeacher(Professor headTeacher)
	{
		_headTeacher = headTeacher;
	}
	public void setQualities(ArrayList<String> qualities)
	{
		_qualities = qualities;
	}
	public void setPrefect(Map<Integer, Students> prefect)
	{
		_prefect = prefect;
	}
	public String toString()
	{
		String temp = new String(_name + null + null + null + null + null);
		return temp;
	}
}
