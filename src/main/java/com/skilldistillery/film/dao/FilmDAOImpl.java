package com.skilldistillery.film.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import com.skilldistillery.film.entities.Actor;
import com.skilldistillery.film.entities.Film;

@Component
public class FilmDAOImpl implements FilmDAO {

	private static String url = "jdbc:mysql://localhost:3306/sdvid?useSSL=false";
	private final String user = "student";
	private final String pass = "student";
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Film getFilmById(int filmId) {
		Film film = null;
		Actor actor = null;
		String user = "student";
		String pass = "student";
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sql = "SELECT film.id, film.title, film.description, "
					+ "film.release_year, film.language_id, film.rental_duration, "
					+ "film.rental_rate, film.length, film.replacement_cost, film.rating, "
					+ "film.special_features FROM film WHERE id = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, filmId);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				filmId = rs.getInt("film.id");
				String title = rs.getString("film.title");
				String description = rs.getString("film.description");
				int releaseYr = rs.getInt("film.release_year");
				int langId = rs.getInt("film.language_id");
				int rentalDur = rs.getInt("film.rental_duration");
				double rentalRate = rs.getDouble("film.rental_rate");
				int length = rs.getInt("film.length");
				double replaceCost = rs.getDouble("film.replacement_cost");
				String rating = rs.getString("film.rating");
				String specFeatures = rs.getString("film.special_features");
				List<Actor> actors = findActorByFilm(filmId);
				String category = findCategory(filmId);
				if(category.isEmpty()) {
					category = "No category found";
				}
				film = new Film(filmId, description, releaseYr, langId, rentalDur, rentalRate, 
						length, replaceCost, rating, specFeatures, actors, category);
				System.out.println(film);	
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return film;
	}

	private String findCategory(int filmId) {
		String category = "";
		String user = "student";
		String pass = "student";
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sql = "SELECT film.id, category.name FROM film "
					+ "JOIN category WHERE film.id = category.id AND "
					+ " film.id = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, filmId);
			ResultSet categoryResult = stmt.executeQuery();
			stmt.setInt(1, filmId);
			while (categoryResult.next()) {
				category = categoryResult.getString("category.name");
			}
			categoryResult.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return category;
	}

	@Override
	public List<Film> findFilmByKey(String key) {
		List<Film> films = new ArrayList<>();
		Film film = null;
		String user = "student";
		String pass = "student";
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sql = "SELECT film.id, film.title, film.description, film.release_year, "
					+ "film.language_id, film.rental_duration, ";
			sql += " film.rental_rate, film.length, film.replacement_cost, film.rating, "
					+ " film.special_features FROM film WHERE (film.title LIKE ?) OR "
					+ " (film.description LIKE ?)";
			System.out.println(sql);
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, '%' + key + '%');
			stmt.setString(2, '%' + key + '%');
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				int filmId = rs.getInt("film.id");
				String title = rs.getString("film.title");
				String description = rs.getString("film.description");
				int releaseYr = rs.getInt("film.release_year");
				int langId = rs.getInt("film.language_id");
				int rentalDur = rs.getInt("film.rental_duration");
				double rentalRate = rs.getDouble("film.rental_rate");
				int length = rs.getInt("film.length");
				double replaceCost = rs.getDouble("film.replacement_cost");
				String rating = rs.getString("film.rating");
				String specFeatures = rs.getString("film.special_features");
				List<Actor> actors = findActorByFilm(filmId);
				String category = findCategory(filmId);
				if(category.isEmpty()) {
					category = "No category found";
				}
				film = new Film(filmId, description, releaseYr, langId, rentalDur, rentalRate, 
						length, replaceCost, rating, specFeatures, actors, category);
				System.out.println(film);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return films;
	}

	@Override
	public List<Actor> findActorByFilm(int filmId) {
		List<Actor> actors = new ArrayList<>();
		int actorId = 0;
		Actor actor = null;
		String user = "student";
		String pass = "student";
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sql = "SELECT actor.id, actor.first_name, actor.last_name, "
					+ "FROM film JOIN film_actor ON film.id = film_actor.film_id"
					+ "JOIN actor ON film_actor.actor_id = actor.id "
					+ "WHERE film.id = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, filmId);
			ResultSet actorResult = stmt.executeQuery();
			while (actorResult.next()) {
				actor = new Actor();
				actor.setActorId(actorResult.getInt("actor.id"));
				actor.setFirstName(actorResult.getString("actor.first_name"));
				actor.setFirstName(actorResult.getString("actor.last_name"));
				actors.add(actor);
			}
			actorResult.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return actors;
	}

}
