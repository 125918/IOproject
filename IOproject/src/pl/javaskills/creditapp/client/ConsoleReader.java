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
		
		System.out.println("Enter total monthly income in PLN");
		double income = in.nextDouble();
		
		System.out.println("Are you married");
		boolean married = in.nextBoolean();
		
		System.out.println("Enter number of Family dependnts (including applicant):");
		int numOfDependant = in.nextInt();
		
		return new Person(name, lastName, mothersMaidenName, income, married, numOfDependant); // zwracamy instancjê klasy Person; wywo³ujemy konstruktor i przekazujemy wszystkie zaczytane z konsoli parametry
		
	}
}
