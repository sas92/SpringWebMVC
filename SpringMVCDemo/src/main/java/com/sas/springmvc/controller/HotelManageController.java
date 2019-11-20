package com.sas.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sas.springmvc.model.Hotel;
import com.sas.springmvc.service.HotelManageService;

@RestController
@RequestMapping("/hotels")
public class HotelManageController {
	@Autowired
	HotelManageService hotelManageService;

	@PostMapping
	public Hotel addHotel(@ModelAttribute Hotel hotel) {
		return hotelManageService.addHotel(hotel);
	}
	
	@GetMapping
	public List<Hotel> getAllHotels() {
		return hotelManageService.getAllHotels();
	}
}
