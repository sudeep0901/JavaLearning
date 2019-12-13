package com.sudeep.hibernate.jpa;

 import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="IdClassSystemUser")
@IdClass(PK.class)
public class SystemUser {
	
	@Id
	private String subsystem;
	
	@Id
	private String username;
	
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
			username
		);
	}
	
	public void setId(PK id) {
		this.subsystem = id.getSubsystem();
		this.username = id.getUsername();
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
	}
