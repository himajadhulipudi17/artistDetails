package com.altimetrik.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.demo.model.ArtistInfo;
import com.altimetrik.demo.service.ArtistService;

@RestController
public class ArtistController {
	
	@Autowired
	ArtistService artistService;
	
	//Sample Url: http://localhost:8080/artist?name=Radiohead&country=vanuatu
	@GetMapping("/artist")
	public ArtistInfo getArtistInfo(@RequestParam("name") String name, @RequestParam("country") String country) {
		return artistService.getTopArtist(name,country);
	}

}
