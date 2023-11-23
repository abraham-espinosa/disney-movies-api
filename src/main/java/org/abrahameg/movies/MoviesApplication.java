package org.abrahameg.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {
 	public String homeMessage = "API Disney Movies\n\n" +
			"Main URL: https://abrahameg-movies.onrender.com\n" +
			"GET all movies: '/api/v1/movies'\n" +
			"GET movie by imdbId:  '/api/v1/movies/{imdbId}'\n" +
			"POST new review: '/api/v1/reviews'";
	public static void main(String[] args) {SpringApplication.run(MoviesApplication.class, args);}
	@GetMapping("/") // GET endpoint
	public String apiRoute(){
		return homeMessage;
	}

}
