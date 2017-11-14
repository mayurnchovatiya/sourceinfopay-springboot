package com.sourceinfotech.paymentsystem.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


/**
 * @author Ketan
 *
 */

@Entity
public class Candidate {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int candidateId;	
		
	private String candidateName;
	private double pvRate;
	private double svRate;	

	private Date startDate;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	private PrimeVendor primeVendor;
	@OneToOne(cascade=CascadeType.ALL)
	private SubVendor subVendor;
	@OneToOne(cascade=CascadeType.ALL)
	private Employee salesEmployee;
	@OneToOne(cascade=CascadeType.ALL)
	private Employee recruiterEmployee;
	@OneToOne(cascade=CascadeType.ALL)
	private Employee managerOne;
	@OneToOne(cascade=CascadeType.ALL)
	private Employee managerTwo;
	@OneToOne(cascade=CascadeType.ALL)
	private Commission commission;

	public int getCandidateId() {
		return candidateId;
	}
	

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public PrimeVendor getPrimeVendor() {
		return primeVendor;
	}

	public void setPrimeVendor(PrimeVendor primeVendor) {
		this.primeVendor = primeVendor;
	}

	public SubVendor getSubVendor() {
		return subVendor;
	}

	public void setSubVendor(SubVendor subVendor) {
		this.subVendor = subVendor;
	}

	public String getStartDate() {
		return startDate.toString();
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Employee getSalesEmployee() {
		return salesEmployee;
	}

	public void setSalesEmployee(Employee salesEmployee) {
		this.salesEmployee = salesEmployee;
	}

	public Employee getRecruiterEmployee() {
		return recruiterEmployee;
	}

	public void setRecruiterEmployee(Employee recruiterEmployee) {
		this.recruiterEmployee = recruiterEmployee;
	}

	public Employee getManagerOne() {
		return managerOne;
	}

	public void setManagerOne(Employee managerOne) {
		this.managerOne = managerOne;
	}

	public Employee getManagerTwo() {
		return managerTwo;
	}

	public void setManagerTwo(Employee managerTwo) {
		this.managerTwo = managerTwo;
	}
	
	public double getPvRate() {
		return pvRate;
	}

	public void setPvRate(double pvRate) {
		this.pvRate = pvRate;
	}

	public double getSvRate() {
		return svRate;
	}

	public void setSvRate(double svRate) {
		this.svRate = svRate;
	}
	

	public Commission getCommission() {
		return commission;
	}

	public void setCommission(Commission commission) {
		this.commission = commission;
	}	
}