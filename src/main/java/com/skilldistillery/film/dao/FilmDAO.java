package com.skilldistillery.film.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.skilldistillery.film.entities.*;

@Component
public interface FilmDAO {
	public Film getFilmById(int filmId);
	public List<Film> findFilmByKey(String key);
	public List<Actor> findActorByFilm(int filmId);
	public String findCategory(int filmId);
	public Film addNewFilm(Film film);
	public boolean deleteFilm (int filmId);
	
	
	boolean updateFilm(Film film);
}
