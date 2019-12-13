package com.sudeep.hibernate.jpa;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;


@Embeddable
public class PK implements Serializable {
//	private String subsystem;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Subsystem subsystem;
	private String username;

	public PK(Subsystem subsystem, String username) {
		super();
		this.subsystem = subsystem;
		this.username = username;
	}
	private PK() {
	}

	/**
	 * @return the subsystem
	 */
	public Subsystem getSubsystem() {
		return subsystem;
	}

	/**
	 * @param subsystem the subsystem to set
	 */
	public void setSubsystem(Subsystem subsystem) {
		this.subsystem = subsystem;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subsystem == null) ? 0 : subsystem.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		PK other = (PK) obj;
		if (subsystem == null) {
			if (other.subsystem != null)
				return false;
		} else if (!subsystem.equals(other.subsystem))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
	

	
}
