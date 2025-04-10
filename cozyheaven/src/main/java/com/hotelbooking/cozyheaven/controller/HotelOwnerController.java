package com.hotelbooking.cozyheaven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelbooking.cozyheaven.exception.InvalidIDException;
import com.hotelbooking.cozyheaven.model.HotelOwner;
import com.hotelbooking.cozyheaven.service.HotelOwnerService;

@RestController
@RequestMapping("/api/hotelowner")
public class HotelOwnerController {
	@Autowired
	private HotelOwnerService hotelOwnerService;
	
	// To Add Hotel Owner 
	
	@PostMapping("/add")
	public HotelOwner addHotelOwner(@RequestBody HotelOwner hotelOwner) {
		
		return hotelOwnerService.addHotelOwner(hotelOwner);
		
	}
	
	//To Get Owner Details
	
	@GetMapping("/get/{id}")
	public HotelOwner getOwnerByID(@PathVariable int id) throws InvalidIDException {
		return hotelOwnerService.getOwnerByID(id);
	}
	
	//To Update Owner Info
	@PutMapping("/update/{id}")
	public HotelOwner updateInfo(@PathVariable int id,@RequestBody HotelOwner hotelOwner) throws InvalidIDException {
		HotelOwner owner=hotelOwnerService.getOwnerByID(id);
		owner.setAddress(hotelOwner.getAddress());
		return hotelOwnerService.addHotelOwner(owner);
		
		
	}
	
	
	
	

}

















