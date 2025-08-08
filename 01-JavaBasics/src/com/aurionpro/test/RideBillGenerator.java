package com.aurionpro.test;
import java.util.Scanner;
public class RideBillGenerator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Height");
		int height = scanner.nextInt();
		
		if(height<120) {
			System.out.println("Person can't Ride");
		}
		else {
			int bill = 0;
			System.out.println("Enter Age");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter whether you want photos or dont");
			String wantPhotos = scanner.nextLine();
			System.out.println("Person can Ride");{
			if(age<=12) {
				bill = 5;
			}
			else if(age>=18 && age<=44) {
				bill = 12;
			}
			else if(age>=45 && age<=55) {
				bill = 0;
			}
			else {
				bill = 7;
			}	}
			switch(wantPhotos) {
			case "Yes":
				bill += 3;
				break;
			case "no":
				bill +=0;
				break;
				
		    default:
		    	System.out.println("enter valid char");
		    	break;
		    	
			}
			System.out.println("The total bill generated is "+bill);
		}
		
		
		
	}

}
//equalignorecase
