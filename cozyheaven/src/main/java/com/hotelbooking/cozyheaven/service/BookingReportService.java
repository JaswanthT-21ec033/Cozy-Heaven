package com.hotelbooking.cozyheaven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbooking.cozyheaven.repository.BookingReportRepository;

@Service
public class BookingReportService {
    @Autowired
    private BookingReportRepository bookingHasReportRepository;

}
