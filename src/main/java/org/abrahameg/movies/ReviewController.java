package org.abrahameg.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
    @GetMapping
    public ResponseEntity<List<Review>> getAllReviews(){
        //http://localhost:8080/api/v1/movies
        return new ResponseEntity<List<Review>>(reviewService.allReviews(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload){
    return new ResponseEntity<Review>(reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }
}
