package com.skilldistillery.film.entities;

import java.util.List;

public class Actor {
	//vars
	private int actorId;
	private String firstName;
	private String lastName;
	
	//ctors
	public Actor() {}
	
	public Actor(int actorId, String firstName, String lastName) {
		super();
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//get/set
	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + actorId;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
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
		Actor other = (Actor) obj;
		if (actorId != other.actorId)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Actor ID= ");
		sb.append(actorId);
		sb.append(", firstName= ");
		sb.append(firstName);
		sb.append(", lastName= ");
		sb.append(lastName);
		sb.append(", getActorId()= ");
		sb.append(getActorId());
		sb.append(", getFirstName()= ");
		sb.append(getFirstName());
		sb.append(", getLastName()= ");
		sb.append(getLastName());
		return sb.toString();
	}
	
	public void setFilms(List<Film> findFilmsByActorId) {}
	
	
}
