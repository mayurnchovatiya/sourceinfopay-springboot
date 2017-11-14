package com.sourceinfotech.paymentsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * @author Ketan
 *
 */
@Entity
public class Commission {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int commissionId;
	private double salesCommission;
	private double recruiterCommission;
	private double managerOneCommission;
	private double managerTwoCommission;	


	public Commission() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Commission(int commissionId, double salesCommission, double recruiterCommission, double managerOneCommission,
			double managerTwoCommission) {
		super();
		this.commissionId = commissionId;
		this.salesCommission = salesCommission;
		this.recruiterCommission = recruiterCommission;
		this.managerOneCommission = managerOneCommission;
		this.managerTwoCommission = managerTwoCommission;
	}


	public int getCommissionId() {
		return commissionId;
	}
	
	
	public void setCommissionId(int commissionId) {
		this.commissionId = commissionId;
	}


	public double getSalesCommission() {
		return salesCommission;
	}
	public void setSalesCommission(double salesCommission) {
		this.salesCommission = salesCommission;
	}
	public double getRecruiterCommission() {
		return recruiterCommission;
	}
	public void setRecruiterCommission(double recruiterCommission) {
		this.recruiterCommission = recruiterCommission;
	}
	public double getManagerOneCommission() {
		return managerOneCommission;
	}
	public void setManagerOneCommission(double managerOneCommission) {
		this.managerOneCommission = managerOneCommission;
	}
	public double getManagerTwoCommission() {
		return managerTwoCommission;
	}
	public void setManagerTwoCommission(double managerTwoCommission) {
		this.managerTwoCommission = managerTwoCommission;
	}	
}