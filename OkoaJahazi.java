package okoaJahazi;

import java.util.Scanner;

public class OkoaJahazi {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        while (true) {
	            // Display the main menu
	            System.out.println("Main Menu:");
	            System.out.println("0: Sh20 (30mins, 3hrs)");
	            System.out.println("1: Okoa Easy Sh50 (50Mins, midnight)");
	            System.out.println("2: Okoa 100");
	            System.out.println("3: Okoa 50");
	            System.out.println("4: Okoa 20 (or KSh50, Midnight)");
	            System.out.println("5: Okoa 10");
	            System.out.println("6: Okoa 5");
	            System.out.println("7: Okoa Internet");
	            System.out.println("98: More");
	            System.out.print("Enter your choice: ");
	            System.out.println(); // Add a space for readability

	            // Read user input
	            int choice = scanner.nextInt();

	            // Process the user's choice
	            switch (choice) {
	                case 0:
	                    System.out.println("You selected: Sh20 (30mins, 3hrs)");
	                    break;
	                case 1:
	                    System.out.println("You selected: Okoa Easy Sh50 (50Mins, midnight)");
	                    break;
	                case 2:
	                    System.out.println("You selected: Okoa 100");
	                    break;
	                case 3:
	                    System.out.println("You selected: Okoa 50");
	                    break;
	                case 4:
	                    System.out.println("You selected: Okoa 20 (or KSh50, Midnight)");
	                    break;
	                case 5:
	                    System.out.println("You selected: Okoa 10");
	                    break;
	                case 6:
	                    System.out.println("You selected: Okoa 5");
	                    break;
	                case 7:
	                    System.out.println("You selected: Okoa Internet");
	                    break;
	                case 98:
	                    // Display the "More" menu
	                    while (true) {
	                        System.out.println("More Menu:");
	                        System.out.println("8: Okoa Minutes");
	                        System.out.println("9: Okoa SMS");
	                        System.out.println("10: Lipa Okoa");
	                        System.out.println("#: Check Balance");
	                        System.out.println("0: BACK");
	                        System.out.print("Enter your choice: ");
	                        System.out.println(); // Add a space for readability
	                        
	                        // Read user input
	                        int moreChoice = scanner.nextInt();
	                        
	                        // Process the user's choice in the "More" menu
	                        switch (moreChoice) {
	                            case 8:
	                                System.out.println("You selected: Okoa Minutes");
	                                break;
	                            case 9:
	                                System.out.println("You selected: Okoa SMS");
	                                break;
	                            case 10:
	                                System.out.println("You selected: Lipa Okoa");
	                                break;
	                            case 0:
	                                // Go back to the main menu
	                                System.out.println("Going back to the main menu.");
	                                break;
	                            default:
	                                System.out.println("Invalid choice in the 'More' menu. Please try again.");
	                        }
	                        
	                        // Exit the "More" menu when the user chooses to go back
	                        if (moreChoice == 0) {
	                            break;
	                        }
	                    }
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}
