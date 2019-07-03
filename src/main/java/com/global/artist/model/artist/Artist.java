package com.global.artist.model.artist;

public class Artist {
	private Artist_alias_list[] artist_alias_list;

	private String updated_time;

	private String artist_name;

	private String artist_twitter_url;

	private String artist_rating;

	private String artist_country;

	private String artist_id;

	private String artist_mbid;

	public Artist_alias_list[] getArtist_alias_list() {
		return artist_alias_list;
	}

	public void setArtist_alias_list(Artist_alias_list[] artist_alias_list) {
		this.artist_alias_list = artist_alias_list;
	}

	public String getUpdated_time() {
		return updated_time;
	}

	public void setUpdated_time(String updated_time) {
		this.updated_time = updated_time;
	}

	public String getArtist_name() {
		return artist_name;
	}

	public void setArtist_name(String artist_name) {
		this.artist_name = artist_name;
	}

	public String getArtist_twitter_url() {
		return artist_twitter_url;
	}

	public void setArtist_twitter_url(String artist_twitter_url) {
		this.artist_twitter_url = artist_twitter_url;
	}

	public String getArtist_rating() {
		return artist_rating;
	}

	public void setArtist_rating(String artist_rating) {
		this.artist_rating = artist_rating;
	}

	public String getArtist_country() {
		return artist_country;
	}

	public void setArtist_country(String artist_country) {
		this.artist_country = artist_country;
	}

	public String getArtist_id() {
		return artist_id;
	}

	public void setArtist_id(String artist_id) {
		this.artist_id = artist_id;
	}

	public String getArtist_mbid() {
		return artist_mbid;
	}

	public void setArtist_mbid(String artist_mbid) {
		this.artist_mbid = artist_mbid;
	}

}