package service;


import java.io.FileNotFoundException;

import entities.*;

public class Main
{
	public static void main(String arg[])
	{
		Students name = null;
		SchoolService service = new SchoolService();
		String data = null;
		try {
			service.getData(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
