package com.first;

import javax.persistence.Embeddable;

@Embeddable
public class PhoneNo {
	
	private int mob;
	
	private int alternativeMob;
	public PhoneNo() {
		super();
	}
	public PhoneNo(int mob, int alternativeMob) {
		super();
		this.mob = mob;
		this.alternativeMob = alternativeMob;
	}
	public int getMob() {
		return mob;
	}
	public void setMob(int mob) {
		this.mob = mob;
	}
	public int getAlternativeMob() {
		return alternativeMob;
	}
	public void setAlternativeMob(int alternativeMob) {
		this.alternativeMob = alternativeMob;
	}
	
	
	
}
