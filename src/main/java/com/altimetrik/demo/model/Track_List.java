package com.altimetrik.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Track_List {
	private Track track;

	@JsonProperty("track")
	public Track getTrack() {
		return track;
	}

	public void settrack(Track track) {
		this.track = track;
	}
}
