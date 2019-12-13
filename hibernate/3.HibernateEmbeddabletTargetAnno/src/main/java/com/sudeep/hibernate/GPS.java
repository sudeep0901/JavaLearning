package com.sudeep.hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class GPS implements Coordinates {
	private double latitude;

	private double longitude;

	public GPS(double d, double e) {
		// TODO Auto-generated constructor stub
		this.latitude =d;
		this.longitude = e;
		
	}

	public double x() {
		// TODO Auto-generated method stub
		return latitude;
	}

	public double y() {
		// TODO Auto-generated method stub
		return longitude;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	}
