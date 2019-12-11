package com.example.util;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.entity.FlightDetail;

public class FlightSearchUtil {

	public static List<FlightDetail> getFlights(FlightDetail searchFlight, FlightDetail[] flights) {

		Stream<FlightDetail> stream = Arrays.stream(flights);
		String searchFlightNumber = searchFlight.getFlightNumber();
		String searchOrigin = searchFlight.getOrigin();
		String searchDestination = searchFlight.getDestination();
//		String arrival = searchFlight.getArrival();

		return stream
				.filter(it -> it.getFlightNumber().equals(searchFlightNumber)
						|| (it.getOrigin().equals(searchOrigin) && it.getDestination().equals(searchDestination)))
				.collect(Collectors.toList());

	}

	public static boolean isValidInput(FlightDetail searchFlight) {

		boolean isInputValid = false;
		if (searchFlight != null) {
			String searchFlightNumber = searchFlight.getFlightNumber();
			String searchOrigin = searchFlight.getOrigin();
			String searchDestination = searchFlight.getDestination();
//			Date arrival = searchFlight.getArrival();
//			if (!searchFlightNumber.isEmpty() && arrival != null) {
			if (!searchFlightNumber.isEmpty()) {
				isInputValid = true;
			}
			if (searchOrigin != null || searchDestination != null) {
//				if (!searchOrigin.isEmpty() && !searchDestination.isEmpty() && arrival != null) {
				if (!searchOrigin.isEmpty() && !searchDestination.isEmpty()) {
					isInputValid = true;
				}
			}
		}
		return isInputValid;
	}
}
