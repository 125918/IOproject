package pl.javaskills.creditapp;

import pl.javaskills.creditapp.client.ConsoleReader;
import pl.javaskills.creditapp.core.Person;

public class Main 
{

	public static void main(String[] args) 
	{
		Person person = new ConsoleReader().readInputParameters(); // tworzê instancjê ConsoleReader i wywo³ujê metodê readInputParameters i rezultat tej metody zapiszê do zmiennej o typie Person
		
		System.out.println("Hello, " + person.getName() + " " + person.getLastName() + "!" );

	}

}
