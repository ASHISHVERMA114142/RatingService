package com.RatingService.RatingService.Controllers;

import com.RatingService.RatingService.Entity.Rating;
import com.RatingService.RatingService.RatingServices.RatingService;
import com.RatingService.RatingService.RatingServices.RatingServiceImpl.RatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {


    @Autowired
    private RatingServiceImpl ratingService;

    @PostMapping("/add")
    public ResponseEntity<Rating> createHotel(@RequestBody Rating rating){
        Rating rating1=ratingService.create(rating);
        return new ResponseEntity<>(rating1, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public  ResponseEntity<List<Rating>> getRatings(){
        List<Rating> allRating=ratingService.getRatings();
        return new ResponseEntity<>(allRating,HttpStatus.OK);
    }
    @GetMapping("/users/{userId}")
    public  ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable  String userId){
        List<Rating> allRating=ratingService.getRatingByUserId(userId);
        return new ResponseEntity<>(allRating,HttpStatus.OK);
    }
    @GetMapping("/hotels/{hotelId}")
    public  ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable  String hotelId){
        List<Rating> allRating=ratingService.getRatingByHotelId(hotelId);
        return new ResponseEntity<>(allRating,HttpStatus.OK);
    }
}
