package entities;

import java.util.Date;

public class Person
{
	 private String _personName;
	 private String _personHouseName;
	 private String _personSchool;
	 private String _personBloodStatus;
	 private Date _personBirthDate;
	 
	 public Person()
	 {
		 this("", "", "", "", null);
	 }
	 public Person(String name)
	 {
		 this(name, " ", "", "", null);
		 
	 }
	 public Person(String name, String houseName, String school, String bloodStatus, Date birthDate)
	 {
		 _personName = name;
		 _personHouseName = houseName;
		 _personSchool = school;
		 _personBloodStatus = bloodStatus;
		 _personBirthDate = birthDate;
	 }
	 public String toString()
	 {
		 String temp = new String();
		 temp += _personName + '\n' + '\n' + _personHouseName + '\n' + _personSchool + '\n' +_personBloodStatus + '\n' + _personBirthDate;
		 return temp;
	 }
}
