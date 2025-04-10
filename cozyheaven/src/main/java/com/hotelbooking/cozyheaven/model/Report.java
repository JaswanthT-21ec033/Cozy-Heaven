package com.hotelbooking.cozyheaven.model;

import java.time.LocalDate;

import com.hotelbooking.cozyheaven.enums.RoomType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Report {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private String reportName;

	@Column(nullable = false)
	private double revenueGenerated;

	@Column(nullable = false)
	private LocalDate generatedDate;

	@Column(nullable = false)
	private int month;

	@Column(nullable = false)
	private int year;

	@Column(nullable = false)
	private int totalBooking;

	@Column(nullable = false)
	private int totalRefund;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private RoomType roomType;

	@Column(nullable = false)
	private int totalRooms;

	@Column(nullable = false)
	private int bookedRooms;

	@Column(nullable = false)
	private int occupancyRate;

	@Column(nullable = false)
	private String couponUsed;

	@Column(nullable = false)
	private float avgBooking;

	@Column(nullable = false)
	private LocalDate validFrom;

	@Column(nullable = false)
	private LocalDate validTo;

	@Column(nullable = false)
	private int usageCount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public double getRevenueGenerated() {
		return revenueGenerated;
	}

	public void setRevenueGenerated(double revenueGenerated) {
		this.revenueGenerated = revenueGenerated;
	}

	public LocalDate getGeneratedDate() {
		return generatedDate;
	}

	public void setGeneratedDate(LocalDate generatedDate) {
		this.generatedDate = generatedDate;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTotalBooking() {
		return totalBooking;
	}

	public void setTotalBooking(int totalBooking) {
		this.totalBooking = totalBooking;
	}

	public int getTotalRefund() {
		return totalRefund;
	}

	public void setTotalRefund(int totalRefund) {
		this.totalRefund = totalRefund;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public int getTotalRooms() {
		return totalRooms;
	}

	public void setTotalRooms(int totalRooms) {
		this.totalRooms = totalRooms;
	}

	public int getBookedRooms() {
		return bookedRooms;
	}

	public void setBookedRooms(int bookedRooms) {
		this.bookedRooms = bookedRooms;
	}

	public int getOccupancyRate() {
		return occupancyRate;
	}

	public void setOccupancyRate(int occupancyRate) {
		this.occupancyRate = occupancyRate;
	}

	public String getCouponUsed() {
		return couponUsed;
	}

	public void setCouponUsed(String couponUsed) {
		this.couponUsed = couponUsed;
	}

	public float getAvgBooking() {
		return avgBooking;
	}

	public void setAvgBooking(float avgBooking) {
		this.avgBooking = avgBooking;
	}

	public LocalDate getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	public LocalDate getValidTo() {
		return validTo;
	}

	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}

	public int getUsageCount() {
		return usageCount;
	}

	public void setUsageCount(int usageCount) {
		this.usageCount = usageCount;
	}

}
