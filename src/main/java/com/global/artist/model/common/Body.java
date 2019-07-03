package com.global.artist.model.common;

import com.global.artist.model.album.Album_list;
import com.global.artist.model.artist.Artist_list;

public class Body {
	private Artist_list[] artist_list;
	private Album_list[] album_list;

	public Artist_list[] getArtist_list() {
		return artist_list;
	}

	public void setArtist_list(Artist_list[] artist_list) {
		this.artist_list = artist_list;
	}

	public Album_list[] getAlbum_list() {
		return album_list;
	}

	public void setAlbum_list(Album_list[] album_list) {
		this.album_list = album_list;
	}

}
