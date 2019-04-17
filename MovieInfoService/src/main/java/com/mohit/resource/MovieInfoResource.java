package com.mohit.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohit.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {

	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId")String movieId) {
		return new Movie("1", "9");
	}
}
