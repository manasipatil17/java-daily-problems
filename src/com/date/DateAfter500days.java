package com.date;

import java.time.LocalDate;

public class DateAfter500days {
//print date after 500 days from today
	
	
	public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        LocalDate futureDate = today.plusDays(500);

        System.out.println("Today's date: " + today);
        System.out.println("Date after 500 days: " + futureDate);
    }
}
