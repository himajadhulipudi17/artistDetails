package com.altimetrik.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Image {
	@JsonProperty("#text")
	private String text;
	private String size;

	// Getter Methods

	public String gettext() {
		return text;
	}

	public String getSize() {
		return size;
	}


	// Setter Methods

	public void settext(String text) {
		this.text = text;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
