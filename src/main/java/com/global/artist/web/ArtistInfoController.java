package com.global.artist.web;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.global.artist.model.common.GlobalResponse;
import com.global.artist.service.ArtistInfoService;

@RestController
public class ArtistInfoController {

	@Autowired
	ArtistInfoService artistInfoService;

	
	//http://localhost:8080/artistInfo?name=Prodigy
	@GetMapping("/artistInfo")
	public GlobalResponse artistInfo(@PathParam("name") String name) {

		return artistInfoService.getArtistInfo(name);

	}

}
