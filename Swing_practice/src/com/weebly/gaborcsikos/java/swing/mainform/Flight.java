/**
 * 
 */
package com.weebly.gaborcsikos.java.swing.mainform;

import java.util.Date;

/**
 * @author Gabor Csikos
 * 
 */
public class Flight {

	// Enum would be better, but in this example it can stay
	private boolean firstClass;
	private boolean business;
	private boolean tourist;
	private String from;
	private String to;
	private Date start;
	private Date arrival;

	public Flight(boolean firstClass, boolean business, boolean tourist,
			String from, String to, Date start, Date arrival) {
		super();
		this.firstClass = firstClass;
		this.business = business;
		this.tourist = tourist;
		this.from = from;
		this.to = to;
		this.start = start;
		this.arrival = arrival;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (firstClass) {
			sb.append("First class ticket ");
		} else if (business) {
			sb.append("Business class ticket ");
		} else if (tourist) {
			sb.append("Tourist class ticket ");
		}
		sb.append("from: ");
		sb.append(from + " ");
		sb.append(", to:" + to + " ");
		sb.append("start:" + start + " arrive:" + arrival);

		return sb.toString();
	}

	public boolean isFirstClass() {
		return firstClass;
	}

	public void setFirstClass(boolean firstClass) {
		this.firstClass = firstClass;
	}

	public boolean isBusiness() {
		return business;
	}

	public void setBusiness(boolean business) {
		this.business = business;
	}

	public boolean isTourist() {
		return tourist;
	}

	public void setTourist(boolean tourist) {
		this.tourist = tourist;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getArrival() {
		return arrival;
	}

	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}

}
