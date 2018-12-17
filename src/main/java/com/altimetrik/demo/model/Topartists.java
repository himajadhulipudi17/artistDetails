package com.altimetrik.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Topartists {

	 List <Artist> artist;
	 @JsonProperty("@attr")
	 attr attrObject;
	public List<Artist> getArtist() {
		return artist;
	}
	public void setArtist(List<Artist> artist) {
		this.artist = artist;
	}
	public attr getAttrObject() {
		return attrObject;
	}
	public void setAttrObject(attr attrObject) {
		this.attrObject = attrObject;
	}


	 
}
