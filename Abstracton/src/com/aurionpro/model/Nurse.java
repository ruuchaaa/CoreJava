package com.aurionpro.model;

public class Nurse extends HospitalStaff{
	
	public Nurse(int staffId, String name, String dep, String shift) {
		super(staffId, name, dep);
		this.shift=shift;
	}

	String shift;

	@Override
	public void work() {
		System.out.println("The nurse "+name+" assistes the doctor during the "+shift+" shift");
	}
	
	@Override
	 public String toString() {
		
	        return super.toString() +"Shift: "+ shift;
	    }

}
