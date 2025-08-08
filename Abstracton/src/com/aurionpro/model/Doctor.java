package com.aurionpro.model;

public class Doctor extends HospitalStaff {
	
	private String specialization;
	private String[] patients;
	
	public Doctor(int id, String name,String dep, String specialization, String[] patients) {
		super(id, name, dep);
		this.specialization = specialization;
		this.patients = patients;
	}

	@Override
	public void work() {		
		System.out.println("The doctor is specialized in "+specialization);
	}
	
	@Override
	 public String toString() {
		String patientList = String.join(", ", patients);
	        return super.toString() + "Specialization: "+ specialization +"patients: "+patientList;
	    }

}
