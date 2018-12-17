package com.altimetrik.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArtistInfo {

	@JsonProperty("")
	private Artist artist;
	private Album album;
	private Lyrics lyrics;


	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}


	 // Getter Methods 

	 public Lyrics getLyrics() {
	  return lyrics;
	 }

	 // Setter Methods 

	 public void setLyrics(Lyrics lyrics) {
	  this.lyrics = lyrics;
	 }
}
