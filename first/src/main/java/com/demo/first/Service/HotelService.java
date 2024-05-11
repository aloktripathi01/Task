package com.demo.first.Service;

import java.util.List;

import com.demo.first.Entity.Hotel;

public interface HotelService {

	
Hotel create(Hotel hotel);
	
	List<Hotel> getAll();
	
	Hotel get(String id);
}
