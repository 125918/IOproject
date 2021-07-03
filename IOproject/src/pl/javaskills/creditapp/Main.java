package pl.javaskills.creditapp;

import pl.javaskills.creditapp.client.ConsoleReader;
import pl.javaskills.creditapp.core.CreditApplicationService;
import pl.javaskills.creditapp.core.Person;

public class Main 
{

	public static void main(String[] args) 
	{
		CreditApplicationService service = new CreditApplicationService();
		Person person = new ConsoleReader().readInputParameters(); // tworz� instancj� ConsoleReader i wywo�uj� metod� readInputParameters i rezultat tej metody zapisz� do zmiennej o typie Person
		
		String decision = service.getDecision(person);
		
		System.out.println(decision);

	}

}
