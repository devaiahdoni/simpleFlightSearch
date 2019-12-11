package com.example.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.FlightDetail;
import com.example.fight.FlightsearchApplication;
import com.example.util.FlightSearchUtil;

@Controller
public class SearchController {

	@RequestMapping("search")
	public String search() {
		return "search";
	}

	@RequestMapping("getsearchresults")
	public ModelAndView viewSearch(FlightDetail searchFlight) {
//		System.out.println("searching for"+flightDetail);
		ModelAndView mv = null;
		if (FlightSearchUtil.isValidInput(searchFlight)) {
			mv = new ModelAndView("viewsearchresults");

			List<FlightDetail> searchresults = FlightSearchUtil.getFlights(searchFlight,
					FlightsearchApplication.flights);
			mv.addObject("searchresults", searchresults);
		} else {
			mv = new ModelAndView("error");
			mv.addObject("searchinput", searchFlight);

		}
//		System.out.println(searchresults);
		return mv;
	}
}
