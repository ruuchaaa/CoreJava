package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Doctor;
import com.aurionpro.model.HospitalStaff;
import com.aurionpro.model.Nurse;

public class HospitalStafftest {
	
	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter number of staff members: ");
	        int n = scanner.nextInt();
	        scanner.nextLine();

	        HospitalStaff[] hosp = new HospitalStaff[n];
	        
	        for (int i = 0; i < n; i++) {
	            System.out.println("\nIs the staff a Doctor or Nurse? (Enter 'doctor' or 'nurse')");
	            String type = scanner.nextLine().toLowerCase();

	            System.out.print("Enter staff ID: ");
	            int id = scanner.nextInt();
	            scanner.nextLine();

	            System.out.print("Enter name: ");
	            String name = scanner.nextLine();

	            System.out.print("Enter department: ");
	            String department = scanner.nextLine();

	            if (type.equals("doctor")) {
	                System.out.print("Enter specialization: ");
	                String specialization = scanner.nextLine();

	                System.out.print("Enter number of patients: ");
	                int pCount = scanner.nextInt();
	                scanner.nextLine();

	                String[] patients = new String[pCount];
	                for (int j = 0; j < pCount; j++) {
	                    System.out.print("Enter patient " + (j + 1) + " name: ");
	                    patients[j] = scanner.nextLine();
	                }

	                hosp[i] = new Doctor(id, name, department, specialization, patients);
	            } else if (type.equals("nurse")) {
	                System.out.print("Enter shift timing (Morning/Evening/Night): ");
	                String shift = scanner.nextLine();
	                hosp[i] = new Nurse(id, name, department, shift);
	            }
		
	        }
	            System.out.println("\n--- Staff Details ---");
	            for (HospitalStaff staff : hosp) {
	                System.out.println(staff);  
	                staff.work();               
	                System.out.println();      
	            }
		
	}
	}

