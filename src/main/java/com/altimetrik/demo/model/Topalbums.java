package com.altimetrik.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Topalbums {
	 List <Album> album;
	 @JsonProperty("@attr")
	 attr attrObject;
	public List<Album> getAlbum() {
		return album;
	}
	public void setAlbum(List<Album> album) {
		this.album = album;
	}
	public attr getAttrObject() {
		return attrObject;
	}
	public void setAttrObject(attr attrObject) {
		this.attrObject = attrObject;
	}

}
