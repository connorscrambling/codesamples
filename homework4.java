package homework;

import java.util.Scanner;



public class homework4 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numCircles = getValidSize(scanner);
	        Circle[] circles = new Circle[numCircles];

	        // Collect circle data
	        for (int i = 0; i < numCircles; i++) {
	            System.out.print("Enter radius for circle " + (i + 1) + ": ");
	            double radius = scanner.nextDouble();
	            circles[i] = new Circle(radius);
	        }

	        boolean exit = false;
	        while (!exit) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Sort areas (smallest to largest)");
	            System.out.println("2. Sort areas (largest to smallest)");
	            System.out.println("3. Display unique areas");
	            System.out.println("4. Quit");

	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    sortAscending(circles);
	                    displayAreas(circles);
	                    break;
	                case 2:
	                    sortDescending(circles);
	                    displayAreas(circles);
	                    break;
	                case 3:
	                    displayUniqueAreas(circles);
	                    break;
	                case 4:
	                    exit = true;
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	    }

	    // Method to get valid size input from user
	    public static int getValidSize(Scanner scanner) {
	        int size;
	        do {
	            System.out.print("Enter the number of circles: ");
	            size = scanner.nextInt();
	            if (size <= 0) {
	                System.out.println("Please enter a positive number.");
	            }
	        } while (size <= 0);
	        return size;
	    }

	    // Method to sort circles in ascending order by area
	    public static void sortAscending(Circle[] circles) {
	        for (int i = 0; i < circles.length - 1; i++) {
	            for (int j = 0; j < circles.length - i - 1; j++) {
	                if (circles[j].getArea() > circles[j + 1].getArea()) {
	                    Circle temp = circles[j];
	                    circles[j] = circles[j + 1];
	                    circles[j + 1] = temp;
	                }
	            }
	        }
	    }

	    // Method to sort circles in descending order by area
	    public static void sortDescending(Circle[] circles) {
	        for (int i = 0; i < circles.length - 1; i++) {
	            for (int j = 0; j < circles.length - i - 1; j++) {
	                if (circles[j].getArea() < circles[j + 1].getArea()) {
	                    Circle temp = circles[j];
	                    circles[j] = circles[j + 1];
	                    circles[j + 1] = temp;
	                }
	            }
	        }
	    }

	    // Method to display all areas
	    public static void displayAreas(Circle[] circles) {
	        System.out.println("Circle Areas:");
	        for (Circle circle : circles) {
	            System.out.println(circle.getArea());
	        }
	    }

	    // Method to display unique areas
	    public static void displayUniqueAreas(Circle[] circles) {
	        System.out.println("Unique Areas:");
	        for (int i = 0; i < circles.length; i++) {
	            boolean isUnique = true;
	            for (int j = 0; j < circles.length; j++) {
	                if (i != j && circles[i].getArea() == circles[j].getArea()) {
	                    isUnique = false;
	                    break;
	                }
	            }
	            if (isUnique) {
	                System.out.println(circles[i].getArea());
	            }
	        }
	    }
	}

	// Circle class to store radius and area
	class Circle {
	    private double radius;
	    private double area;

	    public Circle(double radius) {
	        this.radius = radius;
	        this.area = 3.14 * radius * radius;
	    }

	    public double getArea() {
	        return this.area;
	    }
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

