package task9;
	
	import java.util.Scanner;

	public class PatternPrint {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of lines (Sample input: 5): ");
	        int n = scanner.nextInt();
	        scanner.close();

	        if (n % 2 == 0) {
	            System.out.println("Please enter an odd number.");
	            return;
	        }

	        int spaces = 0;
	        for (int i = 1; i <= n; i++) {
	            int stars = n - spaces;

	            for (int j = 1; j <= spaces; j++) {
	                System.out.print(" ");
	            }

	            for (int j = 1; j <= stars; j++) {
	                System.out.print("*");
	                if (j < stars) {
	                    System.out.print(" ");
	                }
	            }

	            System.out.println();

	            if (i < n / 2 + 1) {
	                spaces++;
	            } else {
	                spaces--;
	            }
	        }
	    }
	}

