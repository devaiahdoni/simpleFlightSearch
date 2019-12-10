package com.example.util;

import java.util.Arrays;
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
		
		return stream
				.filter(it -> it.getFlightNumber().equals(searchFlightNumber)
						|| (it.getOrigin().equals(searchOrigin) && it.getDestination().equals(searchDestination)))
				.collect(Collectors.toList());

	}
}
