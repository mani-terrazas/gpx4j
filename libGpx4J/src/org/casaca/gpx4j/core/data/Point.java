package org.casaca.gpx4j.core.data;

import java.util.Calendar;

public class Point extends BaseObject {
	private Double elevation;
	private Calendar date;
	private Double latitude;
	private Double longitude;
	
	public Point(Double elevation, Calendar date, Double latitude, Double longitude) throws IllegalArgumentException{
		if(latitude == null || longitude == null) throw new IllegalArgumentException("Latitude and longitude must not be null");
		
		this.elevation = elevation;
		this.date = date;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Point(Double latitude, Double longitude){
		if(latitude == null || longitude == null) throw new IllegalArgumentException("Latitude and longitude must not be null");
		
		this.elevation = null;
		this.date = null;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Double getElevation() {
		return elevation;
	}

	public void setElevation(Double elevation) {
		this.elevation = elevation;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}
}