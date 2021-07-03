package pl.javaskills.creditapp.core;

public class Person 
{
	private final String name;
	private final String lastName;
	private final String mothersMaidenName; 
	private final double totalMonthlyIncomeInPln;
	private final boolean married;
	private final int numOfDependants;
	
	
	// oznaczaj�c pola jako final nie musimy dodawa� setter�w, chcemy, �eby instancja klasy mia�a te 3 pola wype�nione, oznaczaj�c je jako final wymusimy, �eby zosta�y zainicjalizowane w konstruktorze
	
	public Person(String name, String lastName, String mothersMaidenName, double totalMonthlyIncomeInPln, boolean married, int numOfDependants) 
	{
		this.name = name;
		this.lastName = lastName;
		this.mothersMaidenName = mothersMaidenName;
		this.totalMonthlyIncomeInPln = totalMonthlyIncomeInPln;
		this.married = married;
		this.numOfDependants = numOfDependants;
	}
	
	//2 gettery, bo te dane musimy wy�wietli� na konsol�
	
	public String getName() 
	{
		return name;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public double getTotalMonthlyIncomeInPln() 
	{
		return totalMonthlyIncomeInPln;
	}

	public boolean isMarried() 
	{
		return married;
	}

	public int getNumOfDependants() 
	{
		return numOfDependants;
	}

	
}
