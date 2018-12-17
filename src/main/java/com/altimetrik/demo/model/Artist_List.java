package com.altimetrik.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Artist_List {
	@JsonProperty("artist")
	ArtistObject ArtistObject;


	 // Getter Methods 

	 public ArtistObject getArtist() {
	  return ArtistObject;
	 }

	 // Setter Methods 

	 public void setArtist(ArtistObject artistObject) {
	  this.ArtistObject = artistObject;
	 }
	
}
