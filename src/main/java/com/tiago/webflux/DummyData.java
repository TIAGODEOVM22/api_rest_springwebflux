package com.tiago.webflux;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tiago.webflux.document.Playlist;
import com.tiago.webflux.repository.PlaylistRepository;

import reactor.core.publisher.Flux;

/*
 * @Component public class DummyData implements CommandLineRunner{
 * 
 * private final PlaylistRepository playlistRepository;
 * 
 * DummyData(PlaylistRepository playlistRepository) { this.playlistRepository =
 * playlistRepository; }
 * 
 * @Override public void run (String... args) throws Exception {
 * 
 * playlistRepository.deleteAll()caso a playlist ja tenha algo este deleteAll
 * ira apagar tudo .thenMany(
 * Flux.just("API REST Spring boot","Deploy de uma aplicação java","JAVA8",
 * "GITHUB", "Spring security",
 * "Web Service RestFull","Bean no Spring Framework") .map(nome -> new
 * Playlist(UUID.randomUUID().toString(), nome))
 * .flatMap(playlistRepository::save)) .subscribe(System.out::println); }
 * 
 * 
 * }
 */