package com.altimetrik.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Album_List {
	private AlbumObject album;

	@JsonProperty("album")
	public AlbumObject getAlbum() {
		return album;
	}

	@JsonProperty("album")
	public void setAlbum(AlbumObject album) {
		this.album = album;
	}

}
