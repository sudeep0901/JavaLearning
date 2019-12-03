package com.sudeep.hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
  import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Book")
@AttributeOverrides({ 
	@AttributeOverride(name = "ebookPublisher.name", column = @Column(name = "ebook_publisher_name")),
	@AttributeOverride(name = "paperBackPublisher.name", column = @Column(name = "paper_back_publisher_name")

		)

})
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;

	private String author;

	private Publisher ebookPublisher;
	private Publisher paperBackPublisher;

	//	@Embedded
	//	private Publisher paperBackPublisher;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the ebookPublisher
	 */
	public Publisher getEbookPublisher() {
		return ebookPublisher;
	}

	/**
	 * @param ebookPublisher the ebookPublisher to set
	 */
	public void setEbookPublisher(Publisher ebookPublisher) {
		this.ebookPublisher = ebookPublisher;
	}

	/**
	 * @return the paperBackPublisher
	 */
	public Publisher getPaperBackPublisher() {
		return paperBackPublisher;
	}

	/**
	 * @param paperBackPublisher the paperBackPublisher to set
	 */
	public void setPaperBackPublisher(Publisher paperBackPublisher) {
		this.paperBackPublisher = paperBackPublisher;
	}


}
