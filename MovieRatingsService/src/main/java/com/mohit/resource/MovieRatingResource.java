package com.mohit.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohit.model.Rating;
import com.mohit.model.UserRating;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Reiterating;

@RestController
@RequestMapping("/ratings")
public class MovieRatingResource {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId")String movieId) {
		return new Rating("1", 9);
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId")String userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating("1234",5)
				);
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
	}
}
