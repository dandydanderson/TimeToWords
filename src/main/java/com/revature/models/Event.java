package com.revature.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * Our entity for the event table
 * 
 * @author David Anderson
 *
 */
@Entity
@Table(name = "events")
public class Event {
	
	@Id
	@Column(name = "eventId")
	private int eventid;
	
	@Column(name = "eventName")
	private String eventName;
	
	@Column(name = "eventLocation")
	private String eventLocation;
	
	@Column(name = "eventDate")
	private LocalDate eventDate;
	
	@Column(name = "eventHour")
	private int eventHour;
	
	@Column(name = "eventMinute")
	private int eventMinute;
	
	@Column(name = "afternoon")
	private boolean afternoon;

	public int getEventid() {
		return eventid;
	}

	public void setEventid(int eventid) {
		this.eventid = eventid;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public int getEventHour() {
		return eventHour;
	}

	public void setEventHour(int eventHour) {
		this.eventHour = eventHour;
	}

	public int getEventMinute() {
		return eventMinute;
	}

	public void setEventMinute(int eventMinute) {
		this.eventMinute = eventMinute;
	}

	public boolean isAfternoon() {
		return afternoon;
	}

	public void setAfternoon(boolean afternoon) {
		this.afternoon = afternoon;
	}

	@Override
	public String toString() {
		return "Event [eventid=" + eventid + ", eventName=" + eventName + ", eventLocation=" + eventLocation
				+ ", eventDate=" + eventDate + ", eventHour=" + eventHour + ", eventMinute=" + eventMinute
				+ ", afternoon=" + afternoon + "]";
	}

	public Event() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (afternoon ? 1231 : 1237);
		result = prime * result + ((eventDate == null) ? 0 : eventDate.hashCode());
		result = prime * result + eventHour;
		result = prime * result + ((eventLocation == null) ? 0 : eventLocation.hashCode());
		result = prime * result + eventMinute;
		result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
		result = prime * result + eventid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (afternoon != other.afternoon)
			return false;
		if (eventDate == null) {
			if (other.eventDate != null)
				return false;
		} else if (!eventDate.equals(other.eventDate))
			return false;
		if (eventHour != other.eventHour)
			return false;
		if (eventLocation == null) {
			if (other.eventLocation != null)
				return false;
		} else if (!eventLocation.equals(other.eventLocation))
			return false;
		if (eventMinute != other.eventMinute)
			return false;
		if (eventName == null) {
			if (other.eventName != null)
				return false;
		} else if (!eventName.equals(other.eventName))
			return false;
		if (eventid != other.eventid)
			return false;
		return true;
	}
	
	
	

}
