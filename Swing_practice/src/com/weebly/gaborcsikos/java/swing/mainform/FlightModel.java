package com.weebly.gaborcsikos.java.swing.mainform;

import java.util.List;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class FlightModel implements ListModel<String> {

	List<Flight> flights = FlightFactory.generateFlights();

	@Override
	public int getSize() {
		return flights.size();
	}

	@Override
	public String getElementAt(int index) {
		return flights.get(index).toString();
	}

	@Override
	public void addListDataListener(ListDataListener l) {

	}

	@Override
	public void removeListDataListener(ListDataListener l) {

	}

}
