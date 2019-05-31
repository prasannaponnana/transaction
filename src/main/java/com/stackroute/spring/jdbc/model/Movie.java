package com.stackroute.spring.jdbc.model;

public class Movie {
	private int movieid;
	private String moviename;
	private Actor actor;
	private int year;
	private float rating;

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
}