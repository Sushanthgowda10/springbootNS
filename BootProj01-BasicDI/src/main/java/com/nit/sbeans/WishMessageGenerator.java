package com.nit.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	private LocalDateTime ldt;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator - 0 param Constructor");
	}

	// b.method
	public String ShowWishMessage(String user) {
		System.out.println("WishMessageGenerator.ShowWishMessage()");
		int hour = ldt.getHour();
		if (hour < 12)
			return "Good Morning : " + user;
		else if (hour < 16)
			return "Good AfterNoon: " + user;
		else if (hour < 20)
			return "Good Evening: " + user;
		else
			return "Good Night: " + user;

	}

}
