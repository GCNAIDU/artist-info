package com.global.artist.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.artist.model.album.Album;
import com.global.artist.model.album.Album_list;
import com.global.artist.model.artist.Artist;
import com.global.artist.model.common.Body;
import com.global.artist.model.common.ErrorMessage;
import com.global.artist.model.common.GlobalResponse;
import com.global.artist.repository.ArtistInfoRepository;

@Service
public class ArtistInfoServiceImpl implements ArtistInfoService {

	@Autowired
	ArtistInfoRepository artistInfoRepository;

	@Override
	public GlobalResponse getArtistInfo(String name) {

		GlobalResponse res = new GlobalResponse();
		Body artistsBody = artistInfoRepository.getArtistInfo(name);
		Artist artist = null;
		if (artistsBody.getArtist_list().length > 0 && artistsBody.getArtist_list()[0] != null) {
			artist = artistsBody.getArtist_list()[0].getArtist();
		} else {
			ErrorMessage errorMessage = new ErrorMessage();
			errorMessage.setErrorMessage("Artist not found");
			res.setErrorMessage(errorMessage);
		}

		Body albumBody = artistInfoRepository.getAlbumsByArtistId(artist.getArtist_id());
		Album_list[] albums = albumBody.getAlbum_list();
		Album topAlbum = findTopAlbum(albums);

		res.setArtist(artist);
		res.setAlbum(topAlbum);

		return res;

	}

	private Album findTopAlbum(Album_list[] albums) {
		List<Integer> ratings = new ArrayList<Integer>();

		for (Album_list albumList : albums) {
			Album album = albumList.getAlbum();
			String rating = album.getAlbum_rating();
			if (rating != null)
				ratings.add(Integer.parseInt(rating));

		}
		Collections.sort(ratings);
		Integer maxRating = ratings.get(ratings.size() - 1);

		for (Album_list albumList : albums) {
			Album album = albumList.getAlbum();
			String rating = album.getAlbum_rating();
			if (rating == maxRating.toString())
				return album;

		}

		return null;
	}

}
