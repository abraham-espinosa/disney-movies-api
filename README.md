## Disney Movies REST API
Get access to top disney movies and create reviews for each movie.
<br>
<br>
### Root API Endpoint 

---

All API URLs are relative to `https://api-disneymovies.onrender.com/v1/`

All methods are accessed through `https://api-disneymovies.onrender.com/v1/INSERT_METHOD`

For example, the /movies call is accessed at `https://api-disneymovies.onrender.com/v1/movies`
<br>
<br>
### API Endpoints

---

Get all movies at `/movies`
<br>
<img width="512" alt="get all movies" src="https://github.com/abraham-espinosa/disney-movies-api/assets/60346436/778eadd1-16ea-4312-9412-523cbed39334">
<br>
<br>
Get a movie by imdbId at `/movies/{imdbId}`
<br>
<img width="519" alt="get a single movie" src="https://github.com/abraham-espinosa/disney-movies-api/assets/60346436/b5b0c81e-1141-4078-9fbb-0861cd3b7433">
<br>
<br>
Create a new review at `/reviews`
<br>
Body:
```
{
  "reviewBody": "Review text",
  "imdbId": "imdb ID"
}
```
<img width="514" alt="create a single review" src="https://github.com/abraham-espinosa/disney-movies-api/assets/60346436/43ff164a-e610-437e-87df-166d3a222b8d">   
<br>
<br>

Get all reviews at `/reviews`
<br>
<img width="510" alt="get all reviews" src="https://github.com/abraham-espinosa/disney-movies-api/assets/60346436/4c5c904c-e744-4030-8685-f15a9518b4c9">



