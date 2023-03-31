package com.tiago.webflux.service;

import com.tiago.webflux.document.Playlist;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlaylistService {
	
	/*Não retorna lista sim um tipo FLUX, varios elementos*/
	Flux <Playlist> findAll();
	
	/*retorna UM ou zero elemento por isso MONO*/
	Mono <Playlist> findById(String id);

	
	Mono <Playlist> save (Playlist playlist);
	
}
