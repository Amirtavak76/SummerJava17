package entities;

import java.util.Date;

public class Person
{
	 private String _personName;
	 private String _personHouseName;
	 private String _personSchool;
	 private String _personBloodStatus;
	 
	 public Person()
	 {
		 this("", "", "", "");
	 }
	 public Person(String name)
	 {
		 this(name, "", "", "");
		 
	 }
	 public Person(String name, String houseName, String school, String bloodStatus)
	 {
		 _personName = name;
		 _personHouseName = houseName;
		 _personSchool = school;
		 _personBloodStatus = bloodStatus;
	 }
	 public String toString()
	 {
		 String temp = new String();
		 temp = _personName + '\n' + _personHouseName + '\n' + _personSchool + '\n' +_personBloodStatus + '\n' ;
		 return temp;
	 }
	 public String getPersonName()
	 {
	        return _personName;
	 }
}
