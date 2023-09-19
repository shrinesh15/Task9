package task9;

	import java.util.Scanner;

	public class GradingSystem { 
		
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the student's mark: ");
	        int mark = scanner.nextInt();
	        scanner.close();

	        if (mark < 0 || mark > 100) {
	            System.out.println("Invalid Input");
	        } else {

	            char grade;
	            if (mark >= 90) {
	                grade = 'A';
	            } else if (mark >= 80) {
	                grade = 'B';
	            } else if (mark >= 70) {
	                grade = 'C';
	            } else if (mark >= 60) {
	                grade = 'D';
	            } else if (mark >= 50) {
	                grade = 'E';
	            } else {
	                grade = 'F';
	            }

	            System.out.println("The grade is: " + grade);
	        }
	    }
	}


