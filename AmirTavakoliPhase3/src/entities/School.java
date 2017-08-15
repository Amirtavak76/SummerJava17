package entities;

import java.util.*;

public class School 
{
	private String _name;
	private int _numOfStudents;
	private boolean _housed;
	private ArrayList<House> _houses;
	private Vector<Students> _students;
	private Vector<Professor> _professors;
	private ArrayList<Course> _courses;
	private String _location;
	
	
	//Constructors:
	
	
	public School(String name)
	{
		_name = name;
		_numOfStudents = 0;
		_housed = false;
		_houses = new ArrayList<House>();
		_students = new Vector<Students>();
		_professors = new Vector<Professor>();
		_courses = new ArrayList<Course>();
		_location = null;
	}
	
	public School (String name, int numOfStudents, boolean housed, ArrayList<House> houses, Vector<Students> students, Vector<Professor> professors, ArrayList<Course> courses, String location)
	{
		_name = name;
		_numOfStudents = numOfStudents;
		_housed = housed;
		_houses = houses;
		_students = students;
		_professors = professors;
		_courses = courses;
		_location = location;
	}
	
	//Getters:
	
	public String getName()
	{
		return _name;
	}
	public int getNumOfStudents()
	{
		return _numOfStudents;
	}
	public boolean getHoused()
	{
		return _housed;
	}
	public ArrayList<House> getHouseNames()
	{
		return _houses;
	}
	public Vector<Students> getStudentNames()
	{
		return _students;
	}
	public Vector<Professor> getProfessorNames()
	{
		return _professors;
	}
	public ArrayList<Course> getCourseNames()
	{
		return _courses;
	}
	public String getLocation()
	{
		return _location;
	}
	
	
	//Setters:
	
	public void setName(String name)
	{
		_name = name;
	}
	public void setNumOfStudents(int numOfStudents)
	{
		_numOfStudents = numOfStudents;
	}
	public void setHoused(boolean housed)
	{
		_housed = housed;
	}
	public void setHouseNames(ArrayList<House> houses)
	{
		_houses = houses;
	}
	public void setStudentNames(Vector<Students> students)
	{
		_students = students;
	}
	public void setProfessorNames(Vector<Professor> professors)
	{
		_professors = professors;
	}
	public void setCourseNames(ArrayList<Course> courses)
	{
		_courses = courses;
	}
	public void setLocation(String location)
	{
		_location = location;
	}
	
	public String toString()
	{
		String temp = new String();
		temp += _name + 0 + false + null + null + null + null + null;
		return temp;
	}
}
