package task9;

import java.util.Scanner;

public class Palindrome {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();
	        
	        if (isPalindrome(input)) {
	            System.out.println("The given string is a palindrome.");
	        } else {
	            System.out.println("The given string is not a palindrome.");
	        }
	    }
	    
	    public static boolean isPalindrome(String str) {
	        
	        str = str.replaceAll(" ", "").toLowerCase();
	        
	        int length = str.length();
	        
	        for (int i = 0; i < length / 2; i++) {
	            if (str.charAt(i) != str.charAt(length - i - 1)) {
	                return false; 
	            }
	        }
	        
	        return true;
	    }
	}


