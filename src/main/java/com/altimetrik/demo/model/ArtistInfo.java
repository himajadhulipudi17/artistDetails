package com.altimetrik.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArtistInfo {
	
	

	private Artist2 artist;
	private Album album;
	private Lyrics lyrics;
	List <Artist> artistlist;
	
	public List<Artist> getArtistList() {
		return artistlist;
	}
	public void setArtistList(List<Artist> artistlist) {
		this.artistlist = artistlist;
	}

	public Artist2 getArtist() {
		return artist;
	}

	public void setArtist(Artist2 artist) {
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

	@Override
	public String toString() {
		return "ArtistInfo [artist=" + artist + ", album=" + album + ", lyrics=" + lyrics + "]";
	}
	 
	 
}
