package com.mohit.resources;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mohit.model.CatalogItem;
import com.mohit.model.Movie;
import com.mohit.model.Rating;
import com.mohit.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	
	
	
	@Autowired
	private RestTemplate restTemplate;

	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){
	//get all rated Movie IDS
	//movies they have watched
//	List<Rating> ratings = Arrays.asList(
//			new Rating("1234",5)
//			);
	
	//find details about the movies
	//For each movie Id call movieInfoService and get details
		
	UserRating userRating 
						= restTemplate
						.getForObject("http://localhost:9092/ratings/users/"+userId,UserRating.class);
	
	return userRating.getUserRating().
			stream().map(rating -> {
		Movie movie = restTemplate.getForObject("http://localhost:9091/movies/"+rating.getMovieId(), Movie.class);
		return new CatalogItem(movie.getName(), "Scifi", rating.getRating());
	}
	).collect(Collectors.toList());
				
	}

}
