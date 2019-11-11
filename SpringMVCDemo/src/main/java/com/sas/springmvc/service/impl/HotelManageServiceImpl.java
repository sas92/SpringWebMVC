package com.sas.springmvc.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sas.springmvc.dao.HotelDao;
import com.sas.springmvc.model.Hotel;
import com.sas.springmvc.service.HotelManageService;

@Service
public class HotelManageServiceImpl implements HotelManageService {
	@Autowired
	private HotelDao hotelDao;

	@Override
	@Transactional
	public Hotel addHotel(Hotel hotel) {
		return hotelDao.addHotel(hotel);
	}

	@Override
	@Transactional
	public void removeHotel(Integer hotelId) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public Hotel updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Hotel> getAllHotels() {
		return hotelDao.getAllHotels();
	}

}
