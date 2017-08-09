package entities;

import java.util.ArrayList;
import java.util.Vector;

public class School
{
	private String _name;
	private int _numOfStudents;
	private boolean _housed;
	private ArrayList<String> _houseNames;
	private Vector<String> _studentNames;
	private Vector<String> _professorNames;
	private ArrayList<String> _courseNames;
	private String _location;
	
	//Constructors:
	
	public School(String name)
	{
		_name = name;
		_numOfStudents = 0;
		_housed = false;
		_houseNames = new ArrayList<String>();
		_studentNames = new Vector<String>();
		_professorNames = new Vector<String>();
		_courseNames = new ArrayList<String>();
		_location = "";
	}
	
	public School (String name, int numOfStudents, boolean housed, ArrayList<String> houseNames, Vector<String> studentNames, Vector<String> professorNames, ArrayList<String> courseNames, String location)
	{
		_name = name;
		_numOfStudents = numOfStudents;
		_housed = housed;
		_houseNames = houseNames;
		_studentNames = studentNames;
		_professorNames = professorNames;
		_courseNames = courseNames;
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
	public ArrayList<String> getHouseNames()
	{
		return _houseNames;
	}
	public Vector<String> getStudentNames()
	{
		return _studentNames;
	}
	public Vector<String> getProfessorNames()
	{
		return _professorNames;
	}
	public ArrayList<String> getCourseNames()
	{
		return _courseNames;
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
	public void setHouseNames(ArrayList<String> houseNames)
	{
		_houseNames = houseNames;
	}
	public void setStudentNames(Vector<String> studentNames)
	{
		_studentNames = studentNames;
	}
	public void setProfessorNames(Vector<String> professorNames)
	{
		_professorNames = professorNames;
	}
	public void setCourseNames(ArrayList<String> courseNames)
	{
		_courseNames = courseNames;
	}
	public void setLocation(String location)
	{
		
	}
}
