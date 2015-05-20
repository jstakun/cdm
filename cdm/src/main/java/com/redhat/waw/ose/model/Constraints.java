package com.redhat.waw.ose.model;

import java.io.Serializable;

public class Constraints implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private double betweenMin = 0d;
	private double betweenMax = Double.MAX_VALUE;
	private double gt = 0d;
	private double lt = Double.MAX_VALUE;
	
	public double getBetweenMin() {
		return betweenMin;
	}
	public void setBetweenMin(double betweenMin) {
		this.betweenMin = betweenMin;
	}
	public double getBetweenMax() {
		return betweenMax;
	}
	public void setBetweenMax(double betweenMax) {
		this.betweenMax = betweenMax;
	}
	public double getGt() {
		return gt;
	}
	public void setGt(double gt) {
		this.gt = gt;
	}
	public double getLt() {
		return lt;
	}
	public void setLt(double lt) {
		this.lt = lt;
	}
	
	
	
}
