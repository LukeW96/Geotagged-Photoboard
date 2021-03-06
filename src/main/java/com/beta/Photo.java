package com.beta;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Photo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long photoID;
	private double lat;
	private double lon;
	private String description = "";
	private String address = "";
	private String date;
	private int status;
	private int meta;
	private String event;

	protected Photo() {
	}

	Photo(String description, double lat, double lon, String address, String d, int status, String event, int meta) {
		this.description = description;
		this.lat = lat;
		this.address = address;
		this.lon = lon;
		this.date = d;
		this.status = status;
		this.event = event;
		this.meta = meta;
	}

	public long getID() {
		return this.photoID;
	}

	@Column(columnDefinition = "TINYINT")
	public int getMeta() {
		return this.meta;
	}

	public String getDesc() {
		return this.description;
	}

	public double getLat() {
		return this.lat;
	}

	public double getLon() {
		return this.lon;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}
	
	public void setMeta(int meta) {
		this.meta = meta;
	}

	public String getDate() {
		return this.date;
	}

	public int getStatus() {
		return this.status;
	}

	public String getAddress() {
		return this.address;
	}

	public String getEvent() {
		return this.event;
	}

}
