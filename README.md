# Disney Movies API  
Get access to top disney movies of all-time and create reviews for each movie.

### How to use Disney Movies API to get and post data:  

Main URL: https://abrahameg-movies.onrender.com
* GET all movies: `/api/v1/movies`
  ![get-movies.png](..%2FMoviesAPI-Documentation%2Fget-movies.png)<br/><br/>
* GET a movie by imdbId: `/api/v1/movies/{imdbId}` 
  ![get-movie.png](..%2FMoviesAPI-Documentation%2Fget-movie.png)<br/><br/>
* POST a new review: `/api/v1/reviews`
  ```
  {
  "reviewBody": "Review text",
  "imdbId": "{imdbId}"
  }
  ```  
  *Creating a new review*
  ![post-review.png](..%2FMoviesAPI-Documentation%2Fpost-review.png)  
  *Getting the movie with the new associated review*
  ![get-movie-review.png](..%2FMoviesAPI-Documentation%2Fget-movie-review.png)<br></br>
* GET all reviews: `/api/v1/reviews`
  ![get-reviews.png](..%2FMoviesAPI-Documentation%2Fget-reviews.png)