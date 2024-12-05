package homework5;
import java.util.Scanner;
//Connor Hatalla-Scarmbling
public class CoffeeTester_Homework5
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		String choice;
		
		do {
			//make 2 coffee objects
			Coffee_Homework5 coffee1 = createCoffee(key, "first");
			Coffee_Homework5 coffee2 = createCoffee(key, "second");
			
			//outpuut coffee info
			System.out.println(coffee1);
			System.out.println("It would take " + coffee1.riskyAmount() + " cups of " + coffee1.getName() + " before it's dangerous to drink more.");
			
			System.out.println(coffee2);
			System.out.println("It would take " + coffee2.riskyAmount() + " cups of " + coffee2.getName() + " before it's dangerous to drink more.");
			
			//make sure both coffees arent the same
			System.out.println("Are both coffee's the same? " + coffee1.equals(coffee2));
			
			//ask if they want more
			System.out.println("Do you want to create more coffee's? Yes or No.");
			choice = key.next();
		} while (choice.equalsIgnoreCase("Yes"));

		key.close();
	}
	
	private static Coffee_Homework5 createCoffee(Scanner key, String order)
	{
		System.out.println("What's the name of the " + order + " coffee?");
		String name = key.next();
		
		System.out.println("What's the caffeine content?");
		int caffeineCont = key.nextInt();
		
		return new Coffee_Homework5(name, caffeineCont);
	}
}
