package com.skilldistillery.film.entities;

import java.util.List;

public class Film {
	private int filmId;
	private String title;
	private String description;
	private int releaseYr; 
	private int langId;
	private int rentalDur;
	private double rentalRate;
	private int length;
	private double replaceCost;
	private String rating;
	private String specFeatures;
	private List<Actor> actors;
	
	
	public Film() {}
	
	public Film(int filmId, String title, 
			String description, int releaseYr, int langId, int rentalDur,
			double rentalRate, int length, double replaceCost, 
			String rating, String specFeatures) {
		this.filmId = filmId;
		this.title = title;
		this.description = description;
		this.releaseYr = releaseYr;
		this.langId = langId;
		this.rentalDur = rentalDur;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replaceCost = replaceCost;
		this.rating = rating;
		this.specFeatures = specFeatures;
	}
	

	public Film(int filmId, String title, String description, int releaseYr, int langId, int rentalDur,
			double rentalRate, int length, double replaceCost, String rating, String specFeatures, List<Actor> actors,
			String language, String category) {
		this.filmId = filmId;
		this.title = title;
		this.description = description;
		this.releaseYr = releaseYr;
		this.langId = langId;
		this.rentalDur = rentalDur;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replaceCost = replaceCost;
		this.rating = rating;
		this.specFeatures = specFeatures;
		this.actors = actors;
		this.language = language;
		this.category = category;
	}

	public Film(int filmId, String description, int releaseYr, int langId, int rentalDur, double rentalRate,
			int length, double replaceCost, String rating, String specFeatures, List<Actor> actors,
			String category) {
		this.filmId = filmId;
		this.title = title;
		this.description = description;
		this.releaseYr = releaseYr;
		this.langId = langId;
		this.rentalDur = rentalDur;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replaceCost = replaceCost;
		this.rating = rating;
		this.specFeatures = specFeatures;
		this.actors = actors;
		this.category = category;
	}

	public int getFilmId() {
		return filmId;
	}
	
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	
	public int getlangId() {
		return langId;
	}
	
	public void setlangId(int langId) {
		this.langId = langId;
	}
	
	public String getspecFeatures() {
		return specFeatures;
	}
	
	public void setspecFeatures(String specFeatures) {
		this.specFeatures = specFeatures;
	}
	
	public List<Actor> getActors() {
		return actors;
	}
	
	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getReleaseYr() {
		return releaseYr;
	}
	public void setReleaseYr(int releaseYr) {
		this.releaseYr = releaseYr;
	}
	public int getLangId() {
		return langId;
	}
	public void setLangId(int langId) {
		this.langId = langId;
	}
	public int getrentalDur() {
		return rentalDur;
	}
	public void setrentalDur(int rentalDur) {
		this.rentalDur = rentalDur;
	}
	public double getRentalRate() {
		return rentalRate;
	}
	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public double getReplaceCost() {
		return replaceCost;
	}
	public void setReplaceCost(double replaceCost) {
		this.replaceCost = replaceCost;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	private String language;
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	private String category;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actors == null) ? 0 : actors.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + filmId;
		result = prime * result + langId;
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + length;
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + releaseYr;
		result = prime * result + rentalDur;
		long temp;
		temp = Double.doubleToLongBits(rentalRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(replaceCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((specFeatures == null) ? 0 : specFeatures.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		if (actors == null) {
			if (other.actors != null)
				return false;
		} else if (!actors.equals(other.actors))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (filmId != other.filmId)
			return false;
		if (langId != other.langId)
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (length != other.length)
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (releaseYr != other.releaseYr)
			return false;
		if (rentalDur != other.rentalDur)
			return false;
		if (Double.doubleToLongBits(rentalRate) != Double.doubleToLongBits(other.rentalRate))
			return false;
		if (Double.doubleToLongBits(replaceCost) != Double.doubleToLongBits(other.replaceCost))
			return false;
		if (specFeatures == null) {
			if (other.specFeatures != null)
				return false;
		} else if (!specFeatures.equals(other.specFeatures))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
}