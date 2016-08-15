package com.lab.monday.explore;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class ReadAndWrite
{
	Path ourNewPath = Paths.get("\\Users\\admin\\newWorkspace\\August 15th\\src\\com\\lab\\monday\\explore\\countryList.txt");
	File aNewFile = ourNewPath.toFile();
	
	public void readCountries()
	{
		ArrayList<String>countries = new ArrayList<>();
		
		try (BufferedReader in = new BufferedReader(new FileReader(aNewFile)))
		{
			String aCountry;
			while((aCountry = in.readLine()) != null)
			{
				countries.add(aCountry);
			}
			in.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		for (int i = 0; i < countries.size(); i++)
		{
			System.out.println(countries.get(i));
		}
		
	}//end readCountries
	
	public void writeCountries(String userCountry)
	{

		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFile, true))))
		{
			out.print(userCountry);
			out.close();
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}//end writeCountries
	
	
}//class
