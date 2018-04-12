package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.HotelBooking;

@Component
public class DatabaseSeeder implements CommandLineRunner{

	private BookingRepository bookingRepository;
	
	@Autowired
	public DatabaseSeeder(BookingRepository bookingRepository) {
		this.bookingRepository = bookingRepository;
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		List<HotelBooking> bookings = new ArrayList<>();
		
		bookings.add(new HotelBooking("Marriot", 3000, 2));
		bookings.add(new HotelBooking("Lemon Tree", 2000, 3));
		bookings.add(new HotelBooking("Taj", 5000, 2));
		
		bookingRepository.save(bookings);
	}

}
