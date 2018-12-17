package com.altimetrik.demo.model;

import java.util.List;

public class Album {
	 private String name;
	 private float playcount;
	 private String mbid;
	 private String url;


	 // Getter Methods 

	 public String getName() {
	  return name;
	 }

	 public float getPlaycount() {
	  return playcount;
	 }

	 public String getMbid() {
	  return mbid;
	 }

	 public String getUrl() {
	  return url;
	 }

	 

	 // Setter Methods 

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setPlaycount(float playcount) {
	  this.playcount = playcount;
	 }

	 public void setMbid(String mbid) {
	  this.mbid = mbid;
	 }

	 public void setUrl(String url) {
	  this.url = url;
	 }

}
