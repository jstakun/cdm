package com.redhat.waw.ose.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@Table(name = "CUSTOMER")
@XmlRootElement
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CUSTOMERID")
	private String customerid;

	private String city;

	private String country;

	private String firstname;

	private String lastname;

	private String middlename;

	private String phonenumber;

	private String postalcode;

	private String stateprovince;

	private String streetaddress;

	private String streetaddress2;
	
	private Boolean isVerified;
	
	private Long verificationDateMillis;

	public Customer() {
	}

	public String getCustomerid() {
		return this.customerid;
	}

	@XmlElement
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getCity() {
		return this.city;
	}

	@XmlElement
	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	@XmlElement
	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstname() {
		return this.firstname;
	}

	@XmlElement
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	@XmlElement
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	@XmlElement
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getPhonenumber() {
		return this.phonenumber;
	}

	@XmlElement
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPostalcode() {
		return this.postalcode;
	}

	@XmlElement
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getStateprovince() {
		return this.stateprovince;
	}

	@XmlElement
	public void setStateprovince(String stateprovince) {
		this.stateprovince = stateprovince;
	}

	public String getStreetaddress() {
		return this.streetaddress;
	}

	@XmlElement
	public void setStreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}

	public String getStreetaddress2() {
		return this.streetaddress2;
	}

	@XmlElement
	public void setStreetaddress2(String streetaddress2) {
		this.streetaddress2 = streetaddress2;
	}

	public Boolean getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(Boolean isVerified) {
		this.isVerified = isVerified;
	}

	public Long getVerificationDateMillis() {
		return verificationDateMillis;
	}

	public void setVerificationDateMillis(Long verificationDateMillis) {
		this.verificationDateMillis = verificationDateMillis;
	}

}
