package com.training;

public class Address {

	private String flatNumber;
	private String streetName;
	private String cityName;
	private String pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String flatNumber, String streetName, String cityName, String pincode) {
		super();
		this.flatNumber = flatNumber;
		this.streetName = streetName;
		this.cityName = cityName;
		this.pincode = pincode;
	}
	public String getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [flatNumber=" + flatNumber + ", streetName=" + streetName + ", cityName=" + cityName
				+ ", pincode=" + pincode + "]";
	}
	
	
}
