package com.revature.controllers;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.services.ConvertTimeToWords;


@RestController
@RequestMapping("/time")
@CrossOrigin
public class CurrentTimeController {

	@Autowired
	ConvertTimeToWords timeService;
	
	@GetMapping
	public String getCurrentTimeInWords() {
		
		Date dt = new Date();
		int hour = dt.getHours();
		int minute = dt.getMinutes();
		if (hour < 12) {
			hour = hour - 12;
		}
		return timeService.timeInWords(hour, minute);
	}
	
	
	
}
