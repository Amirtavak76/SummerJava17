package entities;

import java.util.*;

import entities.Enum.BloodStatus;

public class Students extends Person
{
	private Vector<Course> _courses;
	private Vector<FinishedCourse> _reportCard;
	private String _name;
	private House _house;
	private BloodStatus _bloodStatus;
	private School _school;
	private String _birthDay;
	//Constructors:
	
	public Students(Vector<Course> courses, Vector<FinishedCourse> reportCard, String name, House house, BloodStatus bloodStatus, School school, String birthDay)
	{
		super(name, house, bloodStatus, school, birthDay);
		_courses = courses;
		_reportCard = reportCard;
	}
	
	//Getters:
	
	public Vector<Course> getCourses()
	{
		return _courses;
	}
	public Vector<FinishedCourse> getReportCard()
	{
		return _reportCard;
	}
	
	//Setters:
	
	public void setCourses(Vector<Course> courses)
	{
		_courses = courses;
	}
	public void segReportCard(Vector<FinishedCourse> reportCard)
	{
		_reportCard = reportCard;
	}
	public String toString()
	{
		String temp = new String();
		temp += _name + null + null + null + null + null + null;
		return temp;
	}
}
