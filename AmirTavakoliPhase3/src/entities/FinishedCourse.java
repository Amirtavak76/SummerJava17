package entities;

import java.util.Vector;

import entities.Enum.Grades;

public class FinishedCourse extends Course
{
	private Grades _grade;
	private boolean _passed;
	private String _name;
	private Grades _minGrade;
	private Professor _professor;
	private int _year;
	private Vector<Students> _students;
	
	// Constructors:
	
	public FinishedCourse(Grades grade, boolean passed, String name, Grades minGrade, Professor professor, int year, Vector<Students> students)
	{
		super(name, minGrade, professor, year, students);
		_grade = grade;
		_passed = passed;
		_name = name;
		_minGrade = minGrade;
		_professor = professor;
		_year = year;
		_students = students;
	}
	
	//Getters:
	
	public Grades getGrade()
	{
		return _grade;
	}
	public boolean getPassed()
	{
		return _passed;
	}
	
	// Setters:
	
	public void setGrade(Grades grade)
	{
		_grade = grade;
	}
	public void setPassed(boolean passed)
	{
		_passed = passed;
	}
	public String toString()
	{
		String temp = new String();
		temp += "" + null + _name + null + null + null + null
		return temp;
	}
}
