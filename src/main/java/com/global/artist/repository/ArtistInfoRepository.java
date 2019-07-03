package com.global.artist.repository;

import com.global.artist.model.common.Body;

public interface ArtistInfoRepository {

	Body getArtistInfo(String name);

	Body getAlbumsByArtistId(String id);

}
