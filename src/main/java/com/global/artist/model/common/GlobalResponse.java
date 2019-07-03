package com.global.artist.model.common;

import com.global.artist.model.album.Album;
import com.global.artist.model.artist.Artist;

public class GlobalResponse {
	Artist artist;
	Album album;
	ErrorMessage errorMessage;

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}

}
