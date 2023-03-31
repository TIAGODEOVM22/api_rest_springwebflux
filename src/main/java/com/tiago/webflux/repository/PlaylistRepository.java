package com.tiago.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.tiago.webflux.document.Playlist;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {

	
	
}
