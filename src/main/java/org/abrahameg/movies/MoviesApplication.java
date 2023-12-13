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
			                   <h2>How to use Disney Movies API:</h2>
			                   <p>Main URL: https://abrahameg-movies.onrender.com</p>
			                   <h2>API Endpoints</h2>
							   <ul>
							     <li>Get all movies: /api/v1/movies</li>
							     <li>Get a movie by imdbId: /api/v1/movies/{imdbId}</li>
							     <li>Create a new review: /api/v1/reviews<br>{"reviewBody": "Review text", "imdbId": "{imdbId}"}</br></li>
							     <li>Get all reviews: /api/v1/reviews</li>
							   </ul>
			               </body>
			           </html>
			           """;
	public static void main(String[] args) {SpringApplication.run(MoviesApplication.class, args);}
	@GetMapping("/") // GET endpoint
	public String apiRoute(){
		return textBlock;
	}

}
