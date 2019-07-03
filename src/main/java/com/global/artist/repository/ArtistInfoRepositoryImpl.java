package com.global.artist.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.global.artist.model.common.Body;
import com.global.artist.model.common.Response;

@Repository
public class ArtistInfoRepositoryImpl implements ArtistInfoRepository {

	String accessKey = "c5024ca9c126fbcdc535f1a22929df5e";
	String serviceUrl = "https://api.musixmatch.com/ws/1.1/";

	// http://ws.audioscrobbler.com/2.0/?method=geo.gettopartists&country=vanuatu&api_key=65e8a3317e1329c48d5c8d88b226df05&format=json
	// https://api.musixmatch.com/ws/1.1/artist.search?q_artist=prodigy&page_size=5

	@Autowired
	RestTemplate restTemplate;

	@Override
	public Body getArtistInfo(String name) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("name", name);

		ResponseEntity<Response> response;
		StringBuilder builder = new StringBuilder();
		builder.append(serviceUrl);
		builder.append("artist.search?format=json&callback=callback&q_artist=");
		builder.append(name);
		builder.append("&apikey=");
		builder.append(accessKey);
		response = restTemplate.getForEntity(builder.toString(), Response.class, uriVariables);
		if (response.getStatusCode() == HttpStatus.OK) {
			return response.getBody().getMessage().getBody();
		} else {
			return null;
		}
	}
	
	@Override
	public Body getAlbumsByArtistId(String id) {

		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("name", id);

		ResponseEntity<Response> response;
		StringBuilder builder = new StringBuilder();
		builder.append(serviceUrl);
		builder.append("artist.albums.get?artist_id="+id);
		builder.append("&s_release_date=desc&g_album_name=1");
		builder.append("&apikey=");
		builder.append(accessKey);
		response = restTemplate.getForEntity(builder.toString(), Response.class, uriVariables);
		if (response.getStatusCode() == HttpStatus.OK) {
			return response.getBody().getMessage().getBody();
		} else {
			return null;
		}
	
	}

}
