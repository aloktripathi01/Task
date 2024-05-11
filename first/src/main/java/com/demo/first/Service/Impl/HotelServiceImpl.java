package com.demo.first.Service.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.first.Entity.Hotel;
import com.demo.first.Service.HotelService;
import com.demo.first.exception.ResourceNotFoundException;
import com.demo.first.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {
 @Autowired
 private HotelRepository hotelRepository;
	
	public Hotel create(Hotel hotel) {
		String hotelId= UUID.randomUUID().toString();
		hotel.setId(hotelId);
		// TODO Auto-generated method stub
		return hotelRepository.save(hotel);
	}

	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	
	public Hotel get(String id) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("hotel with given id not found"));
	}

}


