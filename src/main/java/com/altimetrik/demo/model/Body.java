package com.altimetrik.demo.model;

import java.util.List;

public class Body {
	List <Artist_List> artist_list;
	List <Album_List> album_list;
	List <Track_List> track_list;
	private Lyrics lyrics;

	public List<Artist_List> getArtist_list() {
		return artist_list;
	}

	public void setArtist_list(List<Artist_List> artist_list) {
		this.artist_list = artist_list;
	}

	public List<Album_List> getAlbum_list() {
		return album_list;
	}

	public void setAlbum_list(List<Album_List> album_list) {
		this.album_list = album_list;
	}

	public List<Track_List> getTrack_list() {
		return track_list;
	}

	public void setTrack_list(List<Track_List> track_list) {
		this.track_list = track_list;
	}
	
	public Lyrics getLyrics() {
	return lyrics;
	}

	public void setLyrics(Lyrics lyrics) {
	this.lyrics = lyrics;
	}

	
}
