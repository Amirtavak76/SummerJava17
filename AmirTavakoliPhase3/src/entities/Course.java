package entities;

import java.util.*;

import entities.Enum.Grades;

public class Course
{
	private String _name;
	private Grades _minGrade;
	private Professor _professor;
	private int _year;
	private Vector<Students> _students;
	
	//Constructors:
	
	public Course(String name)
	{
		_name = name;
		_minGrade = null;;
		_professor = null;
		_year = 0;
		_students = new Vector<Students>();
	}
	
	public Course(String name, Grades minGrade, Professor professor, int year, Vector<Students> students)
	{
		_name = name;
		_minGrade = minGrade;
		_professor = professor;
		_year = year;
		_students = students;
	}
	
	//Getters:
	
	public String getName()
	{
		return _name;
	}
	public Grades getMinGrage()
	{
		return _minGrade;
	}
	public Professor getProfessorName()
	{
		return _professor;
	}
	public int getYear()
	{
		return _year;
	}
	public Vector<Students> studentNames()
	{
		return _students;
	}
	
	//Setters
	
	public void setName(String name)
	{
		_name = name;
	}
	public void setMinGrade(Grades minGrade)
	{
		_minGrade = minGrade;
	}
	public void setProfessorName(Professor professor)
	{
		_professor = professor;
	}
	public void setYear(int year)
	{
		_year = year;
	}
	public void setStudentNames(Vector<Students> students)
	{
		_students = students;
	}
	public String toString()
	{
		String temp = new String (_name + null  + null + 0 + null);
		return temp;
	}
}
