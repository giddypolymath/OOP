package exams;
import java.util.Scanner;

public class MarkSheet {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get the number of students from the user
	        System.out.println("Enter the number of students: ");
	        int numStudents = scanner.nextInt();

	        // Create arrays to store student data
	        int[][] studentMarks = new int[numStudents][5]; // Student marks for 5 subjects
	        String[] studentNames = new String[numStudents]; // Student names
	        int[] studentSerialNumbers = new int[numStudents]; // Student serial numbers

	        // Get the student details from the user
	        for (int i = 0; i < numStudents; i++) {
	            System.out.println("Enter the student serial number: ");
	            studentSerialNumbers[i] = scanner.nextInt();

	            System.out.println("Enter the student name: ");
	            studentNames[i] = scanner.next();

	            // Enter marks for each subject
	            for (int j = 0; j < 5; j++) {
	                System.out.println("Enter the marks for subject " + (j + 1) + ": ");
	                studentMarks[i][j] = scanner.nextInt();
	            }
	        }

	        // Compute the total and average marks for each student
	        int[] studentTotals = new int[numStudents];
	        double[] studentAverages = new double[numStudents];
	        for (int i = 0; i < numStudents; i++) {
	            studentTotals[i] = 0;
	            for (int j = 0; j < 5; j++) {
	                studentTotals[i] += studentMarks[i][j];
	            }
	            studentAverages[i] = (double) studentTotals[i] / 5;
	        }

	        // Compute the average marks for each subject
	        double[] unitAverages = new double[5];
	        for (int i = 0; i < 5; i++) {
	            unitAverages[i] = 0.0;
	            for (int j = 0; j < numStudents; j++) {
	                unitAverages[i] += studentMarks[j][i];
	            }
	            unitAverages[i] /= numStudents;
	        }

	        // Print the student marklist
	        System.out.println("Welcome to Student Marklist Application");
	        System.out.println("________________________________________________________________________________");
	        System.out.println("SNo\tStudent Name\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal\tAverage");
	        System.out.println("________________________________________________________________________________");
	        for (int i = 0; i < numStudents; i++) {
	            System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f%n", (i + 1), studentNames[i],
	                    studentMarks[i][0], studentMarks[i][1], studentMarks[i][2], studentMarks[i][3],
	                    studentMarks[i][4], studentTotals[i], studentAverages[i]);
	        }
	        System.out.println("________________________________________________________________________________");

	        // Print the average marks for each unit at the bottom of each unit
	        System.out.print("Average marks per unit");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("\t" + String.format("%.2f", unitAverages[i]));
	        }
	    }
	}
