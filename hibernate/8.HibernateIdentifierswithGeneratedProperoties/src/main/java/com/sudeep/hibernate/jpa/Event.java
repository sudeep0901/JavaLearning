package com.sudeep.hibernate.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="event_type")
public class Event {

	@Id
    private EventId id;

    @Column(name = "event_key")
    private String key;

    @Column(name = "event_value")
    private String value;

	/**
	 * @return the id
	 */
	public EventId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(EventId id) {
		this.id = id;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
