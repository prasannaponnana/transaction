package com.stackroute.spring.jdbc.dao;


import javax.sql.DataSource;

import com.stackroute.spring.jdbc.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;

public class MovieDAOImpl implements MovieDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void create(Movie movie) {
		String queryMovie = "insert into movie (id, movieName, releaseYear, ratings) values (?,?,?,?)";
		String queryActor = "insert into Actor (id, actorName, age) values (?,?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(queryMovie, new Object[] { movie.getMovieid(),
				movie.getMoviename(),movie.getRating(),movie.getYear()});
		System.out.println("Inserted into movie Table Successfully");
		jdbcTemplate.update(queryActor, new Object[] { movie.getMovieid(),
				movie.getActor().getName(),
				movie.getActor().getAge() });
		System.out.println("Inserted into Actor Table Successfully");
	}

}
