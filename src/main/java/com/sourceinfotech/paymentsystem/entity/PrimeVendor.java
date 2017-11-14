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
public class PrimeVendor {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int primeVendorId;
	private String pvName;
	private String pvContactPerson;
	private String pvAddress;
	private String pvTelephone;
	private String pvEmail;
	private String pvFax;
	
	public PrimeVendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PrimeVendor(int primeVendorId, String pvName, String pvContactPerson, String pvAddress, String pvTelephone,
			String pvEmail, String pvFax) {
		super();
		this.primeVendorId = primeVendorId;
		this.pvName = pvName;
		this.pvContactPerson = pvContactPerson;
		this.pvAddress = pvAddress;
		this.pvTelephone = pvTelephone;
		this.pvEmail = pvEmail;
		this.pvFax = pvFax;
	}
	public int getPrimeVendorId() {
		return primeVendorId;
	}
	public String getPvName() {
		return pvName;
	}
	public void setPvName(String pvName) {
		this.pvName = pvName;
	}
	public String getPvContactPerson() {
		return pvContactPerson;
	}
	public void setPvContactPerson(String pvContactPerson) {
		this.pvContactPerson = pvContactPerson;
	}
	public String getPvAddress() {
		return pvAddress;
	}
	public void setPvAddress(String pvAddress) {
		this.pvAddress = pvAddress;
	}
	public String getPvTelephone() {
		return pvTelephone;
	}
	public void setPvTelephone(String pvTelephone) {
		this.pvTelephone = pvTelephone;
	}
	public String getPvEmail() {
		return pvEmail;
	}
	public void setPvEmail(String pvEmail) {
		this.pvEmail = pvEmail;
	}
	public String getPvFax() {
		return pvFax;
	}
	public void setPvFax(String pvFax) {
		this.pvFax = pvFax;
	}

}