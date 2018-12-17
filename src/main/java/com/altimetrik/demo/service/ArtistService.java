package com.altimetrik.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.altimetrik.demo.model.Album;
import com.altimetrik.demo.model.Artist;
import com.altimetrik.demo.model.ArtistInfo;
import com.altimetrik.demo.model.Lyrics;
import com.altimetrik.demo.model.Message;
import com.altimetrik.demo.model.MessageInfo;
import com.altimetrik.demo.model.TopArtistInfo;
import com.altimetrik.demo.model.TopalbumsInfo;

@Service
public class ArtistService {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${microservice.lastfm}")
	String lastfm;	
	
	@Value("${microservice.musixmatch}")
	String musixmatch;	
	
	public ArtistInfo getTopArtist(String name, String country) {
		String artist_id = null;
		
		TopArtistInfo artistInfo = getTopArtistResponse(country);
		List<Artist> artists = artistInfo.getTopartists().getArtist();
		
		TopalbumsInfo albumInfo=getTopAlbumResponse(name);
		Album topalbum = albumInfo.getTopalbums().getAlbum().get(0);

		MessageInfo getArtistId = getArtistId(name);
		if(name.equals(getArtistId.getMessage().getBody().getArtist_list().get(0).getArtist().getArtist_name())) {
			artist_id=getArtistId.getMessage().getBody().getArtist_list().get(0).getArtist().getArtist_id();
			MessageInfo getAlbumid=getAlbumId(artist_id,topalbum.getName());
		}
		MessageInfo getAlbumid=getAlbumId(artist_id,topalbum.getName());
		String albumId=getAlbumid.getMessage().getBody().getAlbum_list().get(0).getAlbum().getAlbum_id();
		
		MessageInfo getTrackid=getTrackId(albumId);
		String trackId=getTrackid.getMessage().getBody().getTrack_list().get(0).getTrack().getTrack_id();
		
		MessageInfo getTrackLyrics = getTracklyrics(trackId);
		Lyrics lyrics=getTrackLyrics.getMessage().getBody().getLyrics();
		
		List<Artist> filterArtist = 
		 artists.stream().filter(artist -> name.equalsIgnoreCase(artist.getName())).collect(Collectors.toList());

		ArtistInfo info = new ArtistInfo();
		info.setArtist(filterArtist.get(0));
		info.setAlbum(topalbum);
		info.setLyrics(lyrics);
		return info;
		
	}

	private TopArtistInfo getTopArtistResponse(String country) {
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("country", country);

		ResponseEntity<TopArtistInfo> response;
		StringBuilder builder = new StringBuilder();
		builder.append(lastfm);
		builder.append("?method=geo.gettopartists&country=");
		builder.append(country);
		builder.append("&api_key=");
		builder.append("65e8a3317e1329c48d5c8d88b226df05");
		builder.append("&format=json");
		response = restTemplate.getForEntity(builder.toString(), TopArtistInfo.class, uriVariables);
		return response.getBody();
	}
	
	private TopalbumsInfo getTopAlbumResponse(String name) {
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("name", name);

		ResponseEntity<TopalbumsInfo> response;
		StringBuilder builder = new StringBuilder();
		builder.append(lastfm);
		builder.append("?method=artist.gettopalbums&artist=");
		builder.append(name);
		builder.append("&api_key=");
		builder.append("65e8a3317e1329c48d5c8d88b226df05");
		builder.append("&format=json");
		response = restTemplate.getForEntity(builder.toString(), TopalbumsInfo.class, uriVariables);
		return response.getBody();
	}
	
	private MessageInfo getArtistId(String name) {
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("name", name);

		ResponseEntity<MessageInfo> response;
		StringBuilder builder = new StringBuilder();
		builder.append(musixmatch);
		builder.append("artist.search?format=json&callback=callback&q_artist=");
		builder.append(name);
		builder.append("&apikey=");
		builder.append("e6dc7bc8465e304432f146249377816d");
		response = restTemplate.getForEntity(builder.toString(), MessageInfo.class, uriVariables);
		return response.getBody();
	}
	
	private MessageInfo getAlbumId(String artist_id, String album_name) {
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("artist_id", artist_id);
		uriVariables.put("g_album_name", album_name);

		ResponseEntity<MessageInfo> response;
		StringBuilder builder = new StringBuilder();
		builder.append(musixmatch);
		builder.append("artist.albums.get?format=json&callback=callback&artist_id=");
		builder.append(artist_id);
		builder.append("&g_album_name=");
		builder.append(album_name);
		builder.append("&apikey=");
		builder.append("e6dc7bc8465e304432f146249377816d");
		response = restTemplate.getForEntity(builder.toString(), MessageInfo.class, uriVariables);
		return response.getBody();
	}
	
	private MessageInfo getTrackId(String album_id) {
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("album_id", album_id);
		
		ResponseEntity<MessageInfo> response;
		StringBuilder builder = new StringBuilder();
		builder.append(musixmatch);
		builder.append("album.tracks.get?format=json&callback=callback&album_id=");
		builder.append(album_id);
		builder.append("&apikey=");
		builder.append("e6dc7bc8465e304432f146249377816d");
		response = restTemplate.getForEntity(builder.toString(), MessageInfo.class, uriVariables);
		return response.getBody();
	}
	
	private MessageInfo getTracklyrics(String track_id) {
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("track_id", track_id);
		
		ResponseEntity<MessageInfo> response;
		StringBuilder builder = new StringBuilder();
		builder.append(musixmatch);
		builder.append("track.lyrics.get?format=json&callback=callback&track_id=");
		builder.append(track_id);
		builder.append("&apikey=");
		builder.append("e6dc7bc8465e304432f146249377816d");
		response = restTemplate.getForEntity(builder.toString(), MessageInfo.class, uriVariables);
		return response.getBody();
	}
}
