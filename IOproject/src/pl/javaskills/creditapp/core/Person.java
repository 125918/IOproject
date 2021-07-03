package pl.javaskills.creditapp.core;

public class Person 
{
	private final String name;
	private final String lastName;
	private final String mothersMaidenName; 
	
	// oznaczaj�c pola jako final nie musimy dodawa� setter�w, chcemy, �eby instancja klasy mia�a te 3 pola wype�nione, oznaczaj�c je jako final wymusimy, �eby zosta�y zainicjalizowane w konstruktorze
	
	public Person(String name, String lastName, String mothersMaidenName) 
	{
		this.name = name;
		this.lastName = lastName;
		this.mothersMaidenName = mothersMaidenName;
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

}
