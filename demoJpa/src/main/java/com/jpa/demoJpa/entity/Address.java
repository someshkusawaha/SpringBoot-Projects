package com.jpa.demoJpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addressId;
	
	private String country;
	
	private String state;
	
	private String city;
	
	private String pincode;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [addressId=");
		builder.append(addressId);
		builder.append(", country=");
		builder.append(country);
		builder.append(", state=");
		builder.append(state);
		builder.append(", city=");
		builder.append(city);
		builder.append(", pincode=");
		builder.append(pincode);
		builder.append("]");
		return builder.toString();
	}
	
	
}
