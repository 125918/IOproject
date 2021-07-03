package pl.javaskills.creditapp.core;

public class Person 
{
	private final String name;
	private final String lastName;
	private final String mothersMaidenName; 
	
	// oznaczaj¹c pola jako final nie musimy dodawaæ setterów, chcemy, ¿eby instancja klasy mia³a te 3 pola wype³nione, oznaczaj¹c je jako final wymusimy, ¿eby zosta³y zainicjalizowane w konstruktorze
	
	public Person(String name, String lastName, String mothersMaidenName) 
	{
		this.name = name;
		this.lastName = lastName;
		this.mothersMaidenName = mothersMaidenName;
	}
	
	//2 gettery, bo te dane musimy wyœwietliæ na konsolê
	
	public String getName() 
	{
		return name;
	}

	public String getLastName() 
	{
		return lastName;
	}

}
