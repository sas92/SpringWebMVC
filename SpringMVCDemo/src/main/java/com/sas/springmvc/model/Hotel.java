package com.sas.springmvc.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel implements Serializable {
	private static final long serialVersionUID = -8974043406225807724L;

	@Column(name = "hotel_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hotelId;

	@Column(nullable = false, length = 30)
	private String name;

	@Column(nullable = false, length = 100)
	private String address;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "room_id")
	private List<Room> rooms;

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
}
