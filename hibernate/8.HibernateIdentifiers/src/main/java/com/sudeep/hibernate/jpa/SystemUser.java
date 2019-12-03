package com.sudeep.hibernate.jpa;

 import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="SystemUser")

public class SystemUser {
	
	@EmbeddedId
	private PK pk;
	
	
	private int id;
	
	private String Author;
	private String title;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the pk
	 */
	public PK getPk() {
		return pk;
	}
	/**
	 * @param pk the pk to set
	 */
	public void setPk(PK pk) {
		this.pk = pk;
	}
}
