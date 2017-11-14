package com.sourceinfotech.paymentsystem.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate(value=true)
public class Transactions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int transactionId;
	
	@ManyToOne(optional=true)
	@JoinColumn(name="candidateid")	
	private Candidate candidate;
	
	
	private Date startdate;
		
	private Date enddate;
	
	private Date primevendorpaiddate;
	
	@JoinColumn(name="primevendorid")
	@ManyToOne(optional=true)
	private PrimeVendor primevendorid;
	
	@Column(nullable=true)
	private double primevendorrate;
	
	@Column(nullable=true)
	private double totalHours;
	
	@Column(nullable=true)
	private double deductions;
	
	@Column(nullable=true)
	private double primevendorExpectedAmount;
	
	@Column(nullable=true)
	private double primevendorActualPayment;
	
	@Column(nullable=true)
	private String deductionstobepassedtosubvendor;
	
	@Column(nullable=true)
	private String primevendorpaidstatus;
	
	@Column(nullable=true)
	private int primevendorinvoicenumber;
	
	@Lob
	@Column(nullable=true)
	private String primevendorcomments;
	
	
	@ManyToOne(optional=true)
	@JoinColumn(name="sub_vendor_id")
	private SubVendor subvendorid;
	
	@Column(nullable=true)
	private double subvendorrate;
	
	@Column(nullable=true)
	private double subvendoramount;
	
	@Column(nullable=true)
	private Date subvendorpaiddate;
	
	@Column(nullable=true)
	private String subvendorpaidstatus;
	
	@Column(nullable=true)
	private int sub_vendorinvoicenumber;
	
	@Column(nullable=true)
	private double subvendordeductions;
	
	@Lob
	@Column(nullable=true)
	private String subvendorcomments;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public Date getPrimevendorpaiddate() {
		return primevendorpaiddate;
	}

	public void setPrimevendorpaiddate(Date primevendorpaiddate) {
		this.primevendorpaiddate = primevendorpaiddate;
	}

	public PrimeVendor getPrimevendorid() {
		return primevendorid;
	}

	public void setPrimevendorid(PrimeVendor primevendorid) {
		this.primevendorid = primevendorid;
	}

	public double getPrimevendorrate() {
		return primevendorrate;
	}

	public void setPrimevendorrate(double primevendorrate) {
		this.primevendorrate = primevendorrate;
	}

	public double getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(double totalHours) {
		this.totalHours = totalHours;
	}

	public double getDeductions() {
		return deductions;
	}

	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}

	public double getPrimevendorExpectedAmount() {
		return primevendorExpectedAmount;
	}

	public void setPrimevendorExpectedAmount(double primevendorExpectedAmount) {
		this.primevendorExpectedAmount = primevendorExpectedAmount;
	}

	public double getPrimevendorActualPayment() {
		return primevendorActualPayment;
	}

	public void setPrimevendorActualPayment(double primevendorActualPayment) {
		this.primevendorActualPayment = primevendorActualPayment;
	}

	public String getDeductionstobepassedtosubvendor() {
		return deductionstobepassedtosubvendor;
	}

	public void setDeductionstobepassedtosubvendor(String deductionstobepassedtosubvendor) {
		this.deductionstobepassedtosubvendor = deductionstobepassedtosubvendor;
	}

	public String getPrimevendorpaidstatus() {
		return primevendorpaidstatus;
	}

	public void setPrimevendorpaidstatus(String primevendorpaidstatus) {
		this.primevendorpaidstatus = primevendorpaidstatus;
	}

	public int getPrimevendorinvoicenumber() {
		return primevendorinvoicenumber;
	}

	public void setPrimevendorinvoicenumber(int primevendorinvoicenumber) {
		this.primevendorinvoicenumber = primevendorinvoicenumber;
	}

	public String getPrimevendorcomments() {
		return primevendorcomments;
	}

	public void setPrimevendorcomments(String primevendorcomments) {
		this.primevendorcomments = primevendorcomments;
	}

	public SubVendor getSubvendorid() {
		return subvendorid;
	}

	public void setSubvendorid(SubVendor subvendorid) {
		this.subvendorid = subvendorid;
	}

	public double getSubvendorrate() {
		return subvendorrate;
	}

	public void setSubvendorrate(double subvendorrate) {
		this.subvendorrate = subvendorrate;
	}

	public double getSubvendoramount() {
		return subvendoramount;
	}

	public void setSubvendoramount(double subvendoramount) {
		this.subvendoramount = subvendoramount;
	}

	public Date getSubvendorpaiddate() {
		return subvendorpaiddate;
	}

	public void setSubvendorpaiddate(Date subvendorpaiddate) {
		this.subvendorpaiddate = subvendorpaiddate;
	}

	public String getSubvendorpaidstatus() {
		return subvendorpaidstatus;
	}

	public void setSubvendorpaidstatus(String subvendorpaidstatus) {
		this.subvendorpaidstatus = subvendorpaidstatus;
	}

	public int getSub_vendorinvoicenumber() {
		return sub_vendorinvoicenumber;
	}

	public void setSub_vendorinvoicenumber(int sub_vendorinvoicenumber) {
		this.sub_vendorinvoicenumber = sub_vendorinvoicenumber;
	}

	public String getSubvendorcomments() {
		return subvendorcomments;
	}

	public void setSubvendorcomments(String subvendorcomments) {
		this.subvendorcomments = subvendorcomments;
	}

	public double getSubvendordeductions() {
		return subvendordeductions;
	}

	public void setSubvendordeductions(double subvendordeductions) {
		this.subvendordeductions = subvendordeductions;
	}
	
	
	
}
