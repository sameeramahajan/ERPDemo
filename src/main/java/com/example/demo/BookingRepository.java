package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.HotelBooking;

@Repository
public interface BookingRepository extends JpaRepository<HotelBooking, Long>{
	
	List<HotelBooking> findBypriceperNightLessThan(double price);
}
