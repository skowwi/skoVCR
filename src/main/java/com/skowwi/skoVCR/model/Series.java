package com.skowwi.skoVCR.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Series {
	@Id
	@GeneratedValue
	private Long id;
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString(){
		final StringBuilder builder = new StringBuilder();
		builder.append("Serien ID = ");
		builder.append(id);
		builder.append(", Titel = ");
		builder.append(title);
		return builder.toString();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
