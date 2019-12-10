package com.example.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.FlightsearchApplication;
import com.example.entity.FlightDetail;
import com.example.util.FlightSearchUtil;

@Controller
public class SearchController {

	@RequestMapping("search")
	public String search() {
		System.out.println("first search");
		return "search.jsp";
	}
	@RequestMapping("getsearchresults")
	public String viewSearch(FlightDetail flightDetail) {
		System.out.println("searching for"+flightDetail);
		List<FlightDetail> searchresults = FlightSearchUtil.getFlights(flightDetail, FlightsearchApplication.flights);
		System.out.println("==================================");
		System.out.println(searchresults);
		return "viewsearchresults.jsp";
	}
}
