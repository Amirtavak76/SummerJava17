package entities;

public class Enum 
{
	private String _name;
	public enum BloodStatus
	{
		Muggle, Muggle_born, Half_blood, Pure_blood, Squib, Half_breed  
	};
	private BloodStatus _bloodStatus;
	
	public enum Grades
	{
		O, E, A, P, D, T   
		/* O = Outstanding     
		E = Exceeds Expectations    
		A = Acceptable     
		P = Poor    
		D = Dreadful    
		T = Troll */
	};
	private Grades _grades;
}
