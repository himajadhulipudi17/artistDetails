package com.altimetrik.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Artist {

	private String name;
	private String mbid;
	List<Image> image;
	private String listeners;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMbid() {
		return mbid;
	}
	public void setMbid(String mbid) {
		this.mbid = mbid;
	}
	public List<Image> getImage() {
		return image;
	}
	public void setImage(List<Image> image) {
		this.image = image;
	}
	public String getListeners() {
		return listeners;
	}
	public void setListeners(String listeners) {
		this.listeners = listeners;
	}
	

}
