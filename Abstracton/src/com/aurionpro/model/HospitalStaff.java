package com.aurionpro.model;

public abstract class HospitalStaff {
	int staffId;
	String name;
	String dep;
	
	public HospitalStaff(int staffId, String name, String dep) {
		this.staffId = staffId;
		this.name=name;
		this.dep=dep;
	}
	public abstract void work();
	@Override
	 public String toString() {
	        return "ID: " + staffId + ", Name: " + name + ", Department: " + dep;
	    }

}
