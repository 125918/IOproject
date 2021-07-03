package pl.javaskills.creditapp;

import pl.javaskills.creditapp.client.ConsoleReader;
import pl.javaskills.creditapp.core.CreditApplicationService;
import pl.javaskills.creditapp.core.Person;

public class Main 
{

	public static void main(String[] args) 
	{
		CreditApplicationService service = new CreditApplicationService();
		Person person = new ConsoleReader().readInputParameters(); // tworzê instancjê ConsoleReader i wywo³ujê metodê readInputParameters i rezultat tej metody zapiszê do zmiennej o typie Person
		
		String decision = service.getDecision(person);
		
		System.out.println(decision);

	}

}
