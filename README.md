# Disney Movies REST API
Get access to top disney movies and create reviews for each movie.

### Root API Endpoint `
All API URLs are relative to `https://api-disneymovies.onrender.com/v1/`

All methods are accessed through `https://api-disneymovies.onrender.com/v1/INSERT_METHOD`

For example, the /movies call is accessed at `https://api-disneymovies.onrender.com/v1/movies`

### API Endpoints
Get all movies at `/movies`

Get a movie by imdbId at `/movies/{imdbId}`

Create a new review at `/reviews`   
Body:
```
{
  "reviewBody": "Review text",
  "imdbId": "imdb ID"
}
```

Get all reviews at `/reviews`



