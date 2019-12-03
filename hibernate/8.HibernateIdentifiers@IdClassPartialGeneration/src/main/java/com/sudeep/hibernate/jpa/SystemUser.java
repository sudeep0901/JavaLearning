package com.sudeep.hibernate.jpa;

 import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="IdClassPartialSystemUser")
@IdClass(PK.class)
public class SystemUser {
	
	@Id
	private String subsystem;
	
	@Id
	private String username;
	
	@Id
	@GeneratedValue
	private Integer registrationId;
	
	private String Author;
	private String title;
	/**
	 * @return the subsystem
	 */
	public String getSubsystem() {
		return subsystem;
	}
	/**
	 * @param subsystem the subsystem to set
	 */

	public PK getId() {
		return new PK(
			subsystem,
			username,
			registrationId
		);
	}
	
	public void setId(PK id) {
		this.subsystem = id.getSubsystem();
		this.username = id.getUsername();
		this.registrationId = id.getRegistrationId();
	}

	public void setSubsystem(String subsystem) {
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
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return Author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		Author = author;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the registrationId
	 */
	public Integer getRegistrationId() {
		return registrationId;
	}
	/**
	 * @param registrationId the registrationId to set
	 */
	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}
	}
