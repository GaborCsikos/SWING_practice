/**
 * 
 */
package com.weebly.gaborcsikos.java.swing.mainform;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author Gabor Csikos
 * 
 */
public class FlightFactory {

	public static final String[] FLIGHTS = { "Budapest", "Moscow", "Kazahstan" };

	public static final int ROWS = 7;

	public static List<Flight> generateFlights() {
		List<Flight> flights = new ArrayList<Flight>();

		flights.add(new Flight(false, true, false, "Budapest", "Moscow",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(true, false, false, "Budapest", "Moscow",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(false, false, true, "Budapest", "Moscow",
				createDate(11, 30), createDate(13, 30)));

		flights.add(new Flight(false, true, false, "Budapest", "Kazahstan",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(true, false, false, "Budapest", "Kazahstan",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(false, false, true, "Budapest", "Kazahstan",
				createDate(11, 30), createDate(13, 30)));

		flights.add(new Flight(false, true, false, "Budapest", "Moscow",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(true, false, false, "Budapest", "Moscow",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(false, false, true, "Budapest", "Moscow",
				createDate(11, 30), createDate(13, 30)));

		flights.add(new Flight(false, true, false, "Budapest", "Kazahstan",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(true, false, false, "Budapest", "Kazahstan",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(false, false, true, "Budapest", "Kazahstan",
				createDate(11, 30), createDate(13, 30)));

		flights.add(new Flight(false, true, false, "Budapest", "Moscow",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(true, false, false, "Budapest", "Moscow",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(false, false, true, "Budapest", "Moscow",
				createDate(11, 30), createDate(13, 30)));

		flights.add(new Flight(false, true, false, "Budapest", "Kazahstan",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(true, false, false, "Budapest", "Kazahstan",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(false, false, true, "Budapest", "Kazahstan",
				createDate(11, 30), createDate(13, 30)));

		flights.add(new Flight(false, true, false, "Moscow", "Budapest",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(true, false, false, "Moscow", "Budapest",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(false, false, true, "Moscow", "Budapest",
				createDate(11, 30), createDate(13, 30)));

		flights.add(new Flight(false, true, false, "Moscow", "Kazahstan",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(true, false, false, "Moscow", "Kazahstan",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(false, false, true, "Moscow", "Kazahstan",
				createDate(11, 30), createDate(13, 30)));

		flights.add(new Flight(false, true, false, "Kazahstan", "Moscow",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(true, false, false, "Kazahstan", "Moscow",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(false, false, true, "Kazahstan", "Moscow",
				createDate(11, 30), createDate(13, 30)));

		flights.add(new Flight(false, true, false, "Kazahstan", "Budapest",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(true, false, false, "Kazahstan", "Budapest",
				createDate(11, 30), createDate(13, 30)));
		flights.add(new Flight(false, false, true, "Kazahstan", "Budapest",
				createDate(11, 30), createDate(13, 30)));
		return flights;
	}

	/**
	 * Only hours and minutes are important in this example
	 * 
	 * @param hour
	 * @param minute
	 * @return
	 */
	public static Date createDate(int hour, int minute) {
		Date date = new Date();
		GregorianCalendar calendar = new GregorianCalendar(2016, 2, 15, 11, 30,
				00);
		date.setTime(calendar.getTimeInMillis());
		return date;
	}
}
