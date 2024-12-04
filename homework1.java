package homework;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		// Your name at the beginning of the file as a single-line comment
        // Author: [Your Name]

        Scanner scanner = new Scanner(System.in);

        // Prompt for user input
        System.out.println("Please enter the following information:");

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Age (in years): ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        System.out.print("Phone (without any dashes/parenthesis, e.g. 8031234567): ");
        String phone = scanner.nextLine();

        System.out.print("Major: ");
        String major = scanner.nextLine();

        System.out.print("Year (Freshman, Sophomore, Junior, Senior): ");
        String year = scanner.nextLine();

        System.out.print("Today's Date (mm/dd/yyyy): ");
        String todaysDate = scanner.nextLine();

        // Additional Questions
        System.out.print("Favorite Sport: ");
        String favoriteSport = scanner.nextLine();

        System.out.print("Favorite Movie: ");
        String favoriteMovie = scanner.nextLine();

        System.out.print("Lucky Number: ");
        int luckyNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        // Compute birth year
        int birthYear = 2024 - age;

        // Convert date to European format
        String[] dateParts = todaysDate.split("/");
        String europeanDate = dateParts[1] + "." + dateParts[0] + "." + dateParts[2];

        // Modify phone number to (xxx)xxx-xxxx format
        String formattedPhone = "(" + phone.substring(0, 3) + ")" + phone.substring(3, 6) + "-" + phone.substring(6);

        // Output introduction about the user
        System.out.println("\nHere's a quick intro for " + firstName + " " + lastName + ":");
        System.out.println("You were born in the year " + birthYear + ".");
        System.out.println("In your free time, you love to watch " + favoriteSport + " and catch up on movies, with '" + favoriteMovie + "' being one of your favorites.");
        System.out.println("Your lucky number is " + luckyNumber + ".");
        System.out.println("You are a " + year + " at USC majoring in " + major + ".");
        System.out.println("You can be reached at " + formattedPhone + ".");
        System.out.println("You are now officially a Gamecock!");
        System.out.println("Last Updated: " + europeanDate);
    }
}