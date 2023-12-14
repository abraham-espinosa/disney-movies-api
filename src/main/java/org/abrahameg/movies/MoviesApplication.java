package org.abrahameg.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {
	 public String textBlock = """
			           <html>
			               <body>
			               	   <h1>Disney Movies REST API</h1>
			                   <p>Get access to top disney movies and create reviews for each movie.</p>
			                   <br>
			                   <h2>Root API Endpoint</h2>
			                   <p>All API URLs are relative to <b>https://api-disneymovies.onrender.com/v1/</b></p>
			                   <p>All methods are accessed through <b>https://api-disneymovies.onrender.com/v1/INSERT_METHOD</b></p>
			                   <p>For example, the /movies call is accessed at <b>https://api-disneymovies.onrender.com/v1/movies</b></p>
			                   <br>
			                   <h2>API Endpoints</h2>
							     <p>Get all movies: <b>/movies</b></p>
							     <p>Get a movie by imdbId: <b>/movies/{imdbId}</b></p>
							     <p>Create a new review: <b>/reviews</b> <br>Body: {"reviewBody": "Review text", "imdbId": "imdb ID"}</p>
							     <p>Get all reviews: <b>/reviews</b></p>
			               </body>
			           </html>
			           """;
	public static void main(String[] args) {SpringApplication.run(MoviesApplication.class, args);}
	@GetMapping("/") // GET endpoint
	public String apiRoute(){
		return textBlock;
	}

}
