# Disney Movies API  
Get access to top disney movies of all-time and create reviews for each movie.

### How to use Disney Movies API to get and post data:  

Main URL: https://abrahameg-movies.onrender.com
* GET all movies: `/api/v1/movies`  
  <img width="433" alt="get-movies" src="https://github.com/abraham-espinosa/movies-api/assets/60346436/a2a4da3e-afae-4ed7-8585-3a6e4f9d91da"><br/><br/>
* GET a movie by imdbId: `/api/v1/movies/{imdbId}`  
  <img width="440" alt="get-movie" src="https://github.com/abraham-espinosa/movies-api/assets/60346436/b9dbcaa3-48c6-4260-bc52-c32dfd2bb439"><br/><br/>
* POST a new review: `/api/v1/reviews`
  ```
  {
  "reviewBody": "Review text",
  "imdbId": "{imdbId}"
  }
  ```  
  *Creating a new review*  
  <img width="343" alt="post-review" src="https://github.com/abraham-espinosa/movies-api/assets/60346436/1629b89f-fb4d-4c39-b4ae-a9ce6fc5827c">  
  *Getting the movie with the new associated review*  
  <img width="448" alt="get-movie-review" src="https://github.com/abraham-espinosa/movies-api/assets/60346436/cb24d899-70f1-4f2e-af80-ada281d658b1"><br></br>
* GET all reviews: `/api/v1/reviews`  
  <img width="437" alt="get-reviews" src="https://github.com/abraham-espinosa/movies-api/assets/60346436/a12504b9-6168-4ba4-b770-6b96679e30e7">
