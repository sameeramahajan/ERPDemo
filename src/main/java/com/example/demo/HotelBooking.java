package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotelBooking {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long Id;
	private String hotelName;
	private double priceperNight;
	private int noNight;
	
	public HotelBooking() {
		
	}
	
	public HotelBooking(String hotelName, double priceperNight, int noNight) {
		this.hotelName = hotelName;
		this.priceperNight = priceperNight;
		this.noNight = noNight;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	
	public int getNoNight() {
		return noNight;
	}
	
	public double getPriceperNight() {
		return priceperNight;
	}
	
	public double getTotalPrice() {
		return priceperNight*noNight;
	}
	
	public Long getId() {
		return Id;
	}
}

