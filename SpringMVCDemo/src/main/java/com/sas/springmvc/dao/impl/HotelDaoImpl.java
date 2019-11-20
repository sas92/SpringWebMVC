package com.sas.springmvc.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sas.springmvc.dao.HotelDao;
import com.sas.springmvc.model.Hotel;

@Repository
public class HotelDaoImpl implements HotelDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Hotel addHotel(Hotel hotel) {
		this.sessionFactory.getCurrentSession().save(hotel);
		return hotel;
	}

	@Override
	public void removeHotel(Integer hotelId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getAllHotels() {
		return this.sessionFactory.getCurrentSession().createQuery("from hotel").list();
	}

}
