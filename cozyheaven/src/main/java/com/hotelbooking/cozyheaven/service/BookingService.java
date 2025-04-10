package com.hotelbooking.cozyheaven.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbooking.cozyheaven.exception.InvalidIDException;
import com.hotelbooking.cozyheaven.model.Booking;
import com.hotelbooking.cozyheaven.model.Room;
import com.hotelbooking.cozyheaven.repository.BookingRepository;

@Service
public class BookingService 
{
	@Autowired
	private BookingRepository bookingRepository;

	public Booking createBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepository.save(booking);
	}

	public Booking getBookingById(int bookingId) throws InvalidIDException {
		// TODO Auto-generated method stub
		Optional<Booking> optional = bookingRepository.findById(bookingId);
		if(optional.isEmpty())
		{
			throw new InvalidIDException("booking ID is invalid...");
		}
		return optional.get();
	}

	public Booking getBookingsByCustomer(int userId) throws InvalidIDException {
		// TODO Auto-generated method stub
		Optional<Booking> optional = bookingRepository.findByCustomerId(userId);
		if(optional.isEmpty())
		{
			throw new InvalidIDException("customer ID is invalid...");
		}
		return optional.get();
	}

	public Booking getBookingsByRoom(int roomId) throws InvalidIDException {
		// TODO Auto-generated method stub
		Optional<Booking> optional = bookingRepository.findByRoomId(roomId);
		if(optional.isEmpty())
		{
			throw new InvalidIDException("room ID is invalid...");
		}
		return optional.get();
	}

	public void cancelBooking(int bookingId) 
	{
		// TODO Auto-generated method stub
		bookingRepository.deleteById(bookingId);
	}

	public List<Booking> getAllBooking() {
		// TODO Auto-generated method stub
		return bookingRepository.findAll();
	}

}
