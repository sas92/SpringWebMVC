package com.sas.springmvc.dao;

import java.util.List;

import com.sas.springmvc.model.Hotel;

public interface HotelDao {
	public Hotel addHotel(Hotel hotel);

	public void removeHotel(Integer hotelId);
	
	public Hotel updateHotel(Hotel hotel);
	
	public List<Hotel> getAllHotels();	
}
