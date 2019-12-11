package com.example.entity;

import java.util.Date;

import com.example.util.DateHandler;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class FlightDetail {

	String flightNumber;
	String carrier;
	String origin;
	@JsonDeserialize(using = DateHandler.class)
	Date departure;
	String destination;
	@JsonDeserialize(using = DateHandler.class)
	Date arrival;
	String aircraft;
	String distance;
	String travelTime;
	String status;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Date getDeparture() {
		return departure;
	}

	public void setDeparture(Date departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getArrival() {
		return arrival;
	}

	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}

	public String getAircraft() {
		return aircraft;
	}

	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

//	@DateTimeFormat(iso = DateTimeFormat.ISO_TIME)
	public String getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "FlightDetails [flightNumber=" + flightNumber + ", carrier=" + carrier + ", origin=" + origin
				+ ", departure=" + departure + ", destination=" + destination + ", arrival=" + arrival + ", aircraft="
				+ aircraft + ", distance=" + distance + ", travelTime=" + travelTime + ", status=" + status + "]";
	}

}
