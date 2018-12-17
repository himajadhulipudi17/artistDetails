package com.altimetrik.demo.model;

public class AlbumObject {
	private String album_id;
	 private String album_mbid;
	 private String album_name;
	 private float album_rating;
	 private float album_track_count;

	 // Getter Methods 

	 public String getAlbum_id() {
	  return album_id;
	 }

	 public String getAlbum_mbid() {
	  return album_mbid;
	 }

	 public String getAlbum_name() {
	  return album_name;
	 }

	 public float getAlbum_rating() {
	  return album_rating;
	 }

	 public float getAlbum_track_count() {
	  return album_track_count;
	 }


	 // Setter Methods 

	 public void setAlbum_id(String album_id) {
	  this.album_id = album_id;
	 }

	 public void setAlbum_mbid(String album_mbid) {
	  this.album_mbid = album_mbid;
	 }

	 public void setAlbum_name(String album_name) {
	  this.album_name = album_name;
	 }

	 public void setAlbum_rating(float album_rating) {
	  this.album_rating = album_rating;
	 }

	 public void setAlbum_track_count(float album_track_count) {
	  this.album_track_count = album_track_count;
	 }
}
