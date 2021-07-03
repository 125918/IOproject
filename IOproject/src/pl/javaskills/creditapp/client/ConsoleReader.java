package pl.javaskills.creditapp.client;



import java.util.Scanner;

import pl.javaskills.creditapp.core.Person;

public class ConsoleReader 
{
	public Person readInputParameters() 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = in.next();
		
		System.out.println("Enter your last name");
		String lastName = in.next();
		
		System.out.println("Enter your mothers maiden name");
		String mothersMaidenName = in.next();
		
		return new Person(name, lastName, mothersMaidenName); // zwracamy instancję klasy Person; wywołujemy konstruktor i przekazujemy wszystkie zaczytane z konsoli parametry
		
	}
}
