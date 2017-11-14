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
public class SubVendor {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int subVendorId;
	private String svName;
	private String svContactPerson;
	private String svAddress;
	private String svTelephone;
	private String svEmail;
	private String svFax;
	
	

	public SubVendor() {
		super();
		// TODO Auto-generated constructor stub
	}



	public SubVendor(int subVendorId, String svName, String svContactPerson, String svAddress, String svTelephone,
			String svEmail, String svFax) {
		super();
		this.subVendorId = subVendorId;
		this.svName = svName;
		this.svContactPerson = svContactPerson;
		this.svAddress = svAddress;
		this.svTelephone = svTelephone;
		this.svEmail = svEmail;
		this.svFax = svFax;
	}



	public int getSubVendorId() {
		return subVendorId;
	}

	public String getSvName() {
		return svName;
	}



	public void setSvName(String svName) {
		this.svName = svName;
	}



	public String getSvContactPerson() {
		return svContactPerson;
	}



	public void setSvContactPerson(String svContactPerson) {
		this.svContactPerson = svContactPerson;
	}



	public String getSvAddress() {
		return svAddress;
	}



	public void setSvAddress(String svAddress) {
		this.svAddress = svAddress;
	}



	public String getSvTelephone() {
		return svTelephone;
	}



	public void setSvTelephone(String svTelephone) {
		this.svTelephone = svTelephone;
	}



	public String getSvEmail() {
		return svEmail;
	}



	public void setSvEmail(String svEmail) {
		this.svEmail = svEmail;
	}



	public String getSvFax() {
		return svFax;
	}



	public void setSvFax(String svFax) {
		this.svFax = svFax;
	}
	
}