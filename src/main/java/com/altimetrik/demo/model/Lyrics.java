package com.altimetrik.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lyrics {
	private String lyricsBody;

	@JsonProperty("lyrics_body")
	public String getLyricsBody() {
	return lyricsBody;
	}

	@JsonProperty("lyrics_body")
	public void setLyricsBody(String lyricsBody) {
	this.lyricsBody = lyricsBody;
	}

}
